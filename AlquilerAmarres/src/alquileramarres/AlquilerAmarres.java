/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alquileramarres;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author javierleo7
 */
public class AlquilerAmarres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
    Scanner scanner = new Scanner(System.in);

      
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        System.out.print("Ingrese la cantidad de clientes: ");
        int cantidadClientes = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        Cliente cliente = new Cliente(nombreCliente, cantidadClientes);

        
        System.out.print("Ingrese la matrícula del barco: ");
        String matriculaBarco = scanner.nextLine();
        System.out.print("Ingrese la eslora del barco (en metros): ");
        double esloraBarco = scanner.nextDouble();
        System.out.print("Ingrese el año de fabricación: ");
        int anioFabricacion = scanner.nextInt();
        scanner.nextLine(); 

        Barco barco = new Barco(matriculaBarco, esloraBarco, anioFabricacion);

      
        System.out.print("Ingrese la fecha de inicio (dd/MM/yyyy): ");
        String fechaInicioStr = scanner.nextLine();
        System.out.print("Ingrese la fecha de fin (dd/MM/yyyy): ");
        String fechaFinStr = scanner.nextLine();
        System.out.print("Ingrese la posición del amarre: ");
        String posicionAmarre = scanner.nextLine();

        
        Date fechaInicio = new Date(); 
        Date fechaFin = new Date(); 

        Alquiler alquiler = new Alquiler(cliente, barco, fechaInicio, fechaFin, posicionAmarre);

        
        alquiler.imprimirRecibo();

        scanner.close();
    }
}
