package br.com.nogueiranogueira.aularefatoracao.solidproject.service;
import br.com.nogueiranogueira.aularefatoracao.solidproject.dto.UsuarioDTO;
import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;


public interface CriacaoUsuarioRule {
    Usuario criar(UsuarioDTO dto);
}