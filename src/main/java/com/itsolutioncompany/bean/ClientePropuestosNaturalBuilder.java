package com.itsolutioncompany.bean;

import java.util.Date;

public class ClientePropuestosNaturalBuilder {
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
    private String correo;

    public int getIdclientepropuestosnatural() {
        return idclientepropuestosnatural;
    }

    public void setIdclientepropuestosnatural(int idclientepropuestosnatural) {
        this.idclientepropuestosnatural = idclientepropuestosnatural;
    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public String getLugarnacimiento() {
        return lugarnacimiento;
    }

    public void setLugarnacimiento(String lugarnacimiento) {
        this.lugarnacimiento = lugarnacimiento;
    }

    public String getNumerodocumento() {
        return numerodocumento;
    }

    public void setNumerodocumento(String numerodocumento) {
        this.numerodocumento = numerodocumento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getApellidom() {
        return apellidom;
    }

    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    public String getNombrescompleto01() {
        return nombrescompleto01;
    }

    public void setNombrescompleto01(String nombrescompleto01) {
        this.nombrescompleto01 = nombrescompleto01;
    }

    public String getNombrescompleto02() {
        return nombrescompleto02;
    }

    public void setNombrescompleto02(String nombrescompleto02) {
        this.nombrescompleto02 = nombrescompleto02;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    private ClientePropuestosNaturalBuilder(Builder builder) {
        this.idclientepropuestosnatural = builder.idclientepropuestosnatural;
        this.tipodocumento = builder.tipodocumento;
        this.lugarnacimiento = builder.lugarnacimiento;
        this.numerodocumento = builder.numerodocumento;
        this.nombres = builder.nombres;
        this.apellidop = builder.apellidop;
        this.apellidom = builder.apellidom;
        this.nombrescompleto01 = builder.nombrescompleto01;
        this.nombrescompleto02 = builder.nombrescompleto02;
        this.fechanacimiento = builder.fechanacimiento;
        this.sexo = builder.sexo;
        this.telefono = builder.telefono;
        this.correo = builder.correo;
    }

    public static class Builder {
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
        private String correo;

        public Builder setIdclientepropuestosnatural(int idclientepropuestosnatural) {
            this.idclientepropuestosnatural = idclientepropuestosnatural;
            return this;
        }

        public Builder setTipodocumento(String tipodocumento) {
            this.tipodocumento = tipodocumento;
            return this;
        }

        public Builder setLugarnacimiento(String lugarnacimiento) {
            this.lugarnacimiento = lugarnacimiento;
            return this;
        }

        public Builder setNumerodocumento(String numerodocumento) {
            this.numerodocumento = numerodocumento;
            return this;
        }

        public Builder setNombres(String nombres) {
            this.nombres = nombres;
            return this;
        }

        public Builder setApellidop(String apellidop) {
            this.apellidop = apellidop;
            return this;
        }

        public Builder setApellidom(String apellidom) {
            this.apellidom = apellidom;
            return this;
        }

        public Builder setNombrescompleto01(String nombrescompleto01) {
            this.nombrescompleto01 = nombrescompleto01;
            return this;
        }

        public Builder setNombrescompleto02(String nombrescompleto02) {
            this.nombrescompleto02 = nombrescompleto02;
            return this;
        }

        public Builder setFechanacimiento(Date fechanacimiento) {
            this.fechanacimiento = fechanacimiento;
            return this;
        }

        public Builder setSexo(String sexo) {
            this.sexo = sexo;
            return this;
        }

        public Builder setTelefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Builder setCorreo(String correo) {
            this.correo = correo;
            return this;
        }

        public ClientePropuestosNaturalBuilder build() {
            return new ClientePropuestosNaturalBuilder(this);
        }
    }
}