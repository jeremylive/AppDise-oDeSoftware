package app;

public class Cocinero 
{

    private final float salarioMinimo;
    private final float salarioMaximo;
    private String tarea;
    
    public Cocinero()
    {
        this.salarioMinimo = 15;
        this.salarioMaximo = 60;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }
    
    
}
