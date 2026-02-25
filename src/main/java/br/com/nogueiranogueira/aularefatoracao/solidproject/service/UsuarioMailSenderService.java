package br.com.nogueiranogueira.aularefatoracao.solidproject.service;

import org.springframework.stereotype.Service;

@Service
public class UsuarioMailSenderService {

    private final EmailProvider emailProvider;

    public UsuarioMailSenderService(EmailProvider emailProvider) {
        this.emailProvider = emailProvider;
    }

    public void enviarEmailBoasVindas(String email) {
        // Lógica para enviar email de boas-vindas
        String assunto = "Bem-vindo ao nosso sistema!";
        String mensagem = "Olá! Obrigado por se cadastrar em nosso sistema.";
        emailProvider.sendEmail(email, assunto, mensagem);
    }


}
