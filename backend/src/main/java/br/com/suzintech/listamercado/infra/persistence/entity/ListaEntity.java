package br.com.suzintech.listamercado.infra.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tb_lista")
public class ListaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lista")
    private Long id;

    @Column(name = "data_criacao", nullable = false)
    private LocalDate data;

    @Column(name = "nome_mercado", length = 50)
    private String nomeMercado;

    @Column(name = "valor_total")
    private Double valorTotal;

    @Column(name = "status")
    private Integer status;

    @OneToMany(mappedBy = "lista", cascade = CascadeType.ALL)
    private List<ItemListaEntity> items;
}
