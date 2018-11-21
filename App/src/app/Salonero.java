package app;

import java.util.ArrayList;

public class Salonero
{
    private final float salarioMinimo;
    private final float salarioMaximo;
    private ArrayList listaPedidosPendientes;
    
    public Salonero(int pIdentificacion, String pFechaIngreso, float pSalario, boolean pEstado)
    {
        this.salarioMinimo = 15;
        this.salarioMaximo = 60;
    }

    public ArrayList getListaPedidosPendientes() {
        return listaPedidosPendientes;
    }

    public void setListaPedidosPendientes(ArrayList listaPedidosPendientes) {
        this.listaPedidosPendientes = listaPedidosPendientes;
    }

    
    
}
