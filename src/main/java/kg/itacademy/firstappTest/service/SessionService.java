package kg.itacademy.firstappTest.service;

import kg.itacademy.firstappTest.entity.Cinema;
import kg.itacademy.firstappTest.entity.Session;

import java.time.LocalDateTime;

public interface SessionService {
    Session create(Session session);
    Session getId(Long id);
//    Session getCinemaId(String name);
    Session findAll(LocalDateTime dateTime);
//    Session getAllCinemaName(Cinema cinema);
}
