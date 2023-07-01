package com.backend.portfolio.repositoy;

import com.backend.portfolio.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EducacionRepository extends JpaRepository<Educacion, Long>{    
    
    public Educacion findOneById(Long id);
    
}   
