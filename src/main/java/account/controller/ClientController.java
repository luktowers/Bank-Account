package account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import account.model.Client;
import account.repository.ClientRepository;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public List<Client> findAll(){
        List<Client> list = clientRepository.findAll();
        return list;
    }

    @GetMapping(value = "/{id}")
    public Client findById(@PathVariable Integer id){
        Client user = clientRepository.findById(id).get();
        return user;
    }
    
    @PostMapping
    public Client insert(@RequestBody Client client){
        Client result = clientRepository.save(client);
        return result;
    }
}
