package com.sena.proyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Modelo modelo = new Modelo();
        
        while (true) {
            System.out.println("1. Insertar");
            System.out.println("2. Consultar");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            
            int option = scanner.nextInt();
            scanner.nextLine();  
            
            switch (option) {
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    modelo.insertar(nombre);
                    break;
                case 2:
                    System.out.println("Consulta:");
                    modelo.consultar().forEach(System.out::println);
                    break;
                case 3:
                    System.out.print("Ingrese el ID a actualizar: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Ingrese el nuevo nombre: ");
                    String nuevoNombre = scanner.nextLine();
                    modelo.actualizar(id, nuevoNombre);
                    break;
                case 4:
                    System.out.print("Ingrese el ID a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    modelo.eliminar(idEliminar);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
