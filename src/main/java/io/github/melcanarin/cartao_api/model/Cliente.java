package io.github.melcanarin.cartao_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigInteger;

@Entity
@Table
public class Cliente {
    @Id
    private String id;
    private String nome;
    private String email;
    private BigInteger cartao;

    private Cliente(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigInteger getCartao() {
        return cartao;
    }

    public void setCartao(BigInteger cartao) {
        this.cartao = cartao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Email: " + email + ", Cartão: " + cartao;
    }
}
