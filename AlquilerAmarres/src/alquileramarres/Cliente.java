/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alquileramarres;

/**
 *
 * @author cata7
 */
public class Cliente {
    
String nombre;
    int cantidadClientes;

    public Cliente(String nombre, int cantidadClientes) {
        this.nombre = nombre;
        this.cantidadClientes = cantidadClientes;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadClientes() {
        return cantidadClientes;
    }
}
