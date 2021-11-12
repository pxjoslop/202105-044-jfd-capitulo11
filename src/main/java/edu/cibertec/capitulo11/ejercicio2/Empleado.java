package edu.cibertec.capitulo11.ejercicio2;

public class Empleado {

    private int codigo;
    private String nombre;
    private String cargo;
    private double sueldoBruto;

    public Empleado() {}

    public Empleado(int codigo, String nombre, String cargo, double sueldoBruto){
        this.codigo = codigo;
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldoBruto = sueldoBruto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

}
