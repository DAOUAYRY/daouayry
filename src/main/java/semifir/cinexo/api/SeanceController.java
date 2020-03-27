package semifir.cinexo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import semifir.cinexo.domain.Seance;
import semifir.cinexo.services.impl.SeanceApiService;

@RestController
@RequestMapping("api/seances")
public class SeanceController {
	
	@Autowired
	private SeanceApiService service;
	
	@GetMapping("")
	public List<Seance> findAll() {
		return this.service.findAll();
	}
	
	@PostMapping("")
	public Seance save(@RequestBody Seance entity) {
		return this.service.save(entity);
	}

}
