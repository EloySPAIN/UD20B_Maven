/**
 * @author Jordi Ribellas Ramos
 * Ejercicio 6
 */
package UD20B_6.UD20B_6;

import java.awt.EventQueue;

public class Act6App {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Act6 pantalla = new Act6();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
