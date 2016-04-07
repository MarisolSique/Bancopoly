package metodos;

import java.util.ArrayList;
import java.util.List;

public class Jugadores {
    //Campos por defecto
        private List<Jugador> listaJugadores;
        private Integer max_usuarios;
        private Integer min_usuarios;
/*
 * 
 * INICIALIZACIÓN
 * 
 */
    //Datos por defecto del grupo de jugadores
        public Jugadores(){
            this.listaJugadores = new ArrayList<Jugador>();
            this.max_usuarios = 3;
            this.min_usuarios = 2;
        }
 /*
 * 
 * DEFINIR VALORES
 * 
 */
    //Agregar un nuevo jugador a la lista
         public void nuevo(String nombre, Integer turno) {
         }
/*
 * 
 * OBTENER VALORES
 * 
 */
    //Obtener cantidad de usuarios en la lista de jugadores
        public Integer getCantUsuarios() {
            return null;
        }
    //Obtener lista de jugadores
        public Integer getJugadores() {
            return null;
        }
/*
 * 
 * GENERALES
 * 
 */
    //Vaciar lista de jugadores
        public void limpiarLista() {
        }
    //Retirar a un jugador del juego, sin borrarlo de la lista
        public Boolean retirar(String id) {
            return Boolean.TRUE;
        }
        //Devolver al banco las propiedades del jugador retirado
            public Boolean devolverPropiedades(List propiedades) {
                return Boolean.TRUE;
            }
        //Devolver al banco el dinero del jugador retirado
            public Boolean devolverDinero(Integer saldo) {
                return Boolean.TRUE;
            }
    //Eliminar a un jugador del juego    
        public Boolean eliminar(String id) {
            return Boolean.TRUE;
        }
    //Buscar un jugador específico en la lista
        public Jugador buscar(String id) {
            return null;
        }
}
