package E9.UD20B_Ej9.Clases;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
/**
 * 
 * @author Eloy, Jordi, Miquel Angel
 *
 */
public class Juego extends JFrame {
    private static final long serialVersionUID = 1L;
    //Creamos las variables
    private JPanel panel;
    private int num=16;
    private JButton[] botones = new JButton[16];
    private char[] letras = {'A','A','B','B','C','C','D','D','E','E','F','F','G','G','H','H'};

    
    
    public Juego() {
        //Creamos el panel
        setTitle("Ejercicio9");
        setBounds(600, 500, 400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        //Creamos el panel, el texto y el label
        panel = new JPanel();
        //Indicamos el diseño del panel
        panel.setLayout(null);
        setContentPane(panel);
        this.getContentPane().setBackground(Color.blue);
        panel.setBackground(Color.blue);
        //Creamos el grid
        panel.setLayout(new GridLayout (4,4, 2,2));
        int num;
        String hola;
        int cont = 0;
        
        ArrayList < Integer > aNum = new ArrayList<Integer>();

        AleatorioNoRepetido(16, aNum);
        
            for(int i=0;i<16;i++) {
                hola=String.valueOf(aNum.get(i));
                botones[i]=new JButton(""+letras[aNum.get(i)]);
                if(!hola.equals(botones[i])) {
                    cont--;
                    botones[i]=new JButton(""+letras[aNum.get(i)]);
                    panel.add(botones[i]);
                }else {
                    cont++;
                    
                }
            }


    }
    //Creamos el evento del boton
    public class Resultado implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
        
    }
    
    public ArrayList<Integer> AleatorioNoRepetido(int lo, ArrayList<Integer> aNum){
    	
    	int pos;
    	
    	
        for (int i = 0; i < 16 ; i++) {
          pos = (int) Math.floor(Math.random() * lo );
          while (aNum.contains(pos)) {
            pos = (int) Math.floor(Math.random() * lo );
          }
          aNum.add(pos);
        }
    

        
        for (int i = 0; i < 16 ; i++) {
        	System.out.println(aNum.get(i));
        	
        }
        
        return aNum;
    	
    }
    
}