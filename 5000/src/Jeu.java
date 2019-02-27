import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Jeu {
	public static void main(String[] args){
		Fenetre Fen=new Fenetre("5000",200,200);
		
        JPanel Pan = new JPanel();
        Pan.setLayout(null);
        JLabel label= new JLabel("Nombre de joueur ?");
        label.setSize(120, 30);
        label.setLocation(5, 5);
       
        Pan.add(label);
        
        JTextField edit= new JTextField();
        edit.setSize(20, 30);
        edit.setLocation(120,5);
        Pan.add(edit);
        JButton bouton=new JButton("valide");
        bouton.setSize(100,30);
        bouton.setLocation(40,40);
        Pan.add(bouton);
        
        bouton.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){ 
        		Joueur joueur= new Joueur(Integer.parseInt(edit.getText()));
        		Fen.dispose();

            }  
        });
        
        
        
        
		Fen.setContentPane(Pan);
		Fen.setVisible(true);
	}

}