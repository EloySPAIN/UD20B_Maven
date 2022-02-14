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
	JTextField texto = new JTextField(10);
	JComboBox comboBox = new JComboBox<>();
	JLabel lb = new JLabel("Escribe el titulo de una pelicula");
	JLabel lb2 = new JLabel("Peliculas");
	JButton boton = new JButton("Añadir");
	public Ej1() {
		//Creamos el panel
		setTitle("Saludador");
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
		lb2.setBounds(350,70,500,20);
		comboBox.setBounds(350,100,150,20);
		texto.setHorizontalAlignment(SwingConstants.CENTER);//Ponemos el texto en el centro
		texto.setBounds(50,100,190,20);
		boton.setBounds(50,160,190,20);
		//Lo añadimos al panel
		panel.add(lb);
		panel.add(lb2);
		panel.add(texto);
		panel.add(boton);
		panel.add(comboBox);
		boton.addActionListener(new Resultado());
	}
	//Creamos el evento del boton
	public class Resultado implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			comboBox.addItem(texto.getText());
		}
		
	}
}
