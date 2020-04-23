package kg.itacademy.firstappTest.service;

import kg.itacademy.firstappTest.entity.Cinema;
import kg.itacademy.firstappTest.entity.Session;
import kg.itacademy.firstappTest.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class SessionServiceImpl implements SessionService {
    @Autowired
    private SessionRepository sessionRepository;

    @Override
    public Session create(Session session) {
        return sessionRepository.save(session);
    }

    @Override
    public Session getId(Long id) {
        return sessionRepository.findById(id).orElse(null);
    }

//    @Override
//    public String getCinemaId(String name) {
//        return sessionRepository.getClass(Cinema).getName(name);
//    }

    @Override
    public Session findAll(LocalDateTime dateTime) {
        return sessionRepository.findAll(dateTime);
    }

//    @Override
//    public Session getAllCinemaName(Cinema cinema) {
//        return null;
//    }
}
