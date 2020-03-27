package semifir.cinexo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import semifir.cinexo.domain.Assister;
import semifir.cinexo.services.impl.AssisterApiService;


@RestController
@RequestMapping("api/assisters")
public class AssisterController {
	
	@Autowired
	private AssisterApiService service;
	
	@GetMapping("")
	public List<Assister> findAll() {
		return this.service.findAll();
	}
	
	@PostMapping("")
	public Assister save(@RequestBody Assister entity) {
		return this.service.save(entity);
	}
	
}
