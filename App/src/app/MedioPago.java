package app;

public class MedioPago 
{
    private int numeroTarjeta;
    private int codigoSeguridad;
    private String fechaVencimiento;
    private String tipoMedio;

    public MedioPago(int pNumeroTarjeta, int pCodigoSeguridad, String pFechaVencimiento, String pTipoMedio)
    {
            this.numeroTarjeta = pNumeroTarjeta;
            this.codigoSeguridad = pCodigoSeguridad;
            this.fechaVencimiento = pFechaVencimiento;
            this.tipoMedio = pTipoMedio;

    }


    public void setinformacion(int pNumeroTarjeta, int pCodigoSeguridad, String pFechaVencimiento, String pTipoMedio)
    {
            this.numeroTarjeta = pNumeroTarjeta;
            this.codigoSeguridad = pCodigoSeguridad;
            this.fechaVencimiento = pFechaVencimiento;
            this.tipoMedio = pTipoMedio;
    }
    
}
