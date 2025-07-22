package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
