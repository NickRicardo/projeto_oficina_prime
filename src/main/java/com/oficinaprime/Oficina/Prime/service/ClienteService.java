package com.oficinaprime.Oficina.Prime.service;

import com.oficinaprime.Oficina.Prime.model.Cliente;
import com.oficinaprime.Oficina.Prime.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente create(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> obterClientes() {
        return clienteRepository.findAll();
    }

    public Cliente update(Long id, Cliente cliente) {
        if (clienteRepository.existsById(id)) {
            cliente.setId(id);
            return clienteRepository.save(cliente);
        } else {
            throw new RuntimeException("Este Cliente não consta em nosso banco de dados.");
        }
    }

    public void delete(Long id) {

        if (clienteRepository.existsById(id)) {
            clienteRepository.deleteById(id);
        } else {
            throw new RuntimeException("Este Cliente não consta em nosso banco de dados.");
        }
    }
}
