package metodos;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private static List listaPropiedades = new ArrayList<Propiedad>();
    private String id;
    private String nombre;
    private Integer saldo;
    private Integer turno;
    private String posicion;
    private Boolean saltar_turno;

    public void Jugador() {
    }

    public Jugador obtenerDatos() {
        return null;
    }

    public Integer obtenerSaldo() {
        return null;
    }

    public Propiedades obtenerPropiedades() {
        return null;
    }

    public String obtenerPosicion() {
        return "";
    }

    public Boolean actualizarSaldo(Integer saldo) {
        return Boolean.TRUE;
    }

    public Boolean agregarPropiedad(String id) {
        return Boolean.TRUE;
    }

    public Boolean actualizarPosicion(String id) {
        return Boolean.TRUE;
    }

    public void pierdeTurno() {
    }

    public Boolean actualizarNombre(String nombre) {
        return Boolean.TRUE;
    }

    public Boolean eliminarPropiedad(String id) {
        return Boolean.TRUE;
    }
}
