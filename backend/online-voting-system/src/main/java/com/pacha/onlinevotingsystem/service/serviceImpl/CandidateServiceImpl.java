package com.pacha.onlinevotingsystem.service.serviceImpl;

import com.pacha.onlinevotingsystem.payload.CandidateDto;
import com.pacha.onlinevotingsystem.service.CandidateService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateServiceImpl implements CandidateService {
    @Override
    public List<CandidateDto> getAllCandidates() {
        return null;
    }

    @Override
    public CandidateDto getCandidateById(long id) {
        return null;
    }

    @Override
    public CandidateDto createCandidate(CandidateDto candidateDto) {
        return null;
    }

    @Override
    public CandidateDto updateCandidate(long id, CandidateDto candidateDto) {
        return null;
    }

    @Override
    public void deleteCandidate(long id) {

    }
}
