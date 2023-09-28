package microsservico.cliente.micro_cliente.service;

import org.springframework.stereotype.Service;

import microsservico.cliente.micro_cliente.model.Cliente;
import microsservico.cliente.micro_cliente.repository.ClienteRepository;

import java.util.List;

@Service
public class ClienteService {

    private ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }
    
    public List<Cliente> findAll(){
        return repository.findAll();
    }
}