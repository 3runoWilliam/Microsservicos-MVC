package microsservico.vendas.micro_vendads.model;

import org.modelmapper.ModelMapper;
import org.springframework.hateoas.RepresentationModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class Vendas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DtoResponse extends RepresentationModel<DtoResponse>{
        Long id;
        // Integer codigo_estoque;
        // Integer cpf_cliente;
        // String nome_cliente;

        public static DtoResponse convertToDto(Vendas p, ModelMapper mapper) {
            DtoResponse response = mapper.map(p, DtoResponse.class);
            response.setId(p.id);
            return response;
        }
    }
}