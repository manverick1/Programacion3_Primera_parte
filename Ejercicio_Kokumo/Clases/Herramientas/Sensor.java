package ar.edu.cuvl.utn.progra3.Ejercicio_Kokumo.Clases.Herramientas;

public class Sensor extends Herramienta_accionable{

    @Override
    public Double getPeso() {
        return 250.0;
    }

    @Override
    public String tipo_herramienta() {
        return "Sensor";
    }
}
