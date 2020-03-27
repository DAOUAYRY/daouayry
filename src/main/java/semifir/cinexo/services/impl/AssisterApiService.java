package semifir.cinexo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import semifir.cinexo.domain.Assister;
import semifir.cinexo.repositories.AssisterRepository;

@Service
public class AssisterApiService {

	@Autowired
	private AssisterRepository repo;
	

	public Assister save(Assister as) {
		return this.repo.save(as);
	}

	public void deleteByID(int id) {
		this.repo.deleteById(id);

	}

	public Assister update(Assister as) {
	    return this.repo.save(as);
	}

	public List<Assister> findAll() {
		return this.repo.findAll();
	}
}
