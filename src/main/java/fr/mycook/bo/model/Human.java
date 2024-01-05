package fr.mycook.bo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Human {
    @Id @GeneratedValue @Column(name = "id")
    private Long id;
    private String name;

    @ManyToOne
    private House house;

    public Human() {}

    public Human(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public House getHouse() {
        return house;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setHouse(House house) {
        this.house = house;
    }
}
