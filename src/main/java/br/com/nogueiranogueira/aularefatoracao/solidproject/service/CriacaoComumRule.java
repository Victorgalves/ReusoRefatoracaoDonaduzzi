package br.com.nogueiranogueira.aularefatoracao.solidproject.service;

import br.com.nogueiranogueira.aularefatoracao.solidproject.dto.UsuarioDTO;
import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;
import org.springframework.stereotype.Component;

@Component("COMUM")
public class CriacaoComumRule implements CriacaoUsuarioRule {

    public Usuario criar(UsuarioDTO dto) {
        Usuario u = new Usuario(dto.nome(), dto.email(), dto.tipo());
        u.setPontos(0);
        return u;
    }
}



