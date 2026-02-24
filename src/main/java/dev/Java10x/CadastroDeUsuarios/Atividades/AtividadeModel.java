package dev.Java10x.CadastroDeUsuarios.Atividades;


import dev.Java10x.CadastroDeUsuarios.Users.UserModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="tb_atividades")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AtividadeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private Long id;
    @Column(name = "nome_usuario")
    private String nome;
    @Column(name = "descricao_atividade")
    private String descricao;
    //@OneToMany - Indicando que Uma atividade pode contar N Users
    //mapeando a chave estrangeira, indicando a qual coluna se relaciona este atributo
    @OneToMany(mappedBy = "atividades")
    private List<UserModel> usuario;

}
