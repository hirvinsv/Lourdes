package com.Lourdes.Repositories;

import com.Lourdes.Entity.TipoInvEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("tipoInvRepository")
public interface TipoInvRepository extends JpaRepository<TipoInvEntity,Integer> {

    @Query("SELECT t FROM TipoInvEntity t WHERE t.Inactivo=false")
    List<TipoInvEntity> listEnableTipoInv();

}
