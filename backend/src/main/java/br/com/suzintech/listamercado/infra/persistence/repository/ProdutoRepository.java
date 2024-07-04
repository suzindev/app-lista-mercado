package br.com.suzintech.listamercado.infra.persistence.repository;

import br.com.suzintech.listamercado.infra.persistence.entity.ProdutoEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<ProdutoEntity, Long> {
}
