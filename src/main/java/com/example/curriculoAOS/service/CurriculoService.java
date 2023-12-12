package com.example.curriculoAOS.service;

import com.example.curriculoAOS.model.Curriculo;
import com.example.curriculoAOS.repository.CurriculoRepository;
import com.example.curriculoAOS.service.exception.CurriculoNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CurriculoService {
    private final CurriculoRepository curriculoRepository;

    @Autowired
    public CurriculoService(CurriculoRepository curriculoRepository) {
        this.curriculoRepository = curriculoRepository;
    }

    public List<Curriculo> getAllCurriculos() {
        return curriculoRepository.findAll();
    }

    public Optional<Curriculo> getCurriculoById(Long id) {
        return curriculoRepository.findById(id);
    }

    public Curriculo createCurriculo(Curriculo curriculo) {
        return curriculoRepository.save(curriculo);
    }

    public Curriculo updateCurriculo(Long id, Curriculo curriculo) {
        if (curriculoRepository.existsById(id)) {
            curriculo.setId(id);
            return curriculoRepository.save(curriculo);
        } else {
            throw new CurriculoNotFoundException("Curriculo não encontrado com o ID: " + id);
        }
    }

    public void deleteCurriculo(Long id) {
        curriculoRepository.deleteById(id);
    }
}
