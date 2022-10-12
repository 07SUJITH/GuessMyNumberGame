import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class UI{
    public UI(){
        JFrame jf = new JFrame("Number Guess");
        jf.setSize(400,400);
        jf.setLayout(null);
        jf.setLocation(0,0);
    }
    public static void main(String[] args){
        new NumberGuessingGameUI();
    }
}