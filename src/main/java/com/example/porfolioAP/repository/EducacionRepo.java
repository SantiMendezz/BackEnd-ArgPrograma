package com.example.porfolioAP.repository;


import com.example.porfolioAP.modelo.Educacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author HP
 */
@Repository
public interface EducacionRepo extends JpaRepository <Educacion, Long>{

}
