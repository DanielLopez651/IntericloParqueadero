/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.EspacioParqueadero;
import Modelo.Ticket;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class ControladorEspacio extends Controlador<EspacioParqueadero> {

    private ControladorVehiculo controladorVehiculo;

    public ControladorEspacio(ControladorVehiculo controladorVehiculo) {
        try {
            this.setLista(recibirE());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        if (this.getLista() == null) {
            this.setLista(new ArrayList());
        }
        this.controladorVehiculo = controladorVehiculo;
//        String x="espacio";
//        for (int i = 1; i < 51; i++) {
//            this.getLista().add(new EspacioParqueadero(i, x+i, false, false, null  , 0));
//        }
//        try {
//            guardar();
//        } catch (IOException ex) {
//            Logger.getLogger(ControladorEspacio.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    public ArrayList<EspacioParqueadero> recibirE() throws IOException {
        File f = new File("data/espacios.obj");
        ArrayList<EspacioParqueadero> tick = null;
        if (!f.exists()) {
            f.createNewFile();
        }
        FileInputStream file = null;
        ObjectInputStream l = null;
        try {
            file = new FileInputStream(f);
            l = new ObjectInputStream(file);
            tick = (ArrayList<EspacioParqueadero>) l.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            if (l != null) {
                l.close();
            }
        }
        return tick;
    }

    public void guardar() throws IOException {
        File f = new File("data/espacios.obj");
        if (!f.exists()) {
            f.createNewFile();
        }
        try {
            FileOutputStream file = new FileOutputStream(f);
            ObjectOutputStream esc = new ObjectOutputStream(file);
            esc.writeObject(this.getLista());
            esc.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
    }

    public void arrendarEspacio(String placa, int codE) {
        for (int i = 0; i < this.getLista().size(); i++) {
            if (this.getLista().get(i).getCodigoEspacio() == codE) {
                this.getLista().get(i).setArrendado(true);
                this.getLista().get(i).setVehiculo(controladorVehiculo.buscVeh(placa));
            }
        }
        try {
            guardar();
        } catch (IOException ex) {
            Logger.getLogger(ControladorEspacio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public boolean deuda(String placa) {
        for (int i = 0; i < this.getLista().size(); i++) {
            if (this.getLista().get(i).isArrendado()) {
                if (this.getLista().get(i).getVehiculo().getPlaca().equals(placa)) {
                    if (this.getLista().get(i).isDeuda()) {
                        return true;

                    } else {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public int espaciosDisponibles() {
        int conteo = 0;
        for (EspacioParqueadero espacioParqueadero : this.getLista()) {
            if (!espacioParqueadero.isArrendado()) {
                conteo++;
            }
        }
        return conteo;
    }

    public int espaciosTotales() {
        return this.getLista().size();
    }

    public EspacioParqueadero regresaEspacio(int i) {
        return this.getLista().get(i);
    }

    public void quitarArriendo(int codE) {
        for (int i = 0; i < this.getLista().size(); i++) {
            if (this.getLista().get(i).getCodigoEspacio() == codE) {
                this.getLista().get(i).setArrendado(false);
                this.getLista().get(i).setVehiculo(null);

            }
        }
        try {
            guardar();
        } catch (IOException ex) {
            Logger.getLogger(ControladorEspacio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deuda(int codE) {
        for (int i = 0; i < this.getLista().size(); i++) {
            if (this.getLista().get(i).getCodigoEspacio() == codE) {
                this.getLista().get(i).setDeuda(true);

            }
        }
        try {
            guardar();
        } catch (IOException ex) {
            Logger.getLogger(ControladorEspacio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void quitarDeuda(int codE) {
        for (int i = 0; i < this.getLista().size(); i++) {
            if (this.getLista().get(i).getCodigoEspacio() == codE) {
                this.getLista().get(i).setDeuda(false);

            }
        }
        try {
            guardar();
        } catch (IOException ex) {
            Logger.getLogger(ControladorEspacio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public double arrendar(String placa, int codE, String tipo,int valor) {
        double total=0;
        for (int i = 0; i < this.getLista().size(); i++) {
            if (this.getLista().get(i).getCodigoEspacio() == codE) {
                this.getLista().get(i).setArrendado(true);
                this.getLista().get(i).setVehiculo(controladorVehiculo.buscVeh(placa));
                switch (tipo) {
                    case "anual":
                        this.getLista().get(i).setValorArriendo(300*valor);
                        total=300*valor;
                        break;
                    case "mensual":
                        this.getLista().get(i).setValorArriendo(150*valor);
                        total=150*valor;
                        break;
                    case "semanal":
                        this.getLista().get(i).setValorArriendo(30*valor);
                        total=30*valor;
                        break;

                }
            }
        }
        
        try {
            guardar();
        } catch (IOException ex) {
            Logger.getLogger(ControladorEspacio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
    public double report(){
        double xd=0;
        for (EspacioParqueadero espacioParqueadero : this.getLista()) {
            xd+=espacioParqueadero.getValorArriendo();
        }
        return xd;
    }

}
