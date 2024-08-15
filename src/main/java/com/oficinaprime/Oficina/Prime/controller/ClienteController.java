package com.oficinaprime.Oficina.Prime.controller;


import com.oficinaprime.Oficina.Prime.model.Cliente;
import com.oficinaprime.Oficina.Prime.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping
    public Cliente create(@RequestBody Cliente cliente) {
        return clienteService.create(cliente);
    }

    @GetMapping
    public List<Cliente> obterClientes() {
        return clienteService.obterClientes();
    }

    @PutMapping("/{id}")
    public Cliente update(@PathVariable long id, @RequestBody Cliente cliente) {
        return clienteService.update(id, cliente);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        clienteService.delete(id);
    }

}
