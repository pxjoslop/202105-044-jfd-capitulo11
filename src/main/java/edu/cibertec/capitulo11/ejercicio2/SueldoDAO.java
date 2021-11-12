package edu.cibertec.capitulo11.ejercicio2;

public class SueldoDAO {

    /**
     * 
     * Este método en una implementación "normal" iría a una BD
     *     a obtener esos indicadores!!!!
     */
    public double obtenerPorcentajeDcto(String cargo) {
        System.out.println("Se obtienen desde SueldoDAO !!");
        switch (cargo) {
            case "Gerente":
                return 0.95;
            case "Asistente":
                return 0.85;
            case "Administrativo":
                return 0.50;
            default:
                return 0;
        }
    }
}
