package com.itsolutioncompany.servicios;

import com.itsolutioncompany.bean.ClientePropuestosNaturalBean;
import com.itsolutioncompany.bean.ClientePropuestosNaturalLombok;
import com.itsolutioncompany.dao.DAOFactory;
import com.itsolutioncompany.interfaces.ClientePropuestosNaturalDAO;
import com.itsolutioncompany.utils.Constante;

import java.util.List;

public class ServicioClientePropuestosNatural {

    DAOFactory fabrica = DAOFactory.getDAOFactory(Constante.ORIGEN_DE_DATOS);
    ClientePropuestosNaturalDAO objClientePropuestosNaturalDAO = fabrica.getClientePropuestosNaturalDAO();

    public List<ClientePropuestosNaturalBean> listaClientePropuestosNatural() {
        return objClientePropuestosNaturalDAO.listaClientePropuestosNatural();
    }

    public List<ClientePropuestosNaturalLombok> listaClientePropuestosNaturalLombok() {
        return objClientePropuestosNaturalDAO.listaClientePropuestosNaturalLombok();
    }


}
