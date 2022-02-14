package E9.UD20B_Ej9.Clases;

import javax.swing.*;
import java.awt.event.ActionListener;
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

	private JButton[] botones = new JButton[16];


	
	
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
		do {
			for(int i=0;i<16;i++) {
				num=(int)(Math.random()*16);
				hola=String.valueOf(num);
				botones[i]=new JButton(""+num);
				if(!hola.equals(botones[i])) {
					cont--;
					botones[i]=new JButton(""+num);
					panel.add(botones[i]);
				}else {
					cont++;
					
				}
				System.out.println(num);
			}
		} while (cont == 8);


	}
	//Creamos el evento del boton
	public class Resultado implements ActionListener {
		public void actionPerformed(ActionEvent e) {

		}
		
	}
}
