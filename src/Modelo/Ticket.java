package Modelo;

public class Ticket implements java.io.Serializable{

    private int numero;
    private String fechaHoraIinicio;
    private String FechaHoraSalida;
    private double valorAPagar;
    private boolean pagado;

    private Vehiculo veh;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFechaHoraIinicio() {
        return fechaHoraIinicio;
    }

    public void setFechaHoraIinicio(String fechaHoraIinicio) {
        this.fechaHoraIinicio = fechaHoraIinicio;
    }

    public String getFechaHoraSalida() {
        return FechaHoraSalida;
    }

    public void setFechaHoraSalida(String FechaHoraSalida) {
        this.FechaHoraSalida = FechaHoraSalida;
    }

    public double getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public Vehiculo getVeh() {
        return veh;
    }

    public void setVeh(Vehiculo veh) {
        this.veh = veh;
    }

    @Override
    public String toString() {
        return "Ticket num(" + numero + "), Fecha Entrada: " + fechaHoraIinicio + ", Fecha Salida: " + FechaHoraSalida + ", Valor a Pagar: " + valorAPagar + ", Esta Pagado: " + pagado + " " + veh.toString() + '}';
    }

}
