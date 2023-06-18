package com.example.springbootrestapi.service.impl;

import com.example.springbootrestapi.entity.Document;
import com.example.springbootrestapi.repository.DocumentRepository;
import com.example.springbootrestapi.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Service
public class DocumentServiceImpl implements DocumentService {

    @Autowired
    private DocumentRepository documentRepository;

    @Override
    public List<Document> getAllDocuments(){
        return documentRepository.findAll();
    }

    @Override
    public Document createDocument(Document document){
        if(document.getTime() == null){
            document.setTime(LocalDateTime.now().toString());
        }
        return documentRepository.save(document);
    }

    @Override
    public Document editDocument(Document document, Long documentId){
        Document documentDB = documentRepository.findById(documentId).get();

        if (Objects.nonNull(document.getName())
                && !"".equalsIgnoreCase(
                document.getName())) {
            documentDB.setName(
                    document.getName());
        }

        if (Objects.nonNull(document.getAuthor())
                && !"".equalsIgnoreCase(
                document.getAuthor())) {
            documentDB.setAuthor(
                    document.getAuthor());
        }

        if (Objects.nonNull(document.getTime())
                && !"".equalsIgnoreCase(
                document.getTime())) {
            documentDB.setTime(
                    document.getTime());
        }

        if (Objects.nonNull(document.getType())
                && !"".equalsIgnoreCase(
                document.getType())) {
            documentDB.setType(
                    document.getType());
        }

        return documentRepository.save(documentDB);
    }

    @Override
    public void deleteDocument(Long documentId){
        documentRepository.deleteById(documentId);
    }

}
