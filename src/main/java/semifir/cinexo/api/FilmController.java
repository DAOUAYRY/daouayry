package semifir.cinexo.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import semifir.cinexo.domain.Film;
import semifir.cinexo.errors.NotFoundException;
import semifir.cinexo.services.impl.FilmApiService;

@RestController
@RequestMapping("api/films")
@CrossOrigin()
public class FilmController {

	@Autowired
	private FilmApiService service;
	@GetMapping("")
	public List<Film> getAll() {
		return this.service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Film> findById(@PathVariable() int id) {
		return  this.service.findById(id);
	}
	
	@DeleteMapping("delete/{id}")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public String deleteById(@PathVariable() int id) {
		return "removed";
	}
	
	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public Film save(@RequestBody Film f) {
		return f;
	}
}
