package microsservicos.estoque.micro_estoque.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import microsservicos.estoque.micro_estoque.model.Estoque;
import microsservicos.estoque.micro_estoque.service.EstoqueService;

@RestController
public class EstoqueController {

    EstoqueService service;
    ModelMapper mapper;

    public EstoqueController(EstoqueService service, ModelMapper mapper){
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping("/estoque")
    public List<Estoque.DtoResponse> list(){

        return this.service.listAll().stream().map(
            elementoAtual -> {
                Estoque.DtoResponse response = Estoque.DtoResponse.convertToDto(elementoAtual, mapper);
                response.getCodigo();
                response.getQuantidade();
                return response;
            }).toList();
    }
}
