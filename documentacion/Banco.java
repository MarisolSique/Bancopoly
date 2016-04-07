package documentacion;

import java.util.ArrayList;
import java.util.List;

import metodos.Propiedad;

public class Banco {

    private static List listaPropiedades = new ArrayList<Propiedad>();
    private Integer saldo_banco = 0;
    private Integer saldo_sat = 0;

    public Banco() {
    }

    public Boolean pagarImpuestos(List propiedades) {
        return Boolean.TRUE;
    }

    public Boolean pagarSAT(Integer pago) {
        return Boolean.TRUE;
    }

    public Boolean pagarBanco(Integer pago) {
        return Boolean.TRUE;
    }

    public Boolean pagoPorCarcel(String id_usuario) {
        return Boolean.TRUE;
    }

    public void ingresarJugadores() {
    }

    public void ordenarJugadores() {
    }

    public void setJugadorActual(String id) {
    }
}
