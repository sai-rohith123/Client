package com.example.Client.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Client.Entity.Client;
import com.example.Client.Repository.ClientRepository;

@Service
public class ClientService {
	
@Autowired
private ClientRepository clientRepository;

public Client addClient(Client client) {
	
	return clientRepository.save(client);
}

public List<Client> getAllClient(){
	return clientRepository.findAll();
}

public Optional<Client> getClientById(Long Id){
return clientRepository.findById(Id);
}

public Client updateClient(Long Id, Client client) {
	
	Client existing = clientRepository.findById(Id).orElseThrow(()->new RuntimeException("Client not found"));
	
	existing.setClientName(client.getClientName());
	existing.setClientEmail(client.getClientEmail());
	existing.setClientPhNumber(client.getClientPhNumber());
	
	return clientRepository.save(existing);
	
}
public Client patchupdateClient(Long Id, Client client) {
	
	Client existing = clientRepository.findById(Id).orElseThrow(()->new RuntimeException("Client not found"));
	
	existing.setClientName(client.getClientName());
	existing.setClientEmail(client.getClientEmail());
	existing.setClientPhNumber(client.getClientEmail());
	
	return clientRepository.save(existing);
	
}

public void deteteClient(Long Id) {
	clientRepository.deleteById(Id);
}






}
