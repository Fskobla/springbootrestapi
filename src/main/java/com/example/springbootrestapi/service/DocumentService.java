package com.example.springbootrestapi.service;

import com.example.springbootrestapi.entity.Document;

import java.util.List;

public interface DocumentService {

    // All documents
    List<Document> getAllDocuments();

    // Create document
    Document createDocument(Document document);

    // Edit document
    Document editDocument(Document document, Long documentId);

    // Delete document
    void deleteDocument(Long documentId);

}
