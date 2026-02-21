package dev.Java10x.CadastroDeUsuarios.Atividades;


import dev.Java10x.CadastroDeUsuarios.Users.UserModel;
import jakarta.persistence.*;

@Entity
@Table(name="tb_atividades")
public class AtividadeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private UserModel usuario;

}
