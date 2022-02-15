package E9.UD20B_Ej9.Clases;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
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
    	imagenes.add(img9_2);imagenes.add(img10_2);imagenes.add(img11_2);imagenes.add(img12_2);
    	imagenes.add(img13_2);imagenes.add(img14_2);imagenes.add(img15_2);imagenes.add(img16_2);
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
			for(int i=0;i<16;i++) {
				if(e.getSource()==botones[0]) {
					botones[0].setIcon(imagenes.get(aNum.get(0)));
				}
				if(e.getSource()==botones[1]) {
					botones[1].setIcon(imagenes.get(aNum.get(1)));
				}
				if(e.getSource()==botones[2]) {
					botones[2].setIcon(imagenes.get(aNum.get(2)));
				}
				if(e.getSource()==botones[3]) {
					botones[3].setIcon(imagenes.get(aNum.get(3)));
				}
				if(e.getSource()==botones[4]) {
					botones[4].setIcon(imagenes.get(aNum.get(4)));
				}
				if(e.getSource()==botones[5]) {
					botones[5].setIcon(imagenes.get(aNum.get(5)));
				}
				if(e.getSource()==botones[6]) {
					botones[6].setIcon(imagenes.get(aNum.get(6)));
				}
				if(e.getSource()==botones[7]) {
					botones[7].setIcon(imagenes.get(aNum.get(7)));
				}
				if(e.getSource()==botones[8]) {
					botones[8].setIcon(imagenes.get(aNum.get(8)));
				}
				if(e.getSource()==botones[9]) {
					botones[9].setIcon(imagenes.get(aNum.get(9)));
				}
				if(e.getSource()==botones[10]) {
					botones[10].setIcon(imagenes.get(aNum.get(10)));
				}
				if(e.getSource()==botones[11]) {
					botones[11].setIcon(imagenes.get(aNum.get(11)));
				}
				if(e.getSource()==botones[12]) {
					botones[12].setIcon(imagenes.get(aNum.get(12)));
				}
				if(e.getSource()==botones[13]) {
					botones[13].setIcon(imagenes.get(aNum.get(13)));
				}
				if(e.getSource()==botones[14]) {
					botones[14].setIcon(imagenes.get(aNum.get(14)));
				}
				if(e.getSource()==botones[15]) {
					botones[15].setIcon(imagenes.get(aNum.get(15)));
				}
				
            }
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