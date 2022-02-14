package Ej2.UD20B_Ej2.Clases;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
/**
 * 
 * @author Eloy Altozano
 *
 */
public class Ej2 extends JFrame {
	private static final long serialVersionUID = 1L;
	//Creamos las variables
	private JPanel panel;
	JLabel lb = new JLabel("Has pulsado: ");
	JLabel lb1 = new JLabel("");
	JButton boton = new JButton("Boton1");
	JButton boton2 = new JButton("Boton2");
	public Ej2() {
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
		lb.setBounds(50,130,190,20);
		boton.setBounds(50,160,190,20);
		boton2.setBounds(50,190,190,20);
		//Lo añadimos al panel
		panel.add(lb);
		panel.add(boton);
		panel.add(boton2);
		panel.add(lb1);
		
		boton.addMouseListener(new Resultado());
		boton2.addMouseListener(new Resultado());
	}
	//Creamos el evento del boton
	public class Resultado implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {
			
			if(e.getSource()==boton) {
				lb1.setText("Boton 1");
				lb1.setBounds(130,130,190,20);
			}else if(e.getSource()==boton2) {
				lb1.setText("Boton 2");
				lb1.setBounds(130,130,190,20);
			}

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
