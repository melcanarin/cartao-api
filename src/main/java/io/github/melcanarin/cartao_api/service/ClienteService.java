package io.github.melcanarin.cartao_api.service;

import io.github.melcanarin.cartao_api.model.Cliente;
import io.github.melcanarin.cartao_api.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Random;
import java.util.UUID;

@Service
public class ClienteService {
    private ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente cadastrar(Cliente cliente){
        var id = UUID.randomUUID().toString();
        cliente.setId(id);

        BigInteger cartao = gerarNumero();
        cliente.setCartao(cartao);
        return clienteRepository.save(cliente);
    }

    private BigInteger gerarNumero() {
        Random gerador = new Random();
        String cartao = "";

        cartao += gerador.nextInt(9) + 1;

        for (int i = 1; i < 16; i++) {
            cartao += gerador.nextInt(10);
        }

        return new BigInteger(cartao);
    }
}