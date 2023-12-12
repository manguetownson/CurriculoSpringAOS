package com.example.curriculoAOS.repository;

import com.example.curriculoAOS.model.Curriculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CurriculoRepository extends JpaRepository<Curriculo, Long> {
    List<Curriculo> findByName(String name);
    List<Curriculo> findByEmail(String email);
    List<Curriculo> findByAge(int age);
    List<Curriculo> findByPhoneNumber(int phoneNumber);
    List<Curriculo> findByCurrentJob(String currentJob);
    List<Curriculo> findByExpYears(int expYears);

}
