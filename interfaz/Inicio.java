package interfaz;

import java.awt.Dimension;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Inicio extends JFrame {

    private JButton jButton1 = new JButton();
    private JButton jButton2 = new JButton();

    public Inicio()
    {   
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        //main.medida(this);
        this.getContentPane().setLayout(null);
        this.setSize(new Dimension(1024, 768));
        this.setLocationRelativeTo(null);
        
        this.setTitle("Bienvenido a BANCOPOLY");
        jButton1.setText("jButton1");
        jButton1.setBounds(new Rectangle(565, 250, 81, 22));
        jButton2.setText("JUGAR");
        jButton2.setBounds(new Rectangle(280, 240, 115, 95));
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton2_actionPerformed(e);
            }
        });
        this.getContentPane().add(jButton2, null);
        this.getContentPane().add(jButton1, null);
    }

    private void jButton2_actionPerformed(ActionEvent e) {
        main.ir(this, new Tablero());
    }
}
