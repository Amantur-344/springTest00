package kg.itacademy.firstappTest.service;

import kg.itacademy.firstappTest.entity.Team;
import kg.itacademy.firstappTest.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamRepository teamRepository;
    @Override
    public Team creat(Team team) {
        return teamRepository.save(team);
    }
}
