
package window;
import javax.swing.*;

public class Window {

    
    public static void main(String[] args) {
        
        JFrame GUI = new JFrame("Gui KUT bank"); // create window
        GUI.setVisible(false);
        GUI.setSize(1000,600);
//        GUI.setResizable(false);
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /*!!!!!!!!!!!!!!!!OPNEEM PANEEL!!!!!!!!!!!!!!!*/
        JPanel opnemen = new JPanel (); // Maak paneel aan om button aan toe te voegen
        opnemen.setLayout(null);
        GUI.add(opnemen); // voegt paneel toe aan venster
        
        JButton opneem= new JButton("Geld opnemen!..!");
        opneem.setBounds(20, 10, 200, 40);
        opnemen.add(opneem);
        
        /*!!!!!!!!!!!!!!!STORT PANEEL!!!!!!!!!!!!!!!*/
        JPanel storten = new JPanel ();
        storten.setLayout(null);
        GUI.add(storten);
        
        JButton stort = new JButton("Geld storten!..!");
        stort.setBounds(20, 100, 200, 40);
        storten.add(stort);
        
        /*!!!!!!!!!!!!!!EXIT PANEEL!!!!!!!!!!!!!!!!*/
        JPanel exit = new JPanel ();
        exit.setLayout(null);
        GUI.add(exit);
        
        JButton ex = new JButton("Klik hier om af te sluiten");
        ex.setBounds(2, 300, 150, 40);
        exit.add(ex);
        
        GUI.setVisible(true);
  
    }
    
}
