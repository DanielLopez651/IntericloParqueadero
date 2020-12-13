/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Vehiculo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class ControladorVehiculo extends Controlador<Vehiculo> {
    private String err;
    public ControladorVehiculo() {
        try {
            this.setLista(recibirV());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        if (this.getLista() == null) {
            this.setLista(new ArrayList());
        }
    }

    public ArrayList<Vehiculo> recibirV() throws IOException {
        File f = new File("data/vehiculos.obj");
        ArrayList<Vehiculo> tick = null;
        if (!f.exists()) {
            f.createNewFile();
        }
        FileInputStream file = null;
        ObjectInputStream l = null;
        try {
            file = new FileInputStream(f);
            l = new ObjectInputStream(file);
            tick = (ArrayList<Vehiculo>) l.readObject();
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

        File f = new File("data/vehiculos.obj");
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

    public Vehiculo ingrVeh(String placa, String modelo, String marca) {
        Vehiculo v = new Vehiculo();
        v.setPlaca(placa);
        v.setModelo(modelo);
        v.setMarca(marca);
        this.getLista().add(v);
        return v;
    }

    public Vehiculo buscVeh(String placa) {
        int ind = -1;
        for (int i = 0; i < this.getLista().size(); i++) {
            if (this.getLista().get(i).getPlaca().equalsIgnoreCase(placa)) {
                ind = i;
                break;
            }
        }
        if (ind == -1) {
            return null;
        } else {
            return this.getLista().get(ind);
        }

    }
      public String showListV(int ind) {
        return this.getLista().get(ind).toString();
    }
      public int numListV() {
        return this.getLista().size();
    }

    public String getErr() {
        return err;
    }
      
      public boolean validarPlca(String plac) {
        plac = plac.replaceAll("-", "");
        plac = plac.replaceAll(" ", "");
        if ((plac.length() != 6)) {
            err = "Ingrese solo 6 caracteres";
            return false;
        } else {
            char x1 = plac.charAt(0), x2 = plac.charAt(1), x3 = plac.charAt(2);
            try {
                plac = plac.substring(3, 6);
                final int x = Integer.parseInt(plac);
            } catch (Exception e) {
                err = "Ingrese 3 numeros al final";
                return false;
            }
            if (!Character.isLetter(x1)) {
                err = "Ingrese 3 letras al inicio";
                return false;
            } else {
                if (!Character.isLetter(x2)) {
                    err = "Ingrese 3 letras al inicio";
                    return false;
                } else {
                    if (!Character.isLetter(x3)) {
                        err = "Ingrese 3 letras al inicio";
                        return false;
                    }
                }
            }
        }
        return true;
    }
       public Vehiculo factura(String cedula){
        int i;
               for (i = 0; i < this.getLista().size(); i++) {
            if (this.getLista().get(i).getPlaca().equals(cedula)) {
                return this.getLista().get(i);

            }

        }
        return null;
        
    }
}
