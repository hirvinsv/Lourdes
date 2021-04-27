package com.Lourdes.Services;

import com.Lourdes.Entity.UnidadInvEntity;
import com.Lourdes.Models.UnidadInvModel;
import com.Lourdes.Repositories.UnidadInvRepository;
import com.Lourdes.Services.Impl.UnidadInvServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("UnidadInvServices")
public class UnidadInvServices implements UnidadInvServicesImpl {

    @Qualifier("unidadinvRepository")
    @Autowired
    private UnidadInvRepository repositoryUnidad;

    @Override
    public List<UnidadInvModel> AllUnidadEnable() {
        List<UnidadInvModel> result = new ArrayList<>();
        List<UnidadInvEntity> list = repositoryUnidad.listEnableUnidadInv();
        for (UnidadInvEntity entity : list) {
            UnidadInvModel model = new UnidadInvModel();
            model.setIdUnidadInv(entity.getIdUnidadInv());
            model.setNombreUnidad(entity.getNombreUnidad());
            model.setAbreviatura(entity.getAbreviatura());
            model.setInactivo(entity.isInactivo());
            result.add(model);
        }
        return result;
    }
}