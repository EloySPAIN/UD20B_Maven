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
	JButton b1 = new JButton("a");
	JButton b2 = new JButton("a");
	JButton b3 = new JButton("a");
	JButton b4 = new JButton("a");
	JButton b5 = new JButton("a");
	JButton b6 = new JButton("a");
	JButton b7 = new JButton("a");
	JButton b8 = new JButton("a");
	JButton b9 = new JButton("a");
	JButton b10 = new JButton("a");
	JButton b11 = new JButton("a");
	JButton b12 = new JButton("a");
	JButton b13 = new JButton("a");
	JButton b14 = new JButton("a");
	JButton b15 = new JButton("a");
	JButton b16 = new JButton("a");
	
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

		//Lo añadimos al panel
		panel.add(b1);
		b1.setBackground(Color.getHSBColor(187, 80, 60));
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(b10);
		panel.add(b11);
		panel.add(b12);
		panel.add(b13);
		panel.add(b14);
		panel.add(b15);
		panel.add(b16);


	}
	//Creamos el evento del boton
	public class Resultado implements ActionListener {
		public void actionPerformed(ActionEvent e) {

		}
		
	}
}
