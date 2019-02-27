import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Debut {

	public Debut( String[] a){
		 int b=0;
		int taille=a.length;
		JLabel[] test=new JLabel[taille];
		JButton[] test2=new JButton[taille];
		JLabel[] test3=new JLabel[taille];
		Fenetre Fen=new Fenetre("joueur",50+(70*(taille+1)),200);
        JPanel Pan = new JPanel();
        Pan.setLayout(null);
        
        for(int i=0;i<taille;i++){
          	test[i]=new JLabel(a[i]);
         	test[i].setSize(120,30);
         	test[i].setLocation((70*(i+1)),5);
         	Pan.add(test[i]);
         	}
        
        for(int i=0;i<taille;i++){
          	test2[i]=new JButton("dé");
         	test2[i].setSize(50,20);
         	test2[i].setLocation((70*(i+1)),50);
         	Pan.add(test2[i]);
         	}
        
        for(int i=0;i<taille;i++){
          	test3[i]=new JLabel();
         	test3[i].setSize(120,30);
         	test3[i].setLocation((70*(i+1)+15),100);
         	Pan.add(test3[i]);
         	}
        
        for(b=0;b<taille;b++){
        	final int c=b;
        	test2[b].addActionListener(new ActionListener(){  
        		public void actionPerformed(ActionEvent e){
        			if (test3[c].getText() == ""){
        					int garde=(int) (Math.random() * 5.99)+1;
        					test3[c].setText(Integer.toString(garde));
        			}
          		}
          	});
        }
        
        Fen.setContentPane(Pan);
		Fen.setVisible(true);
		
		
	}
}
