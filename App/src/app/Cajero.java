package app;

import java.util.ArrayList;

public class Cajero 
{
    private final float salarioMinimo;
    private final float salarioMaximo;
    private boolean esAdministrador;
    
    public Cajero(int pIdentificacion, String pFechaIngreso, float pSalario, boolean pEstado)    
    {
        this.salarioMinimo = 15;
        this.salarioMaximo = 60;
        
    }

    public boolean isEsAdministrador() {
        return esAdministrador;
    }

    public void setEsAdministrador(boolean esAdministrador) {
        this.esAdministrador = esAdministrador;
    }

    public void hacerCierre()
    {
        
    }
    
    public void procesarOrden(Trabajador trabajador, ArrayList listaProductos)
    {
        
    }
    
}
