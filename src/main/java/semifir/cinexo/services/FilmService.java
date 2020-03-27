package semifir.cinexo.services;

import java.util.List;

import semifir.cinexo.domain.Film;

public interface FilmService {
	public Film save(Film f);
	public void deleteByID(int id);
	public Film update(Film f);
	public List<Film> findAll();
}
