package semifir.cinexo.repositories.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import semifir.cinexo.domain.Film;
import semifir.cinexo.repositories.FilmRepository;

@Repository
public interface FilmJpaRepo extends FilmRepository, JpaRepository<Film, Integer> {

}
