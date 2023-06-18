package com.example.springbootrestapi.controller;

import com.example.springbootrestapi.entity.Document;
import com.example.springbootrestapi.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @GetMapping(value = "/documents", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllDocuments(){
        return new ResponseEntity<>(this.documentService.getAllDocuments(), HttpStatus.OK);
    }

    @PostMapping(value = "/documents", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createDocument(@RequestBody Document document){
        return new ResponseEntity<>(documentService.createDocument(document), HttpStatus.OK);
    }

    @PutMapping(value = "/documents/{id}")
    public ResponseEntity editDocument(@RequestBody Document document, @PathVariable("id") Long documentId){
        return new ResponseEntity<>(this.documentService.editDocument(document, documentId), HttpStatus.OK);
    }

    @DeleteMapping(value = "/documents/{id}")
    public ResponseEntity deleteDocument(@PathVariable("id") Long documentId){
        documentService.deleteDocument(documentId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
