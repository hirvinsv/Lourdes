package com.Lourdes.Services;

import com.Lourdes.Entity.TipoInvEntity;
import com.Lourdes.Models.TipoInvModel;
import com.Lourdes.Repositories.TipoInvRepository;
import com.Lourdes.Services.Impl.TipoInvSercivesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("tipoInvServices")
public class TipoInvServices implements TipoInvSercivesImp {

    @Qualifier("tipoInvRepository")
    @Autowired
    private TipoInvRepository tipoRepository;

    @Override
    public List<TipoInvModel> listAllEnable() {
       List<TipoInvEntity> list = tipoRepository.listEnableTipoInv();
       List<TipoInvModel> result = new ArrayList<>();
      for (TipoInvEntity tipoEntity : list){
            TipoInvModel model = new TipoInvModel();
            model.setIdTipoInv(tipoEntity.getIdTipoInv());
            model.setNombreTipoInv(tipoEntity.getNombreTipoInv());
            model.setInactivo(tipoEntity.getInactivo());
            result.add(model);
      }
        return result;
    }
}
