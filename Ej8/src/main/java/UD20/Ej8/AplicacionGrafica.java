package UD20.Ej8;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class AplicacionGrafica extends JFrame {
	
	private JPanel contentPane;
	private int texto = 0;
	private JLabel resultado;
	private JToggleButton btnConversion;
	private boolean conv = false;
	
	public AplicacionGrafica() {
		
		setTitle("Calculadora cambio de monedas");
		
		setBounds(600, 300, 450, 200);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
		
		contentPane = new JPanel();
		
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
		
		//Etiqueta1
		JLabel aConvertir = new JLabel("Cantidad a convertir: ");
		aConvertir.setBounds(30, 16, 150, 20);
		contentPane.add(aConvertir);
		
		//Campo de texto1
		final JTextField texto1 = new JTextField();
		texto1.setBounds(155, 16, 60, 25);
		contentPane.add(texto1);
		
		//Etiqueta2
		JLabel textoRes = new JLabel("Resultado: ");
		textoRes.setBounds(250, 16, 150, 20);
		contentPane.add(textoRes);
		
		//Etiqueta3
		resultado = new JLabel(Metodos.calcularEurPts(0));
		resultado.setBounds(325, 16, 150, 20);
		contentPane.add(resultado);
		
		//Boton Conversión
		btnConversion = new JToggleButton("Euros Pts");
		btnConversion.setBounds(60, 90, 120, 20);
		btnConversion.setMnemonic(KeyEvent.VK_E);
		contentPane.add(btnConversion);
		btnConversion.addActionListener(new ActionListener(){			
			public void actionPerformed(ActionEvent e) {
				
				if(!conv) {
					btnConversion.setText("Pts Euros");
					conv = true;
				}else {
					btnConversion.setText("Euros Pts");
					conv = false;
				}
			}
		});
		
		//Boton Borrar
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(230, 90, 120, 20);
		btnBorrar.setMnemonic(KeyEvent.VK_B);
		contentPane.add(btnBorrar);
		btnBorrar.addActionListener(new ActionListener(){			
			public void actionPerformed(ActionEvent e) {
				
				resultado.setText("0.0");
				
				
			}
		});
		
		//Boton Calcular
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(140, 130, 120, 20);
		btnCalcular.setMnemonic(KeyEvent.VK_C);
		contentPane.add(btnCalcular);
		btnCalcular.addActionListener(new ActionListener(){			
			public void actionPerformed(ActionEvent e) {
			
				try {
					if(!conv) {
						resultado.setText(Metodos.calcularEurPts(Integer.parseInt(texto1.getText())));
					}else {
						resultado.setText(Metodos.calcularPtsEur(Integer.parseInt(texto1.getText())));
					}		
					
				}catch(NumberFormatException error){
					System.out.println("No se ha introducido un número");
				}		
			}
		});
	}
}

