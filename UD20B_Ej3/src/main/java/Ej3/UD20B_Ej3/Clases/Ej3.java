package Ej3.UD20B_Ej3.Clases;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/**
 * 
 * @author Eloy Altozano
 *
 */
public class Ej3 extends JFrame {
	private static final long serialVersionUID = 1L;
	//Creamos las variables
	private JPanel panel;
	private JLabel lb = new JLabel("Has pulsado: ");
	private JLabel lb1 = new JLabel("Boton 1");
	private JLabel lb2 = new JLabel("Boton 2");
	private JButton boton = new JButton("Boton1");
	private JButton boton2 = new JButton("Boton2");
	private int cont1 = 0;
	private int cont2 = 0;
	public Ej3() {
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
		lb1.setBounds(130,130,190,20);
		lb2.setBounds(240,130,190,20);
		//Lo añadimos al panel
		panel.add(lb);
		panel.add(boton);
		panel.add(boton2);
		panel.add(lb1);
		panel.add(lb2);
		
		boton.addMouseListener(new Resultado());
		boton2.addMouseListener(new Resultado());
	}
	//Creamos el evento del boton
	public class Resultado implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {
			
			if(e.getSource()==boton) {
				cont1++;
				lb1.setText("Boton 1: "+cont1+" veces");
			}else if(e.getSource()==boton2) {
				cont2++;
				lb2.setText("Boton 2: "+cont2+" veces");
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
