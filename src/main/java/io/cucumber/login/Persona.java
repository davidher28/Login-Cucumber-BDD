package io.cucumber.login;

public class Persona {
    private final String nombre;
    private int distancia;
    private String mensaje;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getNombre() {
        return nombre;
    }
}
