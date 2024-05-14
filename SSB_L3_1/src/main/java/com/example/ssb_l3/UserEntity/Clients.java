package com.example.ssb_l3.UserEntity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@Entity
@Getter
@Setter
@Table(name = "client")
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_c;
    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "ID")
    private Photografs photografs;


    public Clients(long id_c, String name) {
        this.id_c = id_c;
        this.name = name;
    }


    public Clients() {

    }
}