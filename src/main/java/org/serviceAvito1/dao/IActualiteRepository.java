/*package org.serviceAvito1.dao;

import java.util.List;
import org.serviceAvito1.entities.actualite;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface IActualiteRepository extends JpaRepository<actualite, Long> {
    @Query("select p from actualite p where p.titre like :x")
	public Page<actualite> produitParMC(@Param("x")String mc,Pageable p);
    public List<actualite> findByTitre(String des);
    public Page<actualite> findByTitre(String des,Pageable p);
}
*/