package fr.mycook.bo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.mycook.bo.model.Human;

@Repository
public interface HumanRepository extends JpaRepository<Human, Long>{
    
}
