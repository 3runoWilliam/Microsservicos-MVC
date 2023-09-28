package microsservico.vendas.micro_vendads.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import microsservico.vendas.micro_vendads.model.Vendas;
import microsservico.vendas.micro_vendads.service.VendasService;

@RestController
public class VendasController {

    VendasService service;
    ModelMapper mapper;

    @Autowired(required=true)
    private RestTemplate restTemplate;

    public VendasController(VendasService service, ModelMapper mapper){
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping("/vendas")
    public List<Vendas.DtoResponse> list(){

        return this.service.findAll().stream().map(
            elementoAtual -> {
                Vendas.DtoResponse response = Vendas.DtoResponse.convertToDto(elementoAtual, mapper);
                return response;
            }).toList();
    }

    @GetMapping("/venda")
    public ResponseEntity<RespostaEstoqueCliente> estoque() {
        String estoque = restTemplate.getForObject("http://localhost:9002/estoque", String.class);
        String cliente = restTemplate.getForObject("http://localhost:9001/cliente", String.class);

        RespostaEstoqueCliente resposta = new RespostaEstoqueCliente(estoque, cliente);

        return ResponseEntity.ok(resposta);
    }
}