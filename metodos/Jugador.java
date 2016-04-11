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
        public void setPierdeTurno() {
            this.saltar_turno = true;
        }
    //Regresar a FALSE, atributo para saltar turno
        public void resetPierdeTurno() {
            this.saltar_turno = false;
        }
    //Establecer el turno del jugador
        public void setTurno(Integer turno) {
            this.turno = turno;
        }
    //Establecer posición actual del jugador en el mapa
        public void setPosicion(String id) {
            this.posicion = id;
        }
    //Establecer nombre del jugador
        public void setNombre(String nombre) {
            this.nombre = nombre;
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
        public String getID() {
            return this.id;
        }
    //Obtener turno del jugador
        public Integer getTurno() {
            return this.turno;
        }
    //Obtener nombre del jugador
        public String getNombre() {
            return this.nombre;
        }
    //Obtener los datos de identificación del jugador
        public Jugador getDatos() {
            return null;
        }
    //Obtener el saldo actual del jugador
        public Integer getSaldo() {
            return this.saldo;
        }
    //Obtener posición actual del jugador en el mapa
        public String getPosicion() {
            return this.posicion;
        }
    //Obtener listado actual de propiedades del jugador
        public List getPropiedades() {
            return this.listaPropiedades;
        }
/*
 * 
 * GENERALES
 * 
 */
    //Restarle al jugador el saldo que se envíe
        public void reducirSaldo(Integer s) {
            this.saldo-=s;
        }
    //Sumarle al jugador el saldo que se envíe
        public void aumentarSaldo(Integer s) {
            this.saldo+=s;
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
        public void premiarVuelta() {
            premiarVuelta(premio_vuelta);
        }
        //Utilizar si se usa un premio diferente
            public void premiarVuelta(Integer premio_vuelta) {
                this.saldo+=premio_vuelta;
            }
}
