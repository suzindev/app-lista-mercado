package br.com.suzintech.listamercado.application.usecase;

import br.com.suzintech.listamercado.application.gateway.ProdutoGateway;
import br.com.suzintech.listamercado.domain.Produto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AdicionarProdutoInteractor {

    private final ProdutoGateway produtoGateway;

    public Produto executar(Produto produto) {
        return produtoGateway.create(produto);
    }
}
