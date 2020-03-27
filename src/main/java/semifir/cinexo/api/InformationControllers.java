package semifir.cinexo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import semifir.cinexo.domain.Information;
import semifir.cinexo.services.impl.InformationApiService;

@RestController
@RequestMapping("api/informations")
public class InformationControllers {

	@Autowired
	private InformationApiService service;
	
	@GetMapping("")
	public List<Information> findAll() {
		return this.service.findAll();
	}
	
	@PostMapping("")
	public Information save(@RequestBody Information entity) {
		return this.service.save(entity);
	}
}
