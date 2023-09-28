package microsservicos.eureka.micro_eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/geral")
    public ResponseEntity<RespostaEstoqueCliente> estoque() {
        String estoque = restTemplate.getForObject("http://localhost:9002/estoque", String.class);
        String cliente = restTemplate.getForObject("http://localhost:9001/cliente", String.class);
        String vendas = restTemplate.getForObject("http://localhost:9003/venda", String.class);

        RespostaEstoqueCliente resposta = new RespostaEstoqueCliente(estoque, cliente, vendas);

        return ResponseEntity.ok(resposta);
    }
}
