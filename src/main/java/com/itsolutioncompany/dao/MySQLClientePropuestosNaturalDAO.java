package com.itsolutioncompany.dao;

import com.itsolutioncompany.bean.ClientePropuestosNaturalBean;
import com.itsolutioncompany.bean.ClientePropuestosNaturalLombok;
import com.itsolutioncompany.interfaces.ClientePropuestosNaturalDAO;
import com.itsolutioncompany.utils.ConexionBD;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQLClientePropuestosNaturalDAO implements ClientePropuestosNaturalDAO {


    CallableStatement cs = null;
    Connection cn = null;
    ResultSet rs = null;
    ClientePropuestosNaturalBean objClientePropuestoNsaturalBean = null;
    List<ClientePropuestosNaturalBean> listaBean = null;

    ClientePropuestosNaturalLombok objClientePropuestoNsaturalLombok = null;
    List<ClientePropuestosNaturalLombok> listaLombok = null;

    @Override
    public List<ClientePropuestosNaturalBean> listaClientePropuestosNatural() {

        listaBean = new ArrayList<ClientePropuestosNaturalBean>();

        try {

            ConexionBD cnx = new ConexionBD();
            cn = cnx.getConeccionBD();
            String sql = "{call sp_listaclientepropuestosnatural()}";
            cs = cn.prepareCall(sql);
            rs = cs.executeQuery();
            while (rs.next()){
                objClientePropuestoNsaturalBean = new ClientePropuestosNaturalBean(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getDate(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13)
                );

                listaBean.add(objClientePropuestoNsaturalBean);
            }

        }catch (Exception e){
            System.out.printf("Error en el metodo listaClientePropuestosNatural: %s%n", e.getMessage());
            e.printStackTrace();
        }
        finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (cs != null) {
                    cs.close();
                }
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException e) {
                System.out.printf("Error al cerrar las conexiones: %s%n", e.getMessage());
                e.printStackTrace();
            }
        }

        return listaBean;
    }

    @Override
    public List<ClientePropuestosNaturalLombok> listaClientePropuestosNaturalLombok() {


        listaLombok = new ArrayList<ClientePropuestosNaturalLombok>();

        try {

            ConexionBD cnx = new ConexionBD();
            cn = cnx.getConeccionBD();
            String sql = "{call sp_listaclientepropuestosnatural()}";
            cs = cn.prepareCall(sql);
            rs = cs.executeQuery();
            while (rs.next()){
                objClientePropuestoNsaturalBean = new ClientePropuestosNaturalBean(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getDate(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13)
                );

                listaLombok.add(objClientePropuestoNsaturalLombok);
            }

        }catch (Exception e){
            System.out.printf("Error en el metodo listaClientePropuestosNatural: %s%n", e.getMessage());
            e.printStackTrace();
        }
        finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (cs != null) {
                    cs.close();
                }
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException e) {
                System.out.printf("Error al cerrar las conexiones: %s%n", e.getMessage());
                e.printStackTrace();
            }
        }

        return listaLombok;

    }

}
