package com.Lourdes.Controller;

import com.Lourdes.Entity.TipoInvEntity;
import com.Lourdes.Models.CategoriaInvModel;
import com.Lourdes.Models.InventarioModel;
import com.Lourdes.Models.TipoInvModel;
import com.Lourdes.Models.UnidadInvModel;
import com.Lourdes.Services.CategoriaServices;
import com.Lourdes.Services.TipoInvServices;
import com.Lourdes.Services.UnidadInvServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/inventario")
public class InventarioController {

    @Autowired
    @Qualifier("categoriaServices")
    private CategoriaServices servCategoria;

    @Autowired
    @Qualifier("tipoInvServices")
    private TipoInvServices servTipo;

    @Autowired
    @Qualifier("UnidadInvServices")
    private UnidadInvServices servUnidad;

    @ModelAttribute("categoriaList")
    public List<CategoriaInvModel> getCategoriaList() {
        List<CategoriaInvModel> listCategoria = servCategoria.allCategoryEnable();
        return  listCategoria;
    }

    @ModelAttribute("TipoInvList")
    public List<TipoInvModel> getTipoInvList(){
        List<TipoInvModel> listTipoInv = servTipo.listAllEnable();
        return listTipoInv;
    }

    @ModelAttribute("UnidadInvList")
    public List<UnidadInvModel> getUnidadList(){
        List<UnidadInvModel> list =  servUnidad.AllUnidadEnable();
        return list;
    }

    @GetMapping("/formInvetario")
    public String formContacto(Model model){
      model.addAttribute("InvModel",new InventarioModel());
        return "FormInventario";
    }

}
