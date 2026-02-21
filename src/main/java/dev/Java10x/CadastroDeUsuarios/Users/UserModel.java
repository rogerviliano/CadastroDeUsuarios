package dev.Java10x.CadastroDeUsuarios.Users;

import dev.Java10x.CadastroDeUsuarios.Atividades.AtividadeModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="tb_cadastro_usuarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    //Indica que N users podem ter Uma Atividade
    @ManyToOne
    @JoinColumn(name="atividade_id")//FK chave estrangeira do BD
    private AtividadeModel atividades;



}
