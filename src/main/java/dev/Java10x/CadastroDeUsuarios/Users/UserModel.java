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
    @Column(unique = true) //indica que nao pode haver dois registros iguais no BD para esta coluna
    private String email;
    private int idade;
    private String cargo;
    private int nivel;
    //Indica que N users podem ter Uma Atividade
    @ManyToOne
    @JoinColumn(name="atividade_id")//FK chave estrangeira do BD
    private AtividadeModel atividades;



}
