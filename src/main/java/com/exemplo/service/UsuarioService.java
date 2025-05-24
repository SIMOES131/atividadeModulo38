package com.exemplo.service;

import com.exemplo.model.Usuario;
import com.exemplo.repository.UsuarioRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.List;

@ApplicationScoped
public class UsuarioService {

    @Inject
    private UsuarioRepository repository;

    public void cadastrarUsuario(Usuario usuario) throws BusinessException {
        if (usuario.getNome() == null || usuario.getNome().trim().isEmpty()) {
            throw new BusinessException("Nome é obrigatório");
        }

        

        repository.salvar(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return repository.listarTodos();
    }
}