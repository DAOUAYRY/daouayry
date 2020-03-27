package semifir.cinexo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import semifir.cinexo.domain.Information;
import semifir.cinexo.repositories.InformationRepository;

@Service
public class InformationApiService {
	
	@Autowired
	private InformationRepository repo;
	

	public Information save(Information info) {
		return this.repo.save(info);
	}

	public void deleteByID(int id) {
		this.repo.deleteById(id);

	}

	public Information update(Information info) {
	    return this.repo.save(info);
	}
	public List<Information> findAll() {
		return this.repo.findAll();
	}

}
