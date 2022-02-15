package E9.UD20B_Ej9.Clases;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
/**
 * 
 * @author Eloy, Jordi, Miquel Angel
 *
 */
public class Juego extends JFrame {
    private static final long serialVersionUID = 1L;
    //Creamos las variables
    private JPanel panel;
    private JButton[] botones = new JButton[16];
    private ArrayList < Integer > aNum = new ArrayList<Integer>();
    private ArrayList<ImageIcon> imagenes = new ArrayList<ImageIcon>();
    private ArrayList<ImageIcon> imgnada = new ArrayList<ImageIcon>();
    private ArrayList<Icon> aGirados = new ArrayList<Icon>();
    private int primeravez = 0;
    //Creacion de imagenes
    Image imgNada = new ImageIcon("imagenes/nada.png").getImage();
    ImageIcon imgNada_2 = new ImageIcon(imgNada.getScaledInstance(240, 240, Image.SCALE_SMOOTH));
    
    Image img1 = new ImageIcon("imagenes/Java.jpg").getImage();
    ImageIcon img1_2 = new ImageIcon(img1.getScaledInstance(240, 240, Image.SCALE_SMOOTH));
    
    Image img2 = new ImageIcon("imagenes/Angular.jpg").getImage();
    ImageIcon img2_2 = new ImageIcon(img2.getScaledInstance(300, 240, Image.SCALE_SMOOTH));
    
    Image img3 = new ImageIcon("imagenes/cplusplus.jpg").getImage();
    ImageIcon img3_2 = new ImageIcon(img3.getScaledInstance(240, 240, Image.SCALE_SMOOTH));
    
    Image img4 = new ImageIcon("imagenes/css.png").getImage();
    ImageIcon img4_2 = new ImageIcon(img4.getScaledInstance(240, 240, Image.SCALE_SMOOTH));
    
    Image img5 = new ImageIcon("imagenes/JavaScript-logo.jpg").getImage();
    ImageIcon img5_2 = new ImageIcon(img5.getScaledInstance(240, 240, Image.SCALE_SMOOTH));
    
    Image img6 = new ImageIcon("imagenes/Mysql.jpg").getImage();
    ImageIcon img6_2 = new ImageIcon(img6.getScaledInstance(240, 240, Image.SCALE_SMOOTH));
    
    Image img7 = new ImageIcon("imagenes/python.png").getImage();
    ImageIcon img7_2 = new ImageIcon(img7.getScaledInstance(240, 240, Image.SCALE_SMOOTH));
    
    Image img8 = new ImageIcon("imagenes/cobol.png").getImage();
    ImageIcon img8_2 = new ImageIcon(img8.getScaledInstance(240, 240, Image.SCALE_SMOOTH));
    
    Image img9 = new ImageIcon("imagenes/Java.jpg").getImage();
    ImageIcon img9_2 = new ImageIcon(img1.getScaledInstance(240, 240, Image.SCALE_SMOOTH));
    
    Image img10 = new ImageIcon("imagenes/Angular.jpg").getImage();
    ImageIcon img10_2 = new ImageIcon(img2.getScaledInstance(300, 240, Image.SCALE_SMOOTH));
    
    Image img11 = new ImageIcon("imagenes/cplusplus.jpg").getImage();
    ImageIcon img11_2 = new ImageIcon(img3.getScaledInstance(240, 240, Image.SCALE_SMOOTH));
    
    Image img12 = new ImageIcon("imagenes/css.png").getImage();
    ImageIcon img12_2 = new ImageIcon(img4.getScaledInstance(240, 240, Image.SCALE_SMOOTH));
    
    Image img13 = new ImageIcon("imagenes/JavaScript-logo.jpg").getImage();
    ImageIcon img13_2 = new ImageIcon(img5.getScaledInstance(240, 240, Image.SCALE_SMOOTH));
    
    Image img14 = new ImageIcon("imagenes/Mysql.jpg").getImage();
    ImageIcon img14_2 = new ImageIcon(img6.getScaledInstance(240, 240, Image.SCALE_SMOOTH));
    
    Image img15 = new ImageIcon("imagenes/python.png").getImage();
    ImageIcon img15_2 = new ImageIcon(img7.getScaledInstance(240, 240, Image.SCALE_SMOOTH));
    
    Image img16 = new ImageIcon("imagenes/cobol.png").getImage();
    ImageIcon img16_2 = new ImageIcon(img8.getScaledInstance(240, 240, Image.SCALE_SMOOTH));
    
    
    
    public Juego() {
    	//Añadimos las imagenes que hemos agregado al programa al array de imagenes
    	for(int i=0;i<16;i++) {
        	imgnada.add(imgNada_2);  
        }
    	imagenes.add(img1_2);imagenes.add(img2_2);imagenes.add(img3_2);imagenes.add(img4_2);
    	imagenes.add(img5_2);imagenes.add(img6_2);imagenes.add(img7_2);imagenes.add(img8_2);
    	imagenes.add(img1_2);imagenes.add(img2_2);imagenes.add(img3_2);imagenes.add(img4_2);
    	imagenes.add(img5_2);imagenes.add(img6_2);imagenes.add(img7_2);imagenes.add(img8_2);
    	/**imagenes.add(img9_2);imagenes.add(img10_2);imagenes.add(img11_2);imagenes.add(img12_2);
    	imagenes.add(img13_2);imagenes.add(img14_2);imagenes.add(img15_2);imagenes.add(img16_2);**/
        //Creamos el panel
        setTitle("Ejercicio9");
        setBounds(500, 10, 1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        
        //Creamos el panel, el texto y el label
        panel = new JPanel();
        //Indicamos el diseño del panel
        panel.setLayout(null);
        setContentPane(panel);
        this.getContentPane().setBackground(Color.blue);
        panel.setBackground(Color.blue);
        //Creamos el grid
        panel.setLayout(new GridLayout (4,4, 2,2));
        //Metodo para generar los botones random
        NumRand();
        for (int i = 0; i < 16 ; i++) {
        	
	        	botones[i].addMouseListener(new Resultado());
			
        }
    }
    

    //Creamos el evento del boton
    public class Resultado implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {
			
			int comp = 0;
			
			for(int i=0;i<16;i++) {
					if(e.getSource()==botones[i]) {
						botones[i].setIcon(imagenes.get(aNum.get(i)));
					}
					
					
					
			}
				
			System.out.println(detectarParejas());
			
			
			System.out.println(aGirados.toString()); 
			
			if((girados()) && (!detectarParejas())) {				
				
				cubrir();
				
			}

		}
		
		
		public void cubrir() {
			
			for(int i=0; i<16; i++) {
				if(!aGirados.contains(botones[i].getIcon())) {
					botones[i].setIcon(imgNada_2);
				}
			}
		}
			
	
		
		public boolean girados() {
			
			int cont = 0;
			
			for(int i=0; i<16; i++) {			
				if((!botones[i].getIcon().equals(imgNada_2)) && (!aGirados.contains(botones[i].getIcon()))){					
					cont++;					
				}				
			}	
			
			if(cont>=2) {
				return true;
			}
			
			return false;
			
		}
		
		public boolean detectarParejas() {
			
			boolean res = false;
			
			for(int i=0; i<16; i++) {
				for(int j=0; j<16; j++) {
					if ((botones[i].getIcon().equals(botones[j].getIcon())) && (!botones[i].getIcon().equals(imgNada_2)) && (i != j) && (primeravez == 0)) {
						aGirados.add(botones[i].getIcon());
						aGirados.add(botones[j].getIcon());
						primeravez = 1;
						res = true;
					}else if((botones[i].getIcon().equals(botones[j].getIcon())) && (!botones[i].getIcon().equals(imgNada_2)) && (i != j) && ((!aGirados.contains(botones[i].getIcon()) || (!aGirados.contains(botones[j].getIcon()))))) {
						aGirados.add(botones[i].getIcon());
						aGirados.add(botones[j].getIcon());
						res = true;
					}
				}
			}
			
			return res;
			
		}
		
		
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
    }

    
    
    
    public ArrayList<Integer> AleatorioNoRepetido(int lo, ArrayList<Integer> aNum){
    	
    	int pos;
    	
    	
        for (int i = 0; i < 16 ; i++) {
          pos = (int) Math.floor(Math.random() * lo );
          while (aNum.contains(pos)) {
            pos = (int) Math.floor(Math.random() * lo );
          }
          aNum.add(pos);
        }
    

        
        for (int i = 0; i < 16 ; i++) {
        	System.out.println(aNum.get(i));
        	
        }
        
        return aNum;
    	
    }
    
    public void NumRand() {
    	int num;
        String numString;
    	//ArrayList < Integer > aNum = new ArrayList<Integer>();

        AleatorioNoRepetido(16, aNum);
        
            for(int i=0;i<16;i++) {
            	numString=String.valueOf(aNum.get(i));
            	botones[i]=new JButton(imgnada.get(aNum.get(i)));
                panel.add(botones[i]);
                
            }
            
            
    }
    
    
    
}