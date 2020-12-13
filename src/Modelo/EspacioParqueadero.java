/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author user
 */
public class EspacioParqueadero implements java.io.Serializable{
    private int codigoEspacio;
    private String nombreEspacio;
    private boolean arrendado;
    private boolean deuda;
    private Vehiculo vehiculo;
    private double valorArriendo;

    public EspacioParqueadero(int codigoEspacio, String nombreEspacio, boolean arrendado, boolean deuda, Vehiculo vehiculo) {
        this.codigoEspacio = codigoEspacio;
        this.nombreEspacio = nombreEspacio;
        this.arrendado = arrendado;
        this.deuda = deuda;
        this.vehiculo = vehiculo;
    }

    public EspacioParqueadero(int codigoEspacio, String nombreEspacio, boolean arrendado, boolean deuda, Vehiculo vehiculo, double valorArriendo) {
        this.codigoEspacio = codigoEspacio;
        this.nombreEspacio = nombreEspacio;
        this.arrendado = arrendado;
        this.deuda = deuda;
        this.vehiculo = vehiculo;
        this.valorArriendo = valorArriendo;
    }

    public double getValorArriendo() {
        return valorArriendo;
    }

    public void setValorArriendo(double valorArriendo) {
        this.valorArriendo = valorArriendo;
    }

   
    

    
    
    

    public int getCodigoEspacio() {
        return codigoEspacio;
    }

    public void setCodigoEspacio(int codigoEspacio) {
        this.codigoEspacio = codigoEspacio;
    }

    public String getNombreEspacio() {
        return nombreEspacio;
    }

    public void setNombreEspacio(String nombreEspacio) {
        this.nombreEspacio = nombreEspacio;
    }

    public boolean isArrendado() {
        return arrendado;
    }

    public void setArrendado(boolean arrendado) {
        this.arrendado = arrendado;
    }

    public boolean isDeuda() {
        return deuda;
    }

    public void setDeuda(boolean deuda) {
        this.deuda = deuda;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "EspacioParqueadero{" + "codigoEspacio=" + codigoEspacio + ", nombreEspacio=" + nombreEspacio + ", arrendado=" + arrendado + ", deuda=" + deuda + ", vehiculo=" + vehiculo + ", valorArriendo=" + valorArriendo + '}';
    }


    
    
}
