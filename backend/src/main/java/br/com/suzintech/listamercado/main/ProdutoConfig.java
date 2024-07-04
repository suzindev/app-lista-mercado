package br.com.suzintech.listamercado.main;

import br.com.suzintech.listamercado.application.gateway.ProdutoGateway;
import br.com.suzintech.listamercado.application.usecase.AdicionarProdutoInteractor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProdutoConfig {

    @Bean
    AdicionarProdutoInteractor createUseCase(ProdutoGateway gateway) {
        return new AdicionarProdutoInteractor(gateway);
    }
}
