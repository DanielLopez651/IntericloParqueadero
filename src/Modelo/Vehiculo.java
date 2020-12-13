package Modelo;

public class Vehiculo implements java.io.Serializable{
    
    private String placa;
    private String marca;
    private String modelo;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo: " + "Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo ;
    }
    
    
    
}
