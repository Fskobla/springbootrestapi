package com.example.springbootrestapi.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Protocol")
public class Protocol {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long protocolId;

    @Column(name = "author")
    private String author;

    @Column(name = "time")
    private String time;

    @Column(name = "state")
    private StateOfProtocol stateOfProtocol;

    @OneToMany
    private List<Document> documents;

    public Protocol(){
        super();
    }

    public Protocol(long protocolId, String author, String time, StateOfProtocol stateOfProtocol, List<Document> documents) {
        setProtocolId(protocolId);
        setAuthor(author);
        setTime(time);
        setStateOfProtocol(stateOfProtocol);
        setDocuments(documents);
    }

    public long getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(long protocolId) {
        this.protocolId = protocolId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public StateOfProtocol getStateOfProtocol() {
        return stateOfProtocol;
    }

    public void setStateOfProtocol(StateOfProtocol stateOfProtocol) {
        this.stateOfProtocol = stateOfProtocol;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }
}
