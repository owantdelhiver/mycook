package fr.mycook.bo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.mycook.bo.model.Human;
import fr.mycook.bo.repository.HumanRepository;

@Component
public class HumanService {
    @Autowired 
    HumanRepository humanRepository;

    public List<Human> findAll() {
        return humanRepository.findAll();
    }
}
