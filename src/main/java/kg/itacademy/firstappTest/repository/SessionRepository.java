package kg.itacademy.firstappTest.repository;

import kg.itacademy.firstappTest.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface SessionRepository extends JpaRepository<Session,Long> {

    Session findAll(LocalDateTime dateTime);
}
