package com.pacha.onlinevotingsystem.service.serviceImpl;

import com.pacha.onlinevotingsystem.payload.SessionDto;
import com.pacha.onlinevotingsystem.service.SessionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionServiceImpl implements SessionService {
    @Override
    public List<SessionDto> getAllSessions() {
        return null;
    }

    @Override
    public SessionDto getSessionById(long id) {
        return null;
    }

    @Override
    public SessionDto createSession(SessionDto sessionDto) {
        return null;
    }

    @Override
    public SessionDto updateSession(long id, SessionDto sessionDto) {
        return null;
    }

    @Override
    public void deletePSession(long id) {

    }
}
