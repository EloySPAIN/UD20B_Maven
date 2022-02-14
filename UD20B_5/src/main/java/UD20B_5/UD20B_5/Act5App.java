/**
 * @author Jordi Ribellas Ramos
 * Ejercicio 4
 */

package UD20B_5.UD20B_5;
import java.awt.EventQueue;

public class Act5App {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Act5 pantalla = new Act5();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

}
