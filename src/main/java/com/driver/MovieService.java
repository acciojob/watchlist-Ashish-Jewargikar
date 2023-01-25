package com.driver;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public void addMovie(Movie movie) {
        movieRepository.addMovie(movie);
    }

    public Movie getMovie(String name) {
        return movieRepository.getMovie(name);
    }

    public void addDirector(Director director) {
        movieRepository.addDirector(director);
    }

    public Director getDirector(String name) {
        return movieRepository.getDirector(name);
    }

    public void addMovieDirectorPair(String movieName, String directorName) {
        movieRepository.addMovieDirectorPair(movieName, directorName);
    }

    public List<String> getMoviesByDirector(String directorName) {
        return movieRepository.getMoviesByDirector(directorName);
    }

    public void deleteDirector(String directorName) {
        movieRepository.deleteDirector(directorName);
    }

    public void deleteAllDirectors() {
        movieRepository.deleteAllDirectors();
    }

    public List<Movie> getAllMovies() {
        return movieRepository.getAllMovies();
    }
}