package com.danca.U4Dance.Repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.danca.U4Dance.Model.Usuario;

@Configuration
public class LoadDataInDb implements CommandLineRunner{

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        ArrayList<Usuario> novosUsers = new ArrayList<>();
        novosUsers.add(new Usuario("gabriela", passwordEncoder.encode("1234")));
        novosUsers.add(new Usuario("gilberto", passwordEncoder.encode("1234")));        

        usuarioRepository.saveAll(novosUsers);
    }
}
