package br.com.suzintech.listamercado.infra.mapper;

import br.com.suzintech.listamercado.domain.Produto;
import br.com.suzintech.listamercado.infra.persistence.entity.ProdutoEntity;
import org.springframework.stereotype.Component;

@Component
public class ProdutoMapper {

    public ProdutoEntity toEntity(Produto dto) {
        return ProdutoEntity.builder()
                .id(dto.getId())
                .nome(dto.getNome())
                .build();
    }

    public Produto toDTO(ProdutoEntity entity) {
        return Produto.builder()
                .id(entity.getId())
                .nome(entity.getNome())
                .build();
    }
}
