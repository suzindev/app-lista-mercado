package br.com.suzintech.listamercado.infra.service;

import br.com.suzintech.listamercado.application.gateway.ProdutoGateway;
import br.com.suzintech.listamercado.domain.Produto;
import br.com.suzintech.listamercado.infra.mapper.ProdutoMapper;
import br.com.suzintech.listamercado.infra.persistence.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProdutoService implements ProdutoGateway {

    private final ProdutoMapper produtoMapper;
    private final ProdutoRepository produtoRepository;

    @Override
    public Produto create(Produto produto) {
        var entity = produtoMapper.toEntity(produto);
        var savedEntity = produtoRepository.save(entity);

        return produtoMapper.toDTO(savedEntity);
    }

    @Override
    public Produto update(Produto produto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Produto> getAll() {
        return List.of();
    }

    @Override
    public List<Produto> getAllBuscarPorPalavraChave(String key) {
        return List.of();
    }

    @Override
    public Produto getPorId(Long id) {
        return null;
    }
}
