package io.github.melcanarin.cartao_api.repository;

import io.github.melcanarin.cartao_api.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository <Cliente, String> {
    List<Cliente> findByEmail(String email);
}
