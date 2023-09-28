package microsservico.vendas.micro_vendads.service;

import org.springframework.stereotype.Service;

import microsservico.vendas.micro_vendads.model.Vendas;
import microsservico.vendas.micro_vendads.repository.VendasRepository;

import java.util.List;

@Service
public class VendasService {

    private final VendasRepository repository;

    public VendasService(VendasRepository repository) {
        this.repository = repository;
    }

    public List<Vendas> findAll(){
        return repository.findAll();
    }
}