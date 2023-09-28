package microsservicos.estoque.micro_estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import microsservicos.estoque.micro_estoque.model.Estoque;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
}
