package app;

import java.util.ArrayList;

public class Pedido 
{

    private int information;
    private String fechaActual;
    private String fechaEntrega;
    private String medioEntrega;
    private float costo;
    private float comision;
    private Trabajador trabajador;
    private ArrayList listaProductos;

    public Pedido(String medioEntrega, ArrayList pListaProductos)
    {
            this.fechaEntrega = medioEntrega;
            this.listaProductos = pListaProductos;
    }

    public Pedido(Trabajador salonero, ArrayList pListaProductos)
    {
            this.trabajador = salonero;
            this.listaProductos = pListaProductos;
    }

}
