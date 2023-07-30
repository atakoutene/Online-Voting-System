package com.pacha.onlinevotingsystem.service;

import com.pacha.onlinevotingsystem.entity.Archive;
import com.pacha.onlinevotingsystem.payload.ArchiveDto;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ArchiveService {

    List<ArchiveDto> getAllArchives();
    ArchiveDto getArchiveById(long id) throws Exception;

    ArchiveDto createArchive(ArchiveDto archiveDto, MultipartFile winnerPlan, MultipartFile winnerPicture) throws Exception;


}
