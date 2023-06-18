package com.example.springbootrestapi.service;

import com.example.springbootrestapi.entity.Document;
import com.example.springbootrestapi.entity.Protocol;
import com.example.springbootrestapi.entity.StateOfProtocol;

import java.util.List;

public interface ProtocolService {

    // All Protocols
    List<Protocol> getAllProtocols();

    // Create protocol
    Protocol createProtocol(Protocol protocol);

    // Edit whole protocol
    Protocol editWholeProtocol(Protocol protocol, Long protocolId);

    // Edit state of protocol
    Protocol editStateOfProtocol(Protocol protocol, Long protocolId);
}
