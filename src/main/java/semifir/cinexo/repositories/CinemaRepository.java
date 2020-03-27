package semifir.cinexo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import semifir.cinexo.domain.Cinema;

public interface CinemaRepository extends JpaRepository<Cinema, Integer> {

}
