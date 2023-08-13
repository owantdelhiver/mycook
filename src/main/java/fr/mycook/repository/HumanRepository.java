package fr.mycook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.mycook.model.Human;

@Repository
public interface HumanRepository extends JpaRepository<Human, Integer> {
    
}
