package br.com.nogueiranogueira.aularefatoracao.solidproject.service;

import br.com.nogueiranogueira.aularefatoracao.solidproject.dto.UsuarioDTO;
import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;
import org.springframework.stereotype.Component;

@Component("VIP")
public class CriacaoVipRule implements CriacaoUsuarioRule {

    public Usuario criar(UsuarioDTO dto) {
        if (dto.idade() < 18) throw new IllegalArgumentException("Vips devem ser maiores");
        Usuario u = new Usuario(dto.nome(), dto.email(), dto.tipo());
        u.setPontos(100);
        return u;
    }
}
