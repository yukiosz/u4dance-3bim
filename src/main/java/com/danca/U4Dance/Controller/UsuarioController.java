package com.danca.U4Dance.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.danca.U4Dance.Model.Usuario;
import com.danca.U4Dance.Repository.UsuarioRepository;

@RestController
public class UsuarioController {
    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @PostMapping("/criar")
    public String criarUsuario(@RequestBody Usuario novoUser){
        novoUser.setPassword(
            passwordEncoder.encode(novoUser.getPassword())
        );
        Usuario usuarioCriado = usuarioRepository.save(novoUser);

        if(usuarioCriado != null)
            return "Usuário criado com sucesso!";        
        
        return "Erro ao criar usuário";
    }
}
