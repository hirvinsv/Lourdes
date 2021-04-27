package com.Lourdes.Repositories;

import com.Lourdes.Entity.CategoriaInvEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("CatergoriaRepository")
public interface CategoriaRepository extends JpaRepository<CategoriaInvEntity,Integer> {

    @Query("SELECT c FROM CategoriaInvEntity c where c.Desabilitado=false")
     List<CategoriaInvEntity> listAllEnable();
}
