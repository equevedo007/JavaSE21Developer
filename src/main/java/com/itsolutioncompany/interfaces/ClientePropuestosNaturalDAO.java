package com.itsolutioncompany.interfaces;

import com.itsolutioncompany.bean.ClientePropuestosNaturalBean;
import com.itsolutioncompany.bean.ClientePropuestosNaturalLombok;

import java.util.List;

public interface ClientePropuestosNaturalDAO {

    public abstract List<ClientePropuestosNaturalBean> listaClientePropuestosNatural();

    public abstract List<ClientePropuestosNaturalLombok> listaClientePropuestosNaturalLombok();

}
