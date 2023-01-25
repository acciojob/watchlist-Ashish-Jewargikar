package com.driver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

	@Repository
	public class MovieRepository {
	    private HashMap<String, Movie> movies = new HashMap<>();
	    private HashMap<String, Director> directors = new HashMap<>();
	    private HashMap<String, List<String>> movieDirectorPairs = new HashMap<>();

	    public void addMovie(Movie movie) {
	        movies.put(movie.getName(), movie);
	    }

	    public Movie getMovie(String name) {
	        return movies.get(name);
	    }

	    public void addDirector(Director director) {
	        directors.put(director.getName(), director);
	    }

	    public Director getDirector(String name) {
	        return directors.get(name);
	    }
	    
	    public void addMovieDirectorPair(String movieName, String directorName) {
	        List<String> movies = movieDirectorPairs.getOrDefault(directorName, new ArrayList<>());
	        movies.add(movieName);
	        movieDirectorPairs.put(directorName, movies);
	    }

	    public List<String> getMoviesByDirector(String directorName) {
	        return movieDirectorPairs.get(directorName);
	    }

	    public void deleteDirector(String directorName) {
	        directors.remove(directorName);
	        movieDirectorPairs.remove(directorName);
	    }

	    public void deleteAllDirectors() {
	        directors.clear();
	        movieDirectorPairs.clear();
	    }

	    public List<Movie> getAllMovies() {
	        return new ArrayList<>(movies.values());
	    }
	}


