/**
 * @author Jordi Ribellas Ramos
 * Ejercicio 4
 */

package UD20B_5.UD20B_5;

import javax.swing.*;
import java.awt.event.*;

public class Act5 extends JFrame implements ActionListener{

	private JPanel pantalla;
	private JButton boton;
	private JTextArea registros;
	
	public Act5() {

		setTitle("Símbolo del Sistema");
		setBounds(600, 300, 420, 300);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		pantalla = new JPanel();
		pantalla.setLayout(null);

		setContentPane(pantalla);

		//Boton
	    boton=new JButton("Limpiar");
	    boton.setBounds(150,10,100,30);
	    boton.addActionListener(this);

		// TextArea
		registros = new JTextArea();
		registros.setBounds(15, 50, 375, 200);

		pantalla.add(boton);
		pantalla.add(registros);
		
		MouseListener eventos = new MouseListener() {
			
			public void mouseClicked(MouseEvent e) {
				registros.append("\nClick");
			}
			
			public void mousePressed(MouseEvent e) {
				registros.append("\nMantenido");
			}
			
			public void mouseReleased(MouseEvent e) {
				registros.append("\nSoltado");
			}
		
			public void mouseEntered(MouseEvent e) {
				registros.append("\nHa salido de la ventana");
			}
		
			public void mouseExited(MouseEvent e) {
				registros.append("\nHa entrado en la ventana");			
			}
			
		};
		
		registros.addMouseListener(eventos);
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton) {
			registros.setText("");
		}
	}
	
}
