package com.itsolutioncompany.dao;

import com.itsolutioncompany.interfaces.ClientePropuestosNaturalDAO;

public class MySQLDAOFactory extends DAOFactory{
    @Override
    public ClientePropuestosNaturalDAO getClientePropuestosNaturalDAO() {
        return new MySQLClientePropuestosNaturalDAO();
    }
}
