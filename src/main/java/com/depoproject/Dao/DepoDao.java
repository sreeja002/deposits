package com.depoproject.Dao;

import com.depoproject.Entity.Depo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepoDao extends JpaRepository<Depo,Long> {
}
