package br.com.masterbare.clientes.rest;

import br.com.masterbare.clientes.model.entity.Cliente;
import br.com.masterbare.clientes.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    private final  ClienteRepository repository;

    @Autowired // Injenção de dependências e são dependências obrigatórias
    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente salvar( @RequestBody Cliente cliente ){
        return repository.save(cliente);
    }


}
