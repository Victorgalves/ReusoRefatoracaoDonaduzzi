package br.com.nogueiranogueira.aularefatoracao.solidproject.service;

public interface EmailProvider {
    void sendEmail(String to, String subject, String body);
}