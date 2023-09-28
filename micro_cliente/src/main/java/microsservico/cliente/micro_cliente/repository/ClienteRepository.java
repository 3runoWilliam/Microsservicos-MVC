package microsservico.cliente.micro_cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import microsservico.cliente.micro_cliente.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}