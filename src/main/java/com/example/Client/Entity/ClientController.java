package com.example.Client.Entity;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Client.Service.ClientService;
@RequestMapping("client")
@RestController
public class ClientController {
	
@Autowired
private ClientService clientService;

@PostMapping
public Client addClient(@RequestBody Client client) {
	return clientService.addClient(client);
}

@GetMapping
public List<Client> getAllClient() {
	return clientService.getAllClient();
}
@GetMapping("/{Id}")
public Optional<Client> getClientById(@PathVariable Long Id){
	return clientService.getClientById(Id);
}

@PutMapping("/{Id}")
public Client updateClient(@PathVariable Long Id, @RequestBody Client client) {
	return clientService.updateClient(Id, client);
}

@PatchMapping("/{Id}")
public Client patchupdateClient(@PathVariable Long Id,@RequestBody Client client) {
	return clientService.patchupdateClient(Id, client);
}

@DeleteMapping("/{Id}")
public  void deteleClient(@PathVariable Long Id) {
	clientService.deteteClient(Id);
	
}



}

