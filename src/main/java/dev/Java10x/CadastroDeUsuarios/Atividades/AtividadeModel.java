package dev.Java10x.CadastroDeUsuarios.Atividades;


import dev.Java10x.CadastroDeUsuarios.Users.UserModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="tb_atividades")
public class AtividadeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    //@OneToMany - Indicando que Uma atividade pode contar N Users
    @OneToMany(mappedBy = "atividades")//mapeando a chave estrangeira, indicando a qual coluna se relaciona este atributo
    private List<UserModel> usuario;

}
