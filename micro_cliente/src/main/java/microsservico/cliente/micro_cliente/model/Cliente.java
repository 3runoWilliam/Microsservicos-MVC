package microsservico.cliente.micro_cliente.model;

import org.modelmapper.ModelMapper;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Integer cpf;
    String nome;

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DtoResponse extends RepresentationModel<DtoResponse>{
        Long id;
        Integer cpf;
        String nome;

        public static DtoResponse convertToDto(Cliente p, ModelMapper mapper) {
            DtoResponse response = mapper.map(p, DtoResponse.class);
            response.setId(p.id);
            response.setCpf(p.cpf);
            response.setNome(p.nome);
            return response;
        }
    }
}