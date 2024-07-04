package br.com.suzintech.listamercado.application.gateway;

import br.com.suzintech.listamercado.domain.Produto;

import java.util.List;

public interface ProdutoGateway {

    Produto create(Produto produto);

    Produto update(Produto produto);

    void delete(Long id);

    List<Produto> getAll();

    List<Produto> getAllBuscarPorPalavraChave(String key);

    Produto getPorId(Long id);
}
