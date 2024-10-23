package com.sena.proyecto;

import java.util.ArrayList;
import java.util.List;

public class Modelo {
    private final List<Item> items = new ArrayList<>();
    private int currentId = 0;

    public void insertar(String nombre) {
        Item item = new Item(++currentId, nombre);
        items.add(item);
        System.out.println("Insertado: " + item);
    }

    public List<Item> consultar() {
        return items;
    }

    public void actualizar(int id, String nuevoNombre) {
        for (Item item : items) {
            if (item.getId() == id) {
                item.setNombre(nuevoNombre);
                System.out.println("Actualizado: " + item);
                return;
            }
        }
        System.out.println("ID no encontrado.");
    }

    public void eliminar(int id) {
        items.removeIf(item -> item.getId() == id);
        System.out.println("Eliminado el ID: " + id);
    }
}

class Item {
    private int id;
    private String nombre;

    public Item(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Item{id=" + id + ", nombre='" + nombre + "'}";
    }
}
