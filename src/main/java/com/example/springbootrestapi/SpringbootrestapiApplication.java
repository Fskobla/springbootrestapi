package com.example.springbootrestapi;

import com.example.springbootrestapi.entity.Document;
import com.example.springbootrestapi.entity.Protocol;
import com.example.springbootrestapi.entity.StateOfProtocol;
import com.example.springbootrestapi.repository.DocumentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import java.time.LocalDateTime;


@Slf4j
@SpringBootApplication
public class SpringbootrestapiApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootrestapiApplication.class, args);
        log.info("Open in browser: http://localhost:8081");
    }

    @Override
    public void run(String... args){

        //TEST
       /* Document document1 = new Document();
        document1.setName("document1");
        document1.setAuthor("ABC");
        document1.setTime(LocalDateTime.now().toString());
        document1.setType(".pdf");

        Document document2 = new Document();
        document2.setName("document2");
        document2.setAuthor("IJK");
        document2.setTime(LocalDateTime.now().toString());
        document2.setType(".jpg");

        Protocol protocol = new Protocol();
        protocol.setAuthor("OOOO");
        protocol.setTime(LocalDateTime.now().toString());
        protocol.setStateOfProtocol(StateOfProtocol.NEW);
    */
    }


}
