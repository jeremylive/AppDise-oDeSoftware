package app;

class Trabajador 
{
    private int identificador;
    private String fechaIngresa;
    private float salario;
    private boolean estado;
    private String fechaSalida;
    private String horario;
    
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getFechaIngresa() {
        return fechaIngresa;
    }

    public void setFechaIngresa(String fechaIngresa) {
        this.fechaIngresa = fechaIngresa;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
    
}
