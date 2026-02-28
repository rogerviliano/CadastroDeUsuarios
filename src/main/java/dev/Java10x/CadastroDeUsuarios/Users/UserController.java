package dev.Java10x.CadastroDeUsuarios.Users;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UserController { // A camada Controller detem os endpoints da API - CRUD basica)
    //End point inicial - teste
    @GetMapping("/boasvindasuser")
    public String boasVindas(){
       return "Bem vindo - Essa é a primeira mensagem dessa Rota";
    }

    //Metodos CRUD - CREATE, READ, UPDATE and DELETE - BASIC API

    //Adicionar Usuario (CREATE)
    @PostMapping("/criar")
    public String criarUsuario(){
        return "Ninja criado com sucesso";
    }
    //Mostrar ou pesquisar Usuario por _id (Read)
    @GetMapping("/todosPorID")
    public String mostrarTodosUsuarios() {
        return "Mostrando ninja por ID";
    }
    //Mostrar todos os usuarios (Read)
    @GetMapping("/todos")
    public String mostrarTodosUsuarios(){
        return "Mostrando todos os ninjas";
    }
    //Alterar dados de um usuario (UPDATE)
    @PutMapping("AlterarID")
    public String alterarPorId() {
        return "Usuario alterado por Id com sucesso";
    }

    //Deletar usuário (Delete)
    @DeleteMapping("/deletarID")
    public String deletarUsuarioPorId(){
        return "Usuario deletado com sucesso";
    }




}
