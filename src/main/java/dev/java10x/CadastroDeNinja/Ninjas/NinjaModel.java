package dev.java10x.CadastroDeNinja.Ninjas;

import dev.java10x.CadastroDeNinja.Missoes.MissaoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// Entity transforma uma classe em uma entidade do BD
@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String clan;
    @Column(unique = true)
    private String email;
    private int idade;

    @ManyToOne
    @JoinColumn(name = "missoes_id") //FK
    private MissaoModel missoes;

}
