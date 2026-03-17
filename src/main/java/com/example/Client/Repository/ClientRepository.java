package com.example.Client.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Client.Entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long>{

}
