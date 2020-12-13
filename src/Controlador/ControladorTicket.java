/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Ticket;
import Modelo.Vehiculo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author user
 */
public class ControladorTicket extends Controlador<Ticket> {

    private double precioMinuto = 0.025;
    private double sub1;
    private String sal;
    private ControladorVehiculo controladorVehiculo;
    private ControladorEspacio controladorEspacio;

    public ControladorTicket(ControladorVehiculo controladorVehiculo,ControladorEspacio controladorEspacio) {
        try {
            this.setLista(recibirT());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        if (this.getLista() == null) {
            this.setLista(new ArrayList());
        }
        this.controladorVehiculo = controladorVehiculo;
        this.controladorEspacio=controladorEspacio;
    }

    public ArrayList<Ticket> recibirT() throws IOException {
        File f = new File("data/tickets.obj");
        ArrayList<Ticket> tick = null;
        if (!f.exists()) {
            f.createNewFile();
        }
        FileInputStream file = null;
        ObjectInputStream l = null;
        try {
            file = new FileInputStream(f);
            l = new ObjectInputStream(file);
            tick = (ArrayList<Ticket>) l.readObject();
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
        File f = new File("data/tickets.obj");
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

    public double getPrecioMinuto() {
        return precioMinuto;
    }

    public void setPrecioMinuto(double precioMinuto) {
        this.precioMinuto = precioMinuto;
    }

    public void ingNuevTick(int num, String placa, String modelo, String marca) {
        Date in = new Date();
        Vehiculo veh = controladorVehiculo.buscVeh(placa);
        if (veh == null) {
            veh = controladorVehiculo.ingrVeh(placa, modelo, marca);
        }
        Ticket t = new Ticket();
        t.setNumero(num);
        t.setVeh(veh);
        t.setPagado(false);
        t.setValorAPagar(0);
        t.setFechaHoraIinicio(in + "");
        this.getLista().add(t);
        try {
            guardar();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public double getSub1() {
        return sub1;
    }

    public String getSal() {
        return sal;
    }

    public String showListT(int ind) {
        return this.getLista().get(ind).toString();
    }

    public int numListT() {
        return this.getLista().size();
    }

    public Ticket buscTick(int num) {
        int ind = -1;
        for (int i = 0; i < this.getLista().size(); i++) {
            if (this.getLista().get(i).getNumero() == num) {
                ind = i;
                break;
            }
        }
        try {
            return this.getLista().get(ind);
        } catch (Exception e) {
            return null;
        }
    }

    public double pagar(int h, int m, int s, int num) throws Exception {
        Ticket tick = buscTick(num);
        if (tick != null) {
            if (!tick.isPagado()) {
                String d = tick.getFechaHoraIinicio();
                int h1 = Integer.parseInt(d.substring(11, 13));
                int m1 = Integer.parseInt(d.substring(14, 16));
                int s1 = Integer.parseInt(d.substring(17, 19));
                sub1 = (double) (m - m1) + ((double) (h - h1) * 016) + ((double) (s - s1) / 60);
                sal = h + ":" + m + ":" + s;
                return (sub1);
            } else {
                throw new Exception("Ya esta pagado");
            }
        } else {
            throw new Exception("No existe ese ticket");
        }
    }

    public void editTicket(int num, double val, String sal) {
        int ind = -1;
        for (int i = 0; i < this.getLista().size(); i++) {
            if (this.getLista().get(i).getNumero() == num) {
                ind = i;
                break;
            }
        }
        this.getLista().get(ind).setPagado(true);
        this.getLista().get(ind).setValorAPagar(val);
        this.getLista().get(ind).setFechaHoraSalida(sal);
    }
        public double reporteDeIngresos() {
        double valor = 0;
        for (Ticket ticket : this.getLista()) {
            valor += ticket.getValorAPagar();
        }
        return controladorEspacio.report()+valor;
    }
         public Ticket factura(int cedula){
        int i;
               for (i = 0; i < this.getLista().size(); i++) {
            if (this.getLista().get(i).getNumero()==cedula) {
                return this.getLista().get(i);

            }

        }
        return null;
        
    }
        
}
