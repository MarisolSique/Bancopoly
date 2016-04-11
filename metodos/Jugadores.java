package metodos;

import java.util.ArrayList;
import java.util.List;

import java.util.UUID;

import javax.swing.JOptionPane;

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
             Jugador jugadorNuevo = new Jugador();
             jugadorNuevo.setNombre(nombre);
             listaJugadores.add(jugadorNuevo);

         }
    //Solicitar jugadores
        public void solicitarJugadores(){

            Object[] possibilities = {"2", "3"};
            String s = (String)JOptionPane.showInputDialog(
                                null,
                                "Cuántos jugadores:\n",
                                "Cuantos jugadores",
                                JOptionPane.PLAIN_MESSAGE,
                                null,
                                possibilities,
                                "2");
            if(s!=null){            
                for(int i = 1; i <= Integer.parseInt(s); i++){
    
                    String j = (String)JOptionPane.showInputDialog(
                                        null,
                                        "Ingrese nombre de jugador "+i+":\n",
                                        "Nuevo Jugador",
                                        JOptionPane.PLAIN_MESSAGE);
                    this.nuevo(j, 0);
                }
            }
        }
/*
 * 
 * OBTENER VALORES
 * 
 */
    //Obtener cantidad de usuarios en la lista de jugadores
        public Integer getCantUsuarios() {
            return listaJugadores.size();
        }
    //Obtener lista de jugadores
        public List getJugadores() {
            return listaJugadores;
        }
/*
 * 
 * GENERALES
 * 
 */
    //Vaciar lista de jugadores
        public void limpiarLista() {
            listaJugadores.clear();
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
            Jugador jugador_actual = buscar(id);
            if(jugador_actual != null){
                return listaJugadores.remove(jugador_actual);
            }
            return false;
        }
    //Buscar un jugador específico en la lista
        public Jugador buscar(String id) {
            for(Jugador jugador_actual : listaJugadores) {
                if(jugador_actual.getID().equals(id)){
                    return jugador_actual;
                }
            }
            return null;
        }
}
