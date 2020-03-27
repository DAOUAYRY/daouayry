package semifir.cinexo.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import semifir.cinexo.domain.Film;
import semifir.cinexo.repositories.FilmRepository;
import semifir.cinexo.services.FilmService;

public class FilmApiService implements FilmService {
	private FilmRepository repo;
	
	public FilmApiService(FilmRepository repo) {
		this.repo = repo;
	}

	@Override
	public Film save(Film f) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteByID(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Film update(Film f) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Film> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
