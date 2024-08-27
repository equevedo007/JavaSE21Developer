package com.itsolutioncompany.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor

public class ClientePropuestosNaturalLombok implements Serializable {

   private int idclientepropuestosnatural;
   private String tipodocumento;
   private String lugarnacimiento;
   private String numerodocumento;
   private String nombres;
   private String apellidop;
   private String apellidom;
   private String nombrescompleto01;
   private String nombrescompleto02;
   private Date fechanacimiento;
   private String sexo;
   private String telefono;
   private String  correo;


}