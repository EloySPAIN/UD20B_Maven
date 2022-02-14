/**
 * @author Jordi Ribellas Ramos
 * Ejercicio 4
 */

package UD20B_4.UD20B_4;
import javax.swing.*;

public class Act4 extends JFrame{

	private JPanel pantalla;
	
	public Act4() {
		
		//TextArea
		JTextArea registros = new JTextArea("Prova");
		registros.setBounds(100,30, 400,400);
		registros.append("Incio de la consola\n");
		
		setTitle("Símbolo del Sistema");
		setBounds(600, 300, 550, 500);
		registros.append("Ventana disenada\n");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		registros.append("Ventana mostrada\n");
		
		pantalla = new JPanel();
		pantalla.setLayout(null);
		
		setContentPane(pantalla);
		
		//Texto
		JLabel text = new JLabel("Logs");
		text.setBounds(18, 45, 178, 20);
		
		pantalla.add(text);
		pantalla.add(registros);
	}
	
}