package com.pacha.onlinevotingsystem.service;

import com.pacha.onlinevotingsystem.payload.CandidateDto;

import java.util.List;

public interface CandidateService {

    List<CandidateDto> getAllCandidates();
    CandidateDto getCandidateById(long id);

    CandidateDto createCandidate(CandidateDto candidateDto);

    CandidateDto updateCandidate(long id, CandidateDto candidateDto);

    void deleteCandidate(long id);
}
