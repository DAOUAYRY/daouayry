package semifir.cinexo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import semifir.cinexo.domain.Seance;
import semifir.cinexo.repositories.SeanceRepository;

@Service
public class SeanceApiService {
	
	@Autowired
	private SeanceRepository repo;
	

	public Seance save(Seance s) {
		return this.repo.save(s);
	}

	public void deleteByID(int id) {
		this.repo.deleteById(id);

	}

	public Seance update(Seance s) {
	    return this.repo.save(s);
	}

	public List<Seance> findAll() {
		return this.repo.findAll();
	}
	

}
