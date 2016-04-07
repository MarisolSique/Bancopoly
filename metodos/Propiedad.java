package metodos;

public class Propiedad {
    //Campos por defecto
        private String id;
        private String color;
        private String nombre;
        private Integer cuota;
        private Integer precio;        
        private String cabecera;
        private String propietario;
        private String ficha_tecnica;
/*
 * 
 * INICIALIZACIÓN
 * 
 */
    //Datos por defecto de una nueva propiedad
        public Propiedad(){
            this.id = "";
            this.nombre = "";
            this.cabecera = "";
            this.precio = 0;
            this.cuota = 50;
            this.propietario = "";
            this.color = "";
            this.ficha_tecnica = "";
        } 
 /*
 * 
 * DEFINIR VALORES
 * 
 */
     //Establecer ID de la propiedad
         public void setID(String id){
                 this.id = id;
         }
    //Establecer nombre de la propiedad         
         public void setNombre(String nombre){
                 this.nombre = nombre;
         }
    //Establecer cabecera de la propiedad
         public void setCabecera(String cabecera){
                 this.cabecera = cabecera;
         }
    //Establecer precio de la propiedad
         public void setPrecio(Integer precio){
                 this.precio = precio;
         }
    //Establecer cuota por paso de la propiedad, para pagar al propietario
         public void setCuota(Integer cuota){
                 this.cuota = cuota;
         }
    //Establecer propietario de la propiedad
         public void setPropietario(String propietario){
                 this.propietario = propietario;
         }
    //Establecer color de grupo de la propiedad
         public void setColor(String color){
                 this.color = color;
         }
    //Establecer imagen para la ficha técnica secundaria de la propiedad
         public void setFicha(String ficha_tecnica){
                 this.ficha_tecnica = ficha_tecnica;
         }
/*
 * 
 * OBTENER VALORES
 * 
 */
    //Obtener todos los datos de la propiedad
        public Propiedad getDatos() {
            return null;
        }
    //Obtener el propietario actual
        public String getPropietario() {
            return "";
        }
    //Obtener precio de venta
        public String getPrecio() {
            return "";
        }
    //Obtener ruta de la imagen de la ficha técnica secundaria
        public String getFicha() {
            return "";
        }
/*
 * 
 * GENERALES
 * 
 */
}
