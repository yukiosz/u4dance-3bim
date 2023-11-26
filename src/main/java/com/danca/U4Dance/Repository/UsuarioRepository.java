package com.danca.U4Dance.Repository;

import org.springframework.data.repository.CrudRepository;

import com.danca.U4Dance.Model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}
