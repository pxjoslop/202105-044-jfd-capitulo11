package edu.cibertec.capitulo11.ejercicio2;

public class SueldoService {

    private SueldoDAO sueldoDAO;
    
    public double calcularNeto(Empleado empleado){
        double neto = 0;
        //Obtener porcentajes desde la BD
        double porcentaje = sueldoDAO.obtenerPorcentajeDcto(empleado.getCargo());
        neto = empleado.getSueldoBruto() * porcentaje;
        return neto;
    }

    public SueldoDAO getSueldoDAO() {
        return sueldoDAO;
    }

    public void setSueldoDAO(SueldoDAO sueldoDAO) {
        this.sueldoDAO = sueldoDAO;
    }
}
