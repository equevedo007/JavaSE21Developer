package com.itsolutioncompany.capitulo001;

import com.itsolutioncompany.bean.ClientePropuestosNaturalBean;
import com.itsolutioncompany.servicios.ServicioClientePropuestosNatural;
import org.testng.annotations.Test;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HandlingDate {

    @Test
    public void Ejercicio(){

        ServicioClientePropuestosNatural servicio = new ServicioClientePropuestosNatural();
        List<ClientePropuestosNaturalBean> lista = servicio.listaClientePropuestosNatural();
        System.out.println("El total de la Lista es : " + lista.size());

        assertThat(lista.size()).isEqualTo(100000);

    }
}
