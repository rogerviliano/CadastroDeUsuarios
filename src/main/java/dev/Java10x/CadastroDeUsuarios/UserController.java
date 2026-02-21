package dev.Java10x.CadastroDeUsuarios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {
    @GetMapping("/boasvindasuser")
    public String boasVindas(){
       return "Bem vindo - Essa é a primeira mensagem dessa Rota";
    }

}
