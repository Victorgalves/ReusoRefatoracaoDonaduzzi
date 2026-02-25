package br.com.nogueiranogueira.aularefatoracao.solidproject.repository;

import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;

import java.util.List;

public interface UsuarioBuscaRepository {
    List<Usuario> buscarPorFiltroAvancados(String nome, String email, String tipoUsuario);
}