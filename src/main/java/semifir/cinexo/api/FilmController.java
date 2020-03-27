package semifir.cinexo.api;

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

@RestController
@RequestMapping("api/films")
@CrossOrigin()
public class FilmController {
	
	@GetMapping("{id}")
	public Film findById(@PathVariable() int id) {
		if(id>100) {
			throw new NotFoundException("Pas de film ayant l'id:" + id);
		}
		
		Film f = new Film();
		f.setId(id);
		f.setTitre("Ninja Killer Instinct 3");
		return f;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public String deleteById(@PathVariable() int id) {
		return "removed";
	}
	
	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public Film save(@RequestBody Film f) {
		f.setId(123);
		return f;
	}
}
