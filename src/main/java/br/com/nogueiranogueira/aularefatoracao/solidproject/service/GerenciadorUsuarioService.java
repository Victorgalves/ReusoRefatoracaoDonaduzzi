package br.com.nogueiranogueira.aularefatoracao.solidproject.service;

import br.com.nogueiranogueira.aularefatoracao.solidproject.dto.UsuarioDTO;
import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;
import br.com.nogueiranogueira.aularefatoracao.solidproject.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class GerenciadorUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private Map<String, CriacaoUsuarioRule> regras;

    @Autowired
    private UsuarioMailSenderService mailSenderService;

    public Usuario criarUsuario(UsuarioDTO dto) {
        validarEmail(dto.email());
        validarIdade(dto.idade());

        CriacaoUsuarioRule regra = regras.get(dto.tipo().toUpperCase());

        if (regra == null) {
            throw new IllegalArgumentException("Tipo de usuário inválido: " + dto.tipo());
        }

        Usuario usuario = regra.criar(dto);
        Usuario usuarioSalvo = usuarioRepository.save(usuario);
        mailSenderService.enviarEmailBoasVindas(usuarioSalvo.getEmail());

        return usuarioSalvo;
    }

    private void validarEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("E-mail inválido");
        }
    }


    private void validarIdade(int idade){

        if (idade < 18) {

            throw new IllegalArgumentException("Usuário deve ser maior de idade");

        }
    }
}