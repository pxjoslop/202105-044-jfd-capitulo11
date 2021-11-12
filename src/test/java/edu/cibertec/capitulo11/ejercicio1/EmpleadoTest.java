package edu.cibertec.capitulo11.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {

    public EmpleadoTest() {
    }

    @Test
    public void testCalcularNeto() {
        Empleado empleado = new Empleado();
        empleado.setCargo("Asistente");
        empleado.setSueldoBruto(1000);
        double expResult = 850.0;
        double result = empleado.calcularNeto();
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcularNetoGerente() {
        Empleado empleado = new Empleado();
        empleado.setCargo("Gerente");
        empleado.setSueldoBruto(5000);
        double expResult = 4750.0;
        double result = empleado.calcularNeto();
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcularNetoAdmin() {
        Empleado empleado = new Empleado();
        empleado.setCargo("Administrativo");
        empleado.setSueldoBruto(2000);
        double expResult = 500.0;
        double result = empleado.calcularNeto();
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcularNetoAdmin2() {
        Empleado empleado = new Empleado();
        empleado.setCargo("Administrativo");
        empleado.setSueldoBruto(2000);
        double expResult = 1000.0;
        double result = empleado.calcularNeto();
        assertEquals(expResult, result);
    }
}
