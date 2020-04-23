package kg.itacademy.firstappTest.service;

import kg.itacademy.firstappTest.entity.Cinema;
import kg.itacademy.firstappTest.entity.Movie;
import kg.itacademy.firstappTest.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieRepository movieRepository;
    @Override
    public Movie getMovieName(String name) {
        return movieRepository.findAll().getClass(Cinema).getName(name);
        //Моя идея заключалось в том чтобы принять имя поискать и показать юзеру уже session вытаскивая по id
        //но этот метод слишком длинный
    }
}
