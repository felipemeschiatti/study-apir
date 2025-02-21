package com.github.felipemeschiatti.study_apir;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")

public class ControllerProduto {

 @PostMapping
public  ResponseEntity<String> create(){
    return ResponseEntity.status(201).body("Produto cadastrado");
}
 @PutMapping
public ResponseEntity<String> update(){
    return ResponseEntity.status(202).body("Produto atualzado");
}
 @GetMapping
public ResponseEntity<String> find(){
    return ResponseEntity.status(203).body("maça");
}
 @DeleteMapping
public ResponseEntity<Void> delete(){
    return ResponseEntity.status(204).build();
   
}




}
