package smart.games.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import smart.games.api.model.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long> {

}
