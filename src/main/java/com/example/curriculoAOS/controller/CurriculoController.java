package com.example.curriculoAOS.controller;

import com.example.curriculoAOS.model.Curriculo;
import com.example.curriculoAOS.service.CurriculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/curriculo")
public class CurriculoController {

    private final CurriculoService curriculoService;

    @Autowired
    public CurriculoController(CurriculoService curriculoService) {
        this.curriculoService = curriculoService;
    }
    @GetMapping
    public ResponseEntity<List<Curriculo>> getAllCurriculos() {
        List<Curriculo> curriculos = curriculoService.getAllCurriculos();
        return new ResponseEntity<>(curriculos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curriculo> getCurriculoById(@PathVariable Long id) {
        Optional<Curriculo> curriculoOptional = curriculoService.getCurriculoById(id);

        if (curriculoOptional.isPresent()) {
            Curriculo curriculo = curriculoOptional.get();
            return new ResponseEntity<>(curriculo, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping
    public ResponseEntity<Curriculo> createCurriculo(@RequestBody Curriculo curriculo) {
        Curriculo createdCurriculo = curriculoService.createCurriculo(curriculo);
        return new ResponseEntity<>(createdCurriculo, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Curriculo> updateCurriculo(@PathVariable Long id, @RequestBody Curriculo curriculo) {
        Curriculo updatedCurriculo = curriculoService.updateCurriculo(id, curriculo);
        return new ResponseEntity<>(updatedCurriculo, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCurriculo(@PathVariable Long id) {
        curriculoService.deleteCurriculo(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
