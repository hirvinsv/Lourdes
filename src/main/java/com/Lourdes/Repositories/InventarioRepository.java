package com.Lourdes.Repositories;

import com.Lourdes.Entity.InventarioEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository("InventarioRepository")
public interface InventarioRepository extends CrudRepository<InventarioEntity, Integer> {
}
