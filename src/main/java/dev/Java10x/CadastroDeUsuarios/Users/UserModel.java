package dev.Java10x.CadastroDeUsuarios.Users;

import dev.Java10x.CadastroDeUsuarios.Atividades.AtividadeModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="tb_cadastro_usuarios")
public class UserModel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    //Indica que N user podem ter Uma Atividade
    @ManyToOne
    @JoinColumn(name="atividade_id")
    private AtividadeModel atividades;
    public UserModel() {
    }

    public UserModel(String email, String nome, int idade) {
        this.email = email;
        this.nome = nome;
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
