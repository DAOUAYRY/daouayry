package semifir.cinexo.repositories.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import semifir.cinexo.domain.Film;
import semifir.cinexo.repositories.FilmRepository;

@Repository
public interface FilmJpaRepo extends FilmRepository, JpaRepository<Film, Integer> {

}
