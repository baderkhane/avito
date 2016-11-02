package org.serviceAvito1.dao;


import org.serviceAvito1.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<Client, Long> {
	public Client findByLogin(String Login);
}
