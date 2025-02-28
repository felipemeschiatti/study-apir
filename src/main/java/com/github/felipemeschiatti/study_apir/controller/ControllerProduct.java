package com.github.felipemeschiatti.study_apir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.felipemeschiatti.study_apir.service.ProductService;

@RestController
@RequestMapping("produtos")

public class ControllerProduct {

    @Autowired
    private ProductService ProductService;
 @PostMapping
public  ResponseEntity<String> create(){

    ProductService.crateProducts(null);
    return ResponseEntity.status(201).body("Produto cadastrado");
}
 @PutMapping
public ResponseEntity<String> update(){

    ProductService.updateProduct(null, null);
    return ResponseEntity.status(202).body("Produto atualzado");
}
 @GetMapping
public ResponseEntity<String> find(){

    ProductService.getProductsByID(null);
    return ResponseEntity.status(203).body("maça");
}
 @DeleteMapping
public ResponseEntity<Void> delete(){

    ProductService.deleteProduct(null, null);
    return ResponseEntity.status(204).build();
   
}




}
