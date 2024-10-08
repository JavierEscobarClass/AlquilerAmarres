/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alquileramarres;

/**
 *
 * @author cata7
 */
import java.util.Date;

public class Alquiler {
    Cliente cliente;
    Barco barco;
    Date fechaInicio;
    Date fechaFin;
    String posicionAmarre;

    public Alquiler(Cliente cliente, Barco barco, Date fechaInicio, Date fechaFin, String posicionAmarre) {
        this.cliente = cliente;
        this.barco = barco;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.posicionAmarre = posicionAmarre;
    }

    public long calcularCosto() {
        long diasOcupacion = (fechaFin.getTime() - fechaInicio.getTime()) / (1000 * 60 * 60 * 24);
        long costo = diasOcupacion * 25000; 
        return costo;
    }

    public void imprimirRecibo() {
        System.out.println("=== RECIBO DE ALQUILER ===");
        System.out.println("Nombre del cliente: " + cliente.getNombre());
        System.out.println("Cantidad de clientes: " + cliente.getCantidadClientes());
        System.out.println("Matrícula del barco: " + barco.getMatricula());
        System.out.println("Eslora del barco: " + barco.getEslora() + " metros");
        System.out.println("Año de fabricación: " + barco.getAnioFabricacion());
        System.out.println("Fecha de inicio: " + fechaInicio);
        System.out.println("Fecha de fin: " + fechaFin);
        System.out.println("Posición del amarre: " + posicionAmarre);
        System.out.println("Costo total: " + calcularCosto() + " pesos");
    }
}