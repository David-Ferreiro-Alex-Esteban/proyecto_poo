package classes;

import java.util.UUID;

public class Mesa {

    private String codigoMesa;
    private String nombre;
    private int tamano;

    public String genCodigoMesa(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    //Getters
    public String getCodigoMesa() {
        return codigoMesa;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTamano() {
        return tamano;
    }

    //Setters
    public void setCodigoMesa(String codigoMesa) {
        this.codigoMesa = codigoMesa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    //Constructor vacio
    public Mesa() {
    }
}
