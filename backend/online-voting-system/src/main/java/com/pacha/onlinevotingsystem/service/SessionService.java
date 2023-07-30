package com.pacha.onlinevotingsystem.service;

import com.pacha.onlinevotingsystem.payload.SessionDto;

import java.util.List;

public interface SessionService {

    List<SessionDto> getAllSessions();
    SessionDto getSessionById(long id);

    SessionDto createSession(SessionDto sessionDto);

    SessionDto updateSession(long id, SessionDto sessionDto);

    void deletePSession(long id);
}
