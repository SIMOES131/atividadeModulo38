package com.exemplo.controller;

import com.exemplo.model.Usuario;
import com.exemplo.service.UsuarioService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class UsuarioController {

    private Usuario usuario = new Usuario();

    @Inject
    private UsuarioService service;

    public String salvar() {
        try {
            service.cadastrarUsuario(usuario);
            return "sucesso?faces-redirect=true";
        } catch (Exception e) {
            // Tratar erro
            return null;
        }
    }

    // Getters e Setters
    public Usuario getUsuario() {
        return usuario;
    }
    
    @Named
    @RequestScoped
    public class UsuarioController {

        private Usuario usuario = new Usuario();

        @Inject
        private UsuarioService service;

        public String salvar() {
            try {
                service.cadastrarUsuario(usuario);
                return "sucesso?faces-redirect=true";
            } catch (Exception e) {
                // Tratar erro
                return null;
            }
        }

        public Usuario getUsuario() {
            return usuario;
        }

        public void setUsuario(Usuario usuario) {
            this.usuario = usuario;
        }
    }

}