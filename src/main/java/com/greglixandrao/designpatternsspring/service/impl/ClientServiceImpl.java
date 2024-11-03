package com.greglixandrao.designpatternsspring.service.impl;

import com.greglixandrao.designpatternsspring.model.Client;
import com.greglixandrao.designpatternsspring.model.Endereco;
import com.greglixandrao.designpatternsspring.repository.ClientRepository;
import com.greglixandrao.designpatternsspring.repository.EnderecoRepository;
import com.greglixandrao.designpatternsspring.service.ClienteService;
import com.greglixandrao.designpatternsspring.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientServiceImpl implements ClienteService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> findById(Long id) {
        Optional<Client> client = clientRepository.findById(id);
        return client;
    }

    @Override
    public void insert(Client client) {
        addClientWithCep(client);
    }

    @Override
    public void update(Long id, Client client) {
        Optional<Client> clientDB = clientRepository.findById(id);
        if (clientDB.isPresent()) {
            addClientWithCep(client);
        }
    }

    @Override
    public void delete(Long id) {
        clientRepository.deleteById(id);
    }

    private void addClientWithCep(Client client) {
        String cep = client.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        client.setEndereco(endereco);
        clientRepository.save(client);
    }
}
