package com.itsolutioncompany.dao;

import com.itsolutioncompany.interfaces.ClientePropuestosNaturalDAO;

public abstract class DAOFactory {

    public static final int MYSQL = 1;
    public static final int ORACLE = 2;
    public static final int SQLSERVER = 3;
    public static final int POSTGRESQL = 4;

    public abstract ClientePropuestosNaturalDAO getClientePropuestosNaturalDAO();

    public static DAOFactory getDAOFactory(int whichFactory) {
        switch (whichFactory) {
            case MYSQL:
                return new MySQLDAOFactory();

            default:
                return null;
        }
    }
}
