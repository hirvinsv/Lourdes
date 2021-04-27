package com.Lourdes.Services.Impl;


import com.Lourdes.Models.UnidadInvModel;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UnidadInvServicesImpl {

    public List<UnidadInvModel> AllUnidadEnable();

}
