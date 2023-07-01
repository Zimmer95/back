package com.backend.portfolio.repositoy;

import com.backend.portfolio.model.ExperienciaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ExperienciaLaboralRepository  extends JpaRepository<ExperienciaLaboral, Long>{
    public ExperienciaLaboral findOneById(Long id);
}
