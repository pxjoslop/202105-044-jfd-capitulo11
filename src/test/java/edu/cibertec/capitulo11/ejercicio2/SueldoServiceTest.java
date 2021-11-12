package edu.cibertec.capitulo11.ejercicio2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

public class SueldoServiceTest {

    public SueldoServiceTest() { }
    
    SueldoService sueldoService;
    
    @BeforeEach
    public void init()
    {
        sueldoService = new SueldoService();
        //quitamos la "conexión a la bd"
        //sueldoService.setSueldoDAO(new SueldoDAO());  //Inicia la conexión a BD
        // Ponemos el Mock en su lugar
        SueldoDAO sd = Mockito.mock(SueldoDAO.class);
        Mockito.when(sd.obtenerPorcentajeDcto("Gerente")).thenReturn(0.95);
        Mockito.when(sd.obtenerPorcentajeDcto("Asistente")).thenReturn(0.85);
        Mockito.when(sd.obtenerPorcentajeDcto("Administrativo")).thenReturn(0.50);
        sueldoService.setSueldoDAO(sd);
    }

    @Test
    public void testCalcularNeto() {
        Empleado empleado = new Empleado(1, "Juan", "Asistente", 1000);
        double expResult = 850.0;
        double result = sueldoService.calcularNeto(empleado);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcularNetoGerente() {
        Empleado empleado = new Empleado(2, "Maria", "Gerente", 5000);
        double expResult = 4750.0;
        double result = sueldoService.calcularNeto(empleado);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcularNetoAdmin() {
        Empleado empleado = new Empleado(3, "Marcos", "Administrativo", 2000);
        double expResult = 500.0;
        double result = sueldoService.calcularNeto(empleado);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcularNetoAdmin2() {
        Empleado empleado = new Empleado(3, "Marcos", "Administrativo", 2000);
        double expResult = 1000.0;
        double result = sueldoService.calcularNeto(empleado);
        assertEquals(expResult, result);
    }
}
