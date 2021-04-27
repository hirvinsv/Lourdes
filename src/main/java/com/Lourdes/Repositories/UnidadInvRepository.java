package com.Lourdes.Repositories;

import com.Lourdes.Entity.TipoInvEntity;
import com.Lourdes.Entity.UnidadInvEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("unidadinvRepository")
public interface UnidadInvRepository extends JpaRepository<UnidadInvEntity,Integer> {

    @Query("SELECT t FROM UnidadInvEntity t WHERE t.Inactivo=false")
    List<UnidadInvEntity> listEnableUnidadInv();

}
