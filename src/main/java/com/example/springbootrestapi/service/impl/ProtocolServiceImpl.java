package com.example.springbootrestapi.service.impl;

import com.example.springbootrestapi.entity.Document;
import com.example.springbootrestapi.entity.Protocol;
import com.example.springbootrestapi.entity.StateOfProtocol;
import com.example.springbootrestapi.repository.DocumentRepository;
import com.example.springbootrestapi.repository.ProtocolRepository;
import com.example.springbootrestapi.service.ProtocolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Service
public class ProtocolServiceImpl implements ProtocolService {

    @Autowired
    private ProtocolRepository protocolRepository;

    @Override
    public List<Protocol> getAllProtocols(){
        return protocolRepository.findAll();
    }

    @Override
    public Protocol createProtocol(Protocol protocol){
        if(protocol.getTime() == null){
            protocol.setTime(LocalDateTime.now().toString());
        }

        if(protocol.getDocuments() == null || protocol.getDocuments().isEmpty()){
            return null;
        }else {
            return protocolRepository.save(protocol);
        }
    }

    @Override
    public Protocol editWholeProtocol(Protocol protocol, Long protocolId){
        Protocol protocolDB = protocolRepository.findById(protocolId).get();

        if (Objects.nonNull(protocol.getAuthor())
                && !"".equalsIgnoreCase(
                protocol.getAuthor())) {
            protocolDB.setAuthor(
                    protocol.getAuthor());
        }

        if (Objects.nonNull(protocol.getTime())
                && !"".equalsIgnoreCase(
                protocol.getTime())) {
            protocolDB.setTime(
                    protocol.getTime());
        }

        if (Objects.nonNull(protocol.getStateOfProtocol())
                && !"".equalsIgnoreCase(
                protocol.getStateOfProtocol().toString())) {
            protocolDB.setStateOfProtocol(
                    protocol.getStateOfProtocol());
        }

        if (Objects.nonNull(protocol.getTime())
                && !"".equalsIgnoreCase(
                protocol.getTime())) {
            protocolDB.setTime(
                    protocol.getTime());
        }

        protocolDB.setDocuments(protocol.getDocuments());

        return protocolRepository.save(protocolDB);
    }

    @Override
    public Protocol editStateOfProtocol(Protocol protocol, Long protocolId){
        Protocol protocolDB = protocolRepository.findById(protocolId).get();

        protocolDB.setStateOfProtocol(protocol.getStateOfProtocol());

        return protocolRepository.save(protocolDB);
    }


}
