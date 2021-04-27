package com.Lourdes.Services.Impl;



import com.Lourdes.Models.CategoriaInvModel;
import com.Lourdes.Repositories.CategoriaRepository;

import java.util.List;

public interface CategoriaServicesImp {

    public abstract List<CategoriaInvModel> allCategoryEnable();
    public abstract List<CategoriaInvModel> allList();
}
