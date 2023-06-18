package com.example.springbootrestapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Document")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long documentId;

    @Column(name= "name")
    private String name;

    @Column(name= "author")
    private String author;

    @Column(name = "time")
    private String time;

    @Column(name = "type")
    private String type;

    public Document(){
        super();
    }

    public Document(Long documentId, String name, String author, String time, String type){
        setDocumentId(documentId);
        setName(name);
        setAuthor(author);
        setTime(time);
        setType(type);
    }

    public long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(long documentId) {
        this.documentId = documentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
