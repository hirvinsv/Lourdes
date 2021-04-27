package com.Lourdes.Services;

import com.Lourdes.Entity.CategoriaInvEntity;
import com.Lourdes.Models.CategoriaInvModel;
import com.Lourdes.Repositories.CategoriaRepository;
import com.Lourdes.Services.Impl.CategoriaServicesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("categoriaServices")
public class CategoriaServices implements CategoriaServicesImp {

    @Autowired
    @Qualifier("CatergoriaRepository")
    private CategoriaRepository catRepository;


    @Override
    public List<CategoriaInvModel> allCategoryEnable() {
     List<CategoriaInvEntity> list=  catRepository.listAllEnable();
     List<CategoriaInvModel> listModel =  new ArrayList<>();
        for (CategoriaInvEntity categoria:list) {
            CategoriaInvModel modelTemp = new CategoriaInvModel();
            modelTemp.setIdCategoria(categoria.getIdCategoria());
            modelTemp.setNombreCategoria(categoria.getNombreCategoria());
            modelTemp.setActivo(categoria.isDesabilitado());
          listModel.add(modelTemp);
        }
        return listModel;
    }

    @Override
    public List<CategoriaInvModel> allList() {
        List<CategoriaInvEntity> list=  catRepository.findAll();
        List<CategoriaInvModel> listModeltemp =  new ArrayList<>();
        for (CategoriaInvEntity categoria:list) {
            CategoriaInvModel modelTemp = new CategoriaInvModel();
            modelTemp.setIdCategoria(categoria.getIdCategoria());
            modelTemp.setNombreCategoria(categoria.getNombreCategoria());
            modelTemp.setActivo(categoria.isDesabilitado());
            listModeltemp.add(modelTemp);
        }
        return listModeltemp;
    }

}
