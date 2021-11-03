package com.accenture.repository;

import com.accenture.entity.Maestro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface maestroRepository extends JpaRepository <Maestro, Integer>{

    //boolean exists(String bintar);

}
