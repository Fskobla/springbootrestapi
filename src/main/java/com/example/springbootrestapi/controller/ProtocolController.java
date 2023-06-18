package com.example.springbootrestapi.controller;

import com.example.springbootrestapi.entity.Document;
import com.example.springbootrestapi.entity.Protocol;
import com.example.springbootrestapi.entity.StateOfProtocol;
import com.example.springbootrestapi.service.ProtocolService;
import com.example.springbootrestapi.utils.ErrorMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProtocolController {

    @Autowired
    private ProtocolService protocolService;

    @GetMapping(value = "/protocols", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllProtocols(){
        return new ResponseEntity<>(this.protocolService.getAllProtocols(), HttpStatus.OK);
    }

    @PostMapping(value = "/protocols", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createProtocol(@RequestBody Protocol protocol){
        try{
            return new ResponseEntity<>(protocolService.createProtocol(protocol), HttpStatus.OK);
        }catch(IllegalArgumentException | NullPointerException exception){
            return new ResponseEntity<>(new ErrorMessage("Protocol doesnt contains any document"), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PutMapping(value = "/protocols/{id}")
    public ResponseEntity editWholeProtocol(@RequestBody Protocol protocol, @PathVariable("id") Long protocolId){
        return new ResponseEntity<>(this.protocolService.editWholeProtocol(protocol, protocolId), HttpStatus.OK);
    }

    @PutMapping(value = "/protocols/{id}/state")
    public ResponseEntity editStateOfProtocol(@RequestBody Protocol protocol, @PathVariable("id") Long protocolId){
        return new ResponseEntity<>(this.protocolService.editStateOfProtocol(protocol, protocolId), HttpStatus.OK);
    }
}
