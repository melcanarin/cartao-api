package io.github.melcanarin.cartao_api.controller;

import io.github.melcanarin.cartao_api.model.Cliente;
import io.github.melcanarin.cartao_api.repository.ClienteRepository;
import io.github.melcanarin.cartao_api.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cliente")
public class ClienteController {
    private ClienteRepository clienteRepository;
    private ClienteService service;

    @Autowired
    public ClienteController(ClienteRepository clienteRepository, ClienteService service) {
        this.clienteRepository = clienteRepository;
        this.service = service;
    }

    @PostMapping
    public Cliente cadastrar(@RequestBody Cliente cliente) {
        Cliente novoCliente = service.cadastrar(cliente);
        System.out.println("Cliente cadastrado: " + novoCliente);
        return novoCliente;
    }

    @GetMapping
    public List<Cliente> buscar(@RequestParam("email") String email){
        return clienteRepository.findByEmail(email);
    }
}