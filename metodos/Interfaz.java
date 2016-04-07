package metodos;

import java.util.ArrayList;
import java.util.List;

public class Interfaz {
    class Ficha {
        
        private List listaFichas = new ArrayList<Ficha>();
        
        public void crear(){
        }
        public void asignar(String id){
        }
        public void mover(Integer x,Integer y,Integer x2,Integer y2){
        }
        public void eliminar(String id){
        }
    }

    class Dados {
        public void mostrar(){
        }
        public Integer lanzar(){
            return null;
        }
    }
    
    class Cupones {        
        public Cupones(){
        }

        public void obtenerCupon(String posicion){
        }
    }

    class Bolsa {
        public Bolsa(){
        }

        public void obtenerBolsa(String posicion){
        }
    }
}
