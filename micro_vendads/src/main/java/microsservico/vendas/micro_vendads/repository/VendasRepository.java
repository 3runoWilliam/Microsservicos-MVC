package microsservico.vendas.micro_vendads.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import microsservico.vendas.micro_vendads.model.Vendas;

public interface VendasRepository extends JpaRepository<Vendas, Long> {
}
