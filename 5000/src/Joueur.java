import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Joueur {

	public Joueur(int a){
		Fenetre Fen=new Fenetre("joueur",300,100+30*(a));
		JTextField[] test2=new JTextField[a];
		JLabel[] test=new JLabel[a];
		String[] retour=new String[a];
        JPanel Pan = new JPanel();
        Pan.setLayout(null);
        
      for(int i=0;i<a;i++){
      	test[i]=new JLabel("joueur "+(i+1));
     	test[i].setSize(120,30);
     	test[i].setLocation(5,(30*(i)));
     	Pan.add(test[i]);
     	}
      
      
      for(int i=0;i<a;i++){
      	test2[i]=new JTextField();
     	test2[i].setSize(120,20);
     	test2[i].setLocation(60,(30*(i))+5);
     	Pan.add(test2[i]);
     	}
      JButton bouton=new JButton("valide");
      bouton.setSize(100,30);
      bouton.setLocation(180,(30*(a+1)));
      Pan.add(bouton);
      
      bouton.addActionListener(new ActionListener(){  
      	public void actionPerformed(ActionEvent e){ 
      		for (int i=0;i<a;i++){
      			System.out.println(test2[i].getText());
      			retour[i]=test2[i].getText();
      			
      		}
      		new Debut(retour);
      		Fen.dispose();

          }  
      });
      
      
      
		Fen.setContentPane(Pan);
		Fen.setVisible(true);
      
		
	}
}
