import javax.swing.JFrame;
 
public class Fenetre extends JFrame {
  public Fenetre(String a, int b, int c){
    this.setTitle(a);
    this.setSize(b, c);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    this.setResizable(false);
    this.setVisible(true);
  }
}