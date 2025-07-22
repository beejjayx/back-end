package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
}
