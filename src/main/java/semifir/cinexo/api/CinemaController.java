package semifir.cinexo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import semifir.cinexo.domain.Cinema;
import semifir.cinexo.services.impl.CinemaApiService;

@RestController
@RequestMapping("api/cinemas")
public class CinemaController {
	
	@Autowired
	private CinemaApiService service;
	
	@GetMapping("")
	public List<Cinema> findAll() {
		return this.service.findAll();
	}
	
	@PostMapping("")
	public Cinema save(@RequestBody Cinema entity) {
		return this.service.save(entity);
	}

}
