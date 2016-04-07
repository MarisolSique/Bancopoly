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
    private Integer cuota = 50;
    private Integer premio_vuelta = 100;
    

    private void Jugador() {
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

    public Boolean aumentarSaldo(Integer saldo) {
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
    /*
     * Utilizar si se usa la cuota por defecto
     */
    public Boolean cobrarPorPaso() {
        return cobrarPorPaso(cuota);
    }
    /*
     * Utilizar si se usa una cuota diferente
     */
    public Boolean cobrarPorPaso(Integer cuota) {
        return Boolean.TRUE;
    }
    /*
     * Utilizar si se usa el premio por defecto
     */
    public Boolean premiarVuelta() {
        return premiarVuelta(premio_vuelta);
    }
    /*
     * Utilizar si se usa un premio diferente
     */
    public Boolean premiarVuelta(Integer premio_vuelta) {
        return Boolean.TRUE;
    }

    public Boolean reducirSaldo(Integer saldo) {
        return Boolean.TRUE;
    }
}
