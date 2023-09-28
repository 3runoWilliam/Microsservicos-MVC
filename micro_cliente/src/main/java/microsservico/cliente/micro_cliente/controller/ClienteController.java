package microsservico.cliente.micro_cliente.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import microsservico.cliente.micro_cliente.model.Cliente;
import microsservico.cliente.micro_cliente.service.ClienteService;

@RestController
public class ClienteController {

    ClienteService service;
    ModelMapper mapper;

    public ClienteController(ClienteService service, ModelMapper mapper){
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping("/cliente")
    public List<Cliente.DtoResponse> list(){

        return this.service.findAll().stream().map(
            elementoAtual -> {
                Cliente.DtoResponse response = Cliente.DtoResponse.convertToDto(elementoAtual, mapper);
                return response;
            }).toList();
    }
}