package com.example.ssb_l3.Control;

import com.example.ssb_l3.UserEntity.Clients;
import com.example.ssb_l3.UserEntity.Photografs;
import com.example.ssb_l3.Repository.ClientsRepository;
import com.example.ssb_l3.Repository.PhotografsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ControlApi {
    @Autowired
    ClientsRepository clientRepository;
    @Autowired
    PhotografsRepository photografsRepository;

    @GetMapping(value = "/")
    public String index() {
        return "<h2>Hello</h2>\n" +
                "Check our photografs: <a href=\"/getPhotografs\">photografs</a><br>\n" +
                "Check our clients: <a href=\"/getClients\">clients</a><br>";
    }

    @GetMapping(value ="/getClients")
    public List<Clients> GetClients() {
        return clientRepository.findAll();
    }

    @GetMapping(value = "/getPhotografs")
    public List<Photografs> GetPhotografs() {
        return photografsRepository.findAll();
    }

}