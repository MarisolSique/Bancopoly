package metodos;

import java.util.ArrayList;
import java.util.List;

public class Jugadores {
    private static List listaJugadores = new ArrayList<Jugador>();
    private Integer max_usuarios = 3;
    private Integer min_usuarios = 2;

    public void limpiarLista() {
    }

    public void nuevo(String nombre) {
    }

    public Boolean retirar(String id) {
        return Boolean.TRUE;
    }

    public Boolean devolverPropiedades(List propiedades) {
        return Boolean.TRUE;
    }

    public Boolean devolverDinero(Integer saldo) {
        return Boolean.TRUE;
    }

    public Boolean eliminar(String id) {
        return Boolean.TRUE;
    }

    public Integer cantidadUsuarios() {
        return null;
    }

    public Jugador buscar(String id) {
        return null;
    }
}
