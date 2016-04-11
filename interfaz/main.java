package interfaz;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.UIManager;


public class main {
    
    public main() 
    {
        JFrame frame = new Inicio(); 
        frame.getContentPane().setLayout(null);
        frame.setSize(new Dimension(1024, 768));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible(true);
    }
    
    public static void main(String[] args)
    {
       
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new main();
    }
    /*
    public static void medida(JFrame t){
        t.getContentPane().setLayout(null);
        t.setSize(new Dimension(1024, 768));
        t.setLocationRelativeTo(null);
    }*/
    
    public static void p(String x){
        if(x != null){
            System.out.println(x);
        }else{
            System.out.println("null");
        }
    }
    
    public static void ir(JFrame de,JFrame hacia){
        hacia.setVisible(true);
        de.dispose();
    }
}
