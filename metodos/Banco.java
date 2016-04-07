package metodos;

import java.util.List;


public class Banco {
    //Campos por defecto
        private Integer saldo_sat;
        private Integer saldo_banco;
        private Integer cuota_carcel;
        private String jugador_actual;
        private String jugador_siguiente;
        private Propiedades listaPropiedades;
/*
 * 
 * INICIALIZACIÓN
 * 
 */
    //Datos por defecto del banco y juego inicial
        public Banco(){
            this.saldo_sat = 0;
            this.saldo_banco = 0;
            this.cuota_carcel = 100;
            this.jugador_actual = "";
            this.jugador_siguiente = "";
            this.listaPropiedades = new Propiedades();
        }
 /*
 * 
 * DEFINIR VALORES
 * 
 */
    //Definir de manera global el jugador actual
        public void setJugadorActual(String id) {
        }
    //Obtener el jugador de turno
        public String getJugadorActual() {
         return "";
        }
    //Definir quién es el siguiente jugador
        public void setSiguienteTurno() {
        }
/*
 * 
 * OBTENER VALORES
 * 
 */
    //Obtener lista de propiedades del Banco
        public List getPropiedades() {
            return null;
        }
    //Ordenar turno de jugadores ingresados
        public void ordenarJugadores() {
        }
    //Obtener el siguiente jugador
        public void getSiguienteTurno() {
        }
    //Mostrar cuadros de diálogo solicitando los jugadores iniciales
        public void solicitarJugadores() {
        }

/*
 * 
 * GENERALES
 * 
 */
    //Pagar porcentaje de impuestos (10%) del jugador, al banco
        public Boolean pagarImpuestos(List propiedades) {
            return Boolean.TRUE;
        }
    //Pagar al fondo de la SAT una cantidad, por impuestos, multa o peaje
        public Boolean pagarSAT(Integer pago) {
            return Boolean.TRUE;
        }
    //Pagar al fondo del Banco, por compra de propiedad, cárcel o peaje
        public Boolean pagarBanco(Integer pago) {
            return Boolean.TRUE;
        }
    //Cobrar al Banco por concepto de premio por vuelta
        public Boolean cobrarBanco(Integer pago) {
            return Boolean.TRUE;
        }
    //Pagar al Banco y descontar del jugador actual la cuota establecida por cárcel
        public Boolean pagoPorCarcel(String id_jugador) {
            return Boolean.TRUE;
        }
}
