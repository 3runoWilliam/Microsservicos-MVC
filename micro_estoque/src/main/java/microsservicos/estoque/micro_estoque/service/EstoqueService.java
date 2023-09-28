package microsservicos.estoque.micro_estoque.service;

import org.springframework.stereotype.Service;

import microsservicos.estoque.micro_estoque.model.Estoque;
import microsservicos.estoque.micro_estoque.repository.EstoqueRepository;

import java.util.List;

@Service
public class EstoqueService {

    private final EstoqueRepository repository;

    public EstoqueService(EstoqueRepository repository) {
        this.repository = repository;
    }
    public List<Estoque> listAll(){
        return  repository.findAll();
    }
    public List<Estoque> findAll(){
        return repository.findAll();
    }
}