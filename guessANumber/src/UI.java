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

	JLabel guessDisplay = new JLabel("Guess the Number 1 to 100 ");
	guessDisplay.setBounds(95,20,285,40);
	guessDisplay.setBackground(Color.black);
	guessDisplay.setOpaque(true);
	guessDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
	guessDisplay.setForeground(Color.white);
	jf.add(guessDisplay);	
	
	JButton clearButton = new JButton("C");
	clearButton.setBounds(30,20,60,40);
	clearButton.setBackground(Color.gray);
	jf.add(clearButton);
	
	JButton zeroButton = new JButton("0");
	zeroButton.setBounds(30,70,80,80);
	zeroButton.setBackground(Color.gray);
	jf.add(zeroButton);

	JButton oneButton = new JButton("1");
	oneButton.setBounds(120,70,80,80);
	oneButton.setBackground(Color.gray);
	jf.add(oneButton);

	JButton twoButton = new JButton("2");
	twoButton.setBounds(210,70,80,80);
	twoButton.setBackground(Color.gray);
	jf.add(twoButton);

	JButton threeButton = new JButton("3");
	threeButton.setBounds(300,70,80,80);
	threeButton.setBackground(Color.gray);
	jf.add(threeButton);

	JButton fourButton = new JButton("4");
   	fourButton.setBounds(30,160,80,80);
   	fourButton.setBackground(Color.gray);
   	jf.add(fourButton);
 
 	JButton enterButton = new JButton("Enter");
 	enterButton.setBounds(120,160,170,80);
 	enterButton.setBackground(Color.gray);
 	jf.add(enterButton);
 	
 	JButton fiveButton = new JButton("5");
	fiveButton.setBounds(300,160,80,80);
	fiveButton.setBackground(Color.gray);
	jf.add(fiveButton);
	
	JButton sixButton = new JButton("6");
	sixButton.setBounds(30,250,80,80);
	sixButton.setBackground(Color.gray);
	jf.add(sixButton);
	
	JButton sevenButton = new JButton("7");
	sevenButton.setBounds(120,250,80,80);
    sevenButton.setBackground(Color.gray);
    jf.add(sevenButton);

    JButton eightButton = new JButton("8");
    eightButton.setBounds(210,250,80,80);
    eightButton.setBackground(Color.gray);
    jf.add(eightButton);

    JButton nineButton = new JButton("9");
    nineButton.setBounds(300,250,80,80);
    nineButton.setBackground(Color.gray);
    jf.add(nineButton);

	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new UI();
    }
}
