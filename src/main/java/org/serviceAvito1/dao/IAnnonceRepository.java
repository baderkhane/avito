package org.serviceAvito1.dao;

 
import org.serviceAvito1.entities.Annonce;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public interface IAnnonceRepository extends JpaRepository<Annonce, Long>{

}