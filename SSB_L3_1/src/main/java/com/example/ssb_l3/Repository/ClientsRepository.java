package com.example.ssb_l3.Repository;

import com.example.ssb_l3.UserEntity.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientsRepository extends JpaRepository<Clients,Long> {
}