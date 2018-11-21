package app;

public class Entrada 
{
    private int identificacion;
    private String nombre;
    private float precio;
    private String descripcion;
    private boolean estado;
    private int tiempoPreparacion;
        
    public Entrada(String pNombre, float pPrecio, String pDescripcion, boolean pEstado)
    {
        this.nombre = pNombre;
        this.precio = pPrecio;
        this.descripcion = pDescripcion;
        this.estado = pEstado;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }
    
    /**
     * CODIGO FUENTE
     */
    
    
    
    
}

    
