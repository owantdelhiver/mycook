package fr.mycook.bo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.mycook.bo.model.House;
import fr.mycook.bo.repository.HouseRepository;

@Component
public class HouseService {
    @Autowired
    HouseRepository houseRepository;

    public List<House> findAll() {
        return houseRepository.findAll();
    }
}


