package com.example.springbootrestapi.repository;

import com.example.springbootrestapi.entity.Protocol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProtocolRepository extends JpaRepository<Protocol, Long> {

}
