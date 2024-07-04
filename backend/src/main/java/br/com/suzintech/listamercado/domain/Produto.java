package br.com.suzintech.listamercado.domain;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

    private Long id;
    private String nome;
}
