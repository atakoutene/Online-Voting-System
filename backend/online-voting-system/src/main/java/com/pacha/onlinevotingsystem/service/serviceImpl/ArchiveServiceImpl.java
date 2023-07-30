package com.pacha.onlinevotingsystem.service.serviceImpl;

import com.pacha.onlinevotingsystem.entity.Archive;
import com.pacha.onlinevotingsystem.exception.ResourceNotFoundException;
import com.pacha.onlinevotingsystem.payload.ArchiveDto;
import com.pacha.onlinevotingsystem.repository.ArchiveRepository;
import com.pacha.onlinevotingsystem.service.ArchiveService;
import com.pacha.onlinevotingsystem.utils.FileUtills;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArchiveServiceImpl implements ArchiveService {

    private ModelMapper modelMapper;
    private ArchiveRepository archiveRepository;

    public ArchiveServiceImpl(ModelMapper modelMapper, ArchiveRepository archiveRepository) {
        this.modelMapper = modelMapper;
        this.archiveRepository = archiveRepository;
    }

    @Override
    public List<ArchiveDto> getAllArchives() {
        List<ArchiveDto> archiveDtos = archiveRepository.findAll().stream()
                .map(this::mapToDto).toList();


        return archiveDtos.stream().map(e-> {
                    try {
                        return decompress(e, e.getWinnerPlan(), e.getWinnerPicture());
                    } catch (Exception ex) {
                        throw new RuntimeException(ex);
                    }
                }

        ).toList();
    }

    @Override
    public ArchiveDto getArchiveById(long id) throws Exception {

        ArchiveDto archiveDto = mapToDto(archiveRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException(
                "Archive", "Id", id
        )));
        decompress(archiveDto, archiveDto.getWinnerPlan(), archiveDto.getWinnerPicture());



        return archiveDto;
    }

    @Override
    public ArchiveDto createArchive(ArchiveDto archiveDto, MultipartFile winnerPlan, MultipartFile winnerPicture) throws Exception {
        compress(archiveDto, winnerPlan, winnerPicture);

        return mapToDto(archiveRepository.save(mapToEntity(archiveDto)));
    }



    private ArchiveDto mapToDto(Archive archive) {

        return modelMapper.map(archive, ArchiveDto.class);
    }

    private Archive mapToEntity(ArchiveDto archiveDto) {

        return modelMapper.map(archiveDto, Archive.class);
    }

    private void compress(ArchiveDto archiveDto, MultipartFile winnerPlan, MultipartFile winnerPicture) throws Exception {
        archiveDto.setWinnerPicture(FileUtills.compressFile(winnerPicture.getBytes()));
        archiveDto.setWinnerPlan(FileUtills.compressFile(winnerPlan.getBytes()));
    }

    private ArchiveDto decompress(ArchiveDto archiveDto, byte[] winnerPlan, byte[] winnerPicture) throws Exception {
        archiveDto.setWinnerPicture(FileUtills.deCompressFile(archiveDto.getWinnerPicture()));
        archiveDto.setWinnerPlan(FileUtills.deCompressFile(archiveDto.getWinnerPlan()));
        return archiveDto;
    }
}
