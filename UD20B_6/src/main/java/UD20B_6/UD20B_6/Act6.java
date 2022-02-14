package UD20B_6.UD20B_6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Act6 extends JFrame implements ActionListener{

	private JPanel pantalla;
	private JButton boton;
	private JTextField metros, peso;
	private JLabel ICMshow;
	private double resultado;
	
	public Act6() {
		
		setTitle("Indice de Masa Corporal");
		setBounds(600, 300, 420, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		pantalla = new JPanel();
		pantalla.setLayout(null);
		setContentPane(pantalla);
		
		JLabel metrosT = new JLabel("Altura (metros) ");
		metrosT.setBounds(30, 5, 178, 20);
		
		metros = new JTextField();
		metros.setBounds(120, 5, 50, 20);
		
		JLabel pesoT = new JLabel("Peso (KG)");
		pesoT.setBounds(200, 5, 178, 20);
		
		peso = new JTextField();
		peso.setBounds(260, 5, 50, 20);
		
		//Boton
		boton=new JButton("Calcular");
	    boton.setBounds(150,40,100,30);
	    boton.addActionListener(this);
		
	    //texto
	    JLabel IMC = new JLabel("IMC:");
		IMC.setBounds(150, 80, 178, 20);
		
		ICMshow = new JLabel();
		ICMshow.setBounds(180, 80, 178, 20);
		
		pantalla.add(metrosT);
		pantalla.add(metros);
		pantalla.add(pesoT);
		pantalla.add(peso);
		pantalla.add(boton);
		pantalla.add(IMC);
		pantalla.add(ICMshow);
	}

	public void actionPerformed(ActionEvent e) {
		try {
			resultado = Double.parseDouble(peso.getText()) / 
					(Double.parseDouble(metros.getText()) * Double.parseDouble(metros.getText()));
			
			ICMshow.setText(""+ resultado);
			
		}catch(NumberFormatException error){
			System.out.println("No se ha introducido un número");
		}
		
	}
	
}
