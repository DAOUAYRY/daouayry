package semifir.cinexo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import semifir.cinexo.domain.Cinema;
import semifir.cinexo.repositories.CinemaRepository;

@Service
public class CinemaApiService {

	@Autowired
	private CinemaRepository repo;
	

	public Cinema save(Cinema c) {
		return this.repo.save(c);
	}

	public void deleteByID(int id) {
		this.repo.deleteById(id);

	}

	public Cinema update(Cinema c) {
	    return this.repo.save(c);
	}

	public List<Cinema> findAll() {
		return this.repo.findAll();
	}
}
