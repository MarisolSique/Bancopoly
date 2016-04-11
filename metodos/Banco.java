package metodos;

import java.util.List;


public class Banco {
    //Campos por defecto
        private Integer saldo_sat;
        private Integer saldo_banco;
        private Integer cuota_carcel;
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
        }
 /*
 * 
 * DEFINIR VALORES
 * 
 */
     //Pagar porcentaje de impuestos (10%) del jugador, al banco
         public Boolean pagarImpuestos(List propiedades) {
             return Boolean.TRUE;
         }
     //Pagar al fondo de la SAT una cantidad, por impuestos, multa o peaje
         public void pagarSAT(Integer pago) {
             this.saldo_sat+=pago;
             //return Boolean.TRUE;
         }
     //Pagar al fondo del Banco, por compra de propiedad, cárcel o peaje
         public void pagarBanco(Integer pago) {
             this.saldo_banco+=pago;
             //return Boolean.TRUE;
         }
/*
 * 
 * OBTENER VALORES
 * 
 */
    //Obtener saldo actual del banco
        public Integer getSaldoBanco() {
            return this.saldo_banco;
        }
    //Obtener saldo actual de la SAT
        public Integer getSaldoSat() {
            return this.saldo_sat;
        }
/*
 * 
 * GENERALES
 * 
 */
    //Cobrar al Banco por concepto de premio por vuelta
        public Boolean cobrarBanco(Integer pago) {
            return Boolean.TRUE;
        }
    //Pagar al Banco y descontar del jugador actual la cuota establecida por cárcel
        public Boolean pagoPorCarcel(String id_jugador) {
            return Boolean.TRUE;
        }
}
