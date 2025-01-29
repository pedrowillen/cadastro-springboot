package dev.java10x.CadastroDeNinja.Missoes;

import dev.java10x.CadastroDeNinja.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome_missao;
    private String descricao_missao;
    private char rank_dificuldade;
    private boolean status_missao;

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

    public MissaoModel() {
    }

    public MissaoModel(Long id, String nome_missao, String descricao_missao, char rank_dificuldade, boolean status_missao) {
        this.id = id;
        this.nome_missao = nome_missao;
        this.descricao_missao = descricao_missao;
        this.rank_dificuldade = rank_dificuldade;
        this.status_missao = status_missao;
    }
}
