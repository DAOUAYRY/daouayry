package semifir.cinexo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import semifir.cinexo.domain.Film;
import semifir.cinexo.repositories.impl.FilmJpaRepo;
import semifir.cinexo.repositories.impl.FilmOMDBRepository;
import semifir.cinexo.repositories.FilmRepository;
import semifir.cinexo.services.FilmService;

@Service
public class FilmApiService implements FilmService {
	private FilmJpaRepo repo;
	
	public FilmApiService(FilmJpaRepo repo) {
		this.repo = repo;
	}

	@Override
	public Film save(Film f) {
		// TODO Auto-generated method stub
		return this.repo.save(f);
	}

	@Override
	public void deleteByID(int id) {
		// TODO Auto-generated method stub
		this.repo.deleteById(id);
		return;
	}

	@Override
	public Film update(Film f) {
		// TODO Auto-generated method stub
		return this.repo.save(f);
		 
	}
	public  Optional<Film> findById(int id) {
		// TODO Auto-generated method stub
		return this.repo.findById(id);

	}
	@Override
	public List<Film> findAll() {
		// TODO Auto-generated method stub
		return this.repo.findAll();
	}

}
