package com.example.ssb_l3.UserEntity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "photograf")
public class Photografs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String name;
    @OneToMany(mappedBy = "photografs", cascade = CascadeType.ALL)
    private Set<Clients> clients;

    public Photografs(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Photografs() {

    }

}