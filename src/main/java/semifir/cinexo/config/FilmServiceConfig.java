package semifir.cinexo.config;

import java.util.List;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import semifir.cinexo.domain.Film;
import semifir.cinexo.repositories.impl.FilmJpaRepo;
import semifir.cinexo.repositories.impl.FilmOMDBRepository;
import semifir.cinexo.services.FilmService;
import semifir.cinexo.services.impl.FilmApiService;

@Configuration
@ConditionalOnClass(semifir.cinexo.services.impl.FilmApiService.class)
public class FilmServiceConfig {
	
	@Bean("apiMovieService")
	@Profile("prod")
	public FilmService apiMovieService(FilmOMDBRepository repo) {
		FilmService service = new FilmApiService(repo);
		return service;
	}
	
	@Bean("bddMovieService")
	public FilmService bddMovieService(FilmJpaRepo repo) {
		FilmService service = new FilmApiService(repo);
		return service;
	}


}
