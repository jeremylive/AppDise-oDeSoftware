package app;

import java.util.ArrayList;

public class Cliente 
{
	
    private String password;
    private int cedula;
    private String nombre;
    private String apellido;
    private int telefono;
    private String direccion;
    private int edad;
    private char sexo;
    private ArrayList listaPedidos;
    private ArrayList listaMediosPago;


    public Cliente(String pPassword, int pCedula, String pNombre, String pApellido, int pTelefono, String pDireccion, int pEdad, char pSexo)
    {
            this.password = pPassword;
            this.cedula = pCedula;
            this.nombre = pNombre;
            this.apellido = pApellido;
            this.telefono = pTelefono;
            this.direccion = pDireccion;
            this.edad = pEdad;
            this.sexo = pSexo;
    }

    public void hacerPedidoOnLine(String fechaEntrega, ArrayList listaPedidos)
    {

    }
    
}
