package interfaz;

import java.awt.Dimension;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import metodos.*;

public class Tablero extends JFrame {

    private Boolean activo = false;
    private JButton btnRegresar = new JButton();

    public Tablero() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout(null);
        this.setSize(new Dimension(1024, 768));
        this.setLocationRelativeTo(null);
        btnRegresar.setText("INICIO");
        btnRegresar.setBounds(new Rectangle(915, 15, 81, 22));
        btnRegresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnRegresar_actionPerformed(e);
            }
        });
        this.getContentPane().add(btnRegresar, null);
       
        this.inicializarJuego();
    }
    
    private void inicializarJuego(){
        //Cargar opciones de tablero
        //Cargar jugadores
        Jugadores jugadores = new Jugadores();
        jugadores.solicitarJugadores();
        List lista = jugadores.getJugadores();
        
    
        /*for (int i=0;i<lista.size();i++) { 
            Jugador a = (Jugador)lista.get(i);
            System.out.println(a.getNombre());
        }*/
    }

    private void btnRegresar_actionPerformed(ActionEvent e) {
       
        Object[] options = {"Sí","Cancelar"};
        int n = JOptionPane.showOptionDialog(this,
            "Si regresa al inicio, se perderá todo el avance del juego\n"
            + "¿Está seguro de que quiere regresar?",
            "Antes de volver...",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.WARNING_MESSAGE,
            null,
            options,
            options[1]);
        //Sí
        if(n == 0){
            main.ir(this,new Inicio());
        }
        
        
    }
}
