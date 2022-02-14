/**
 * @author Jordi Ribellas Ramos
 * Ejercicio 4
 */

package UD20B_4.UD20B_4;
import java.awt.EventQueue;

public class Act4App {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Act4 pantalla = new Act4();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

}
