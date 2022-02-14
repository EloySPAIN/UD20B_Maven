package Ej1.Ej1.Clases;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * 
 * @author Eloy Altozano
 *
 */
public class Ej1 extends JFrame {
	private static final long serialVersionUID = 1L;
	//Creamos las variables
	private JPanel panel;
	JTextField x = new JTextField(10);
	JTextField y = new JTextField(10);
	JLabel lb = new JLabel("Cambiame el tamaño :)");
	JLabel lbx = new JLabel("Widht: ");
	JLabel lby = new JLabel("Height: ");
	JButton boton = new JButton("Cambiar tamaño");
	public Ej1() {
		//Creamos el panel
		setTitle("Ejercicio1");
		setBounds(600, 500, 400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//Creamos el panel, el texto y el label
		panel = new JPanel();
		//Indicamos el diseño del panel
		panel.setLayout(null);
		setContentPane(panel);
		
		//Asignamos las cardinalidades y el tamaño de los componentes
		lb.setBounds(50,70,500,20);
		x.setHorizontalAlignment(SwingConstants.CENTER);//Ponemos el texto en el centro
		x.setBounds(50,100,190,20);
		lbx.setBounds(10,100,190,20);
		y.setHorizontalAlignment(SwingConstants.CENTER);//Ponemos el texto en el centro
		y.setBounds(50,130,190,20);
		lby.setBounds(8,130,190,20);
		boton.setBounds(50,160,190,20);
		//Lo añadimos al panel
		panel.add(lb);
		panel.add(x);
		panel.add(y);
		panel.add(lbx);
		panel.add(lby);
		panel.add(boton);

		boton.addActionListener(new Resultado());
	}
	//Creamos el evento del boton
	public class Resultado implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int intx = Integer.parseInt(x.getText());
			int inty = Integer.parseInt(y.getText());
			lb.setBounds(50,70,intx,inty);
		}
		
	}
}
