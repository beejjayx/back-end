package ProjetoSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ProjetoSpring.domain.Produto;

public interface IProdutoRepository extends JpaRepository<Produto, Long> {
}
