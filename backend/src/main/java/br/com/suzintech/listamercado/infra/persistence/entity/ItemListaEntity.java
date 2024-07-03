package br.com.suzintech.listamercado.infra.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tb_itemlista")
public class ItemListaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_item")
    private Long id;

    @Column(name = "quantidade")
    private Double quantidade;

    @Column(name = "preco_total")
    private Double precoTotal;

    @Column(name = "concluido")
    private Integer concluido;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private ProdutoEntity produto;

    @ManyToOne
    @JoinColumn(name = "lista_id")
    private ListaEntity lista;
}
