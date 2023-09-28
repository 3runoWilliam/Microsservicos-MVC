package microsservicos.estoque.micro_estoque.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import org.springframework.hateoas.RepresentationModel;
import org.modelmapper.ModelMapper;

@Entity
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Integer codigo;
    Integer quantidade;

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DtoResponse extends RepresentationModel<DtoResponse>{
        Long id;
        Integer codigo;
        Integer quantidade;

        public static DtoResponse convertToDto(Estoque p, ModelMapper mapper) {
            DtoResponse response = mapper.map(p, DtoResponse.class);
            response.setId(p.id);
            response.setCodigo(p.codigo);
            response.setQuantidade(p.quantidade);
            return response;
        }
    }
}