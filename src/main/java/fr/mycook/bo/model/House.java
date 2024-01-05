package fr.mycook.bo.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class House {
    @Id @GeneratedValue @Column(name = "id")
    private Long id;
    private String name;
    
    @OneToMany(mappedBy = "house")
    private List<Human> humans;



    public House() {}

    public House (Long id, String name) {
        this.id = id;
        this.name = name;
    }

        public House (Long id, String name, List<Human> humans) {
        this.id = id;
        this.name = name;
        this.humans = humans;
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public List<Human> getHumans() {
        return humans;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHumans(List<Human> humans) {
        this.humans = humans;
    }
}
