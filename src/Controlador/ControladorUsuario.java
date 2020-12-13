/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class ControladorUsuario extends Controlador<Usuario> {
    private boolean log;

    public ControladorUsuario() {
        try {
            this.setLista(recibirT());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        if (this.getLista() == null) {
            this.setLista(new ArrayList());
        }
        log=false;

    }

    public ArrayList<Usuario> recibirT() throws IOException {
        File f = new File("data/usuario.obj");
        ArrayList<Usuario> tick = null;
        if (!f.exists()) {
            f.createNewFile();
        }
        FileInputStream file = null;
        ObjectInputStream l = null;
        try {
            file = new FileInputStream(f);
            l = new ObjectInputStream(file);
            tick = (ArrayList<Usuario>) l.readObject();
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
        File f = new File("data/usuario.obj");
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

    public boolean log(String cedula) {
        int i;
        for (Usuario usuario : this.getLista()) {
            
        }
        for (i = 0; i < this.getLista().size(); i++) {
            if (this.getLista().get(i).getCedula().equals(cedula)) {
                return true;

            }

        }
        return false;

    }

    public void setLog(boolean log) {
        this.log = log;
    }
    public Usuario factura(String cedula){
        int i;
               for (i = 0; i < this.getLista().size(); i++) {
            if (this.getLista().get(i).getCedula().equals(cedula)) {
                return this.getLista().get(i);

            }

        }
        return null;
        
    }

}
