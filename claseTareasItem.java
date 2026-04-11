/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UStorie;

public class TareasItem {
       int id;
    String titulo;
    String fecha;
    String estado;

    public TareasItem(int id, String titulo, String fecha, String estado) {
        this.id = id;
        this.titulo = titulo;
        this.fecha = fecha;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return titulo;
    }
}
