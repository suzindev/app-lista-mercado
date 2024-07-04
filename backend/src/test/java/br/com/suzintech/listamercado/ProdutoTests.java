package br.com.suzintech.listamercado;

import br.com.suzintech.listamercado.application.usecase.AdicionarProdutoInteractor;
import br.com.suzintech.listamercado.domain.Produto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class ProdutoTests {

    @Autowired
    private AdicionarProdutoInteractor adicionarProdutoInteractor;

    @Test
    void shouldStoreProduct() {
        Assertions.assertNotNull(adicionarProdutoInteractor.executar(Produto.builder()
                .nome("Teste")
                .build()));
    }
}
