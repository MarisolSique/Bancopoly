package metodos;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Jugador {
    //Campos por defecto
        private String id;
        private String nombre;
        private Integer saldo;
        private Integer turno;
        private Integer cuota;
        private String posicion;
        private Boolean saltar_turno;
        private Integer premio_vuelta;
        private List listaPropiedades = new ArrayList<Propiedad>();    
/*
 * 
 * INICIALIZACIÓN
 * 
 */
    //Datos por defecto de un nuevo jugador
        public Jugador() {
            this.id = UUID.randomUUID().toString();
            this.nombre = "";
            this.saldo = 500;
            this.turno = 0;
            this.posicion = "Entrada";
            this.saltar_turno = false;
            this.cuota = 50;
            this.premio_vuelta = 100;
        }
/*
 * 
 * DEFINIR VALORES
 * 
 */
    //Establecer que el jugador pierde 1 turno
        public void setTurnoMenos() {
            this.saltar_turno = true;
        }
    //Regresar a FALSE, atributo para saltar turno
        public void resetTurnoMenos() {
            this.saltar_turno = false;
        }
    //Establecer el turno del jugador
        public void setTurno(Integer turno) {
            this.turno = turno;
        }
    //Establecer posición actual del jugador en el mapa
        public Boolean setPosicion(String id) {
            return Boolean.TRUE;
        }
    //Establecer nombre del jugador
        public Boolean setNombre(String nombre) {
            return Boolean.TRUE;
        }
    //Agregar nueva propiedad a la lista del jugador
        public Boolean setNuevaPropiedad(String id) {
            return Boolean.TRUE;
        }
/*
 * 
 * OBTENER VALORES
 * 
 */
    //Obtener turno del jugador
        public String getTurno() {
            return "";
        }
    //Obtener los datos de identificaciòn del jugador
        public Jugador getDatos() {
            return null;
        }
    //Obtener el saldo actual del jugador
        public Integer getSaldo() {
            return null;
        }
    //Obtener posición actual del jugador en el mapa
        public String getPosicion() {
            return "";
        }
    //Obtener listado actual de propiedades del jugador
        public Propiedades getPropiedades() {
            return null;
        }
/*
 * 
 * GENERALES
 * 
 */
    //Restarle al jugador el saldo que se envíe
        public Boolean reducirSaldo(Integer saldo) {
            return Boolean.TRUE;
        }
    //Sumarle al jugador el saldo que se envíe
        public Boolean aumentarSaldo(Integer saldo) {
            return Boolean.TRUE;
        }
    //Eliminar propiedad de la lista del jugador
        public Boolean eliminarPropiedad(String id) {
            return Boolean.TRUE;
        }
    //Utilizar si se usa la cuota por defecto
        public Boolean cobrarPorPaso() {
            return cobrarPorPaso(cuota);
        }
        //Utilizar si se usa una cuota diferente
            public Boolean cobrarPorPaso(Integer cuota) {
                return Boolean.TRUE;
            }
    //Utilizar si se usa el premio por defecto
        public Boolean premiarVuelta() {
            return premiarVuelta(premio_vuelta);
        }
        //Utilizar si se usa un premio diferente
            public Boolean premiarVuelta(Integer premio_vuelta) {
                return Boolean.TRUE;
            }
}
