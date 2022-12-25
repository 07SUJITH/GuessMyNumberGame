import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;


public class UI2{
    public UI2(){
		Font myFont = new Font("Ink Free",Font.BOLD,30);
		Color color =new Color(192,192,192);
        JFrame jf = new JFrame("Number Guess");
        jf.setSize(420,420);
        jf.setLayout(null);
        jf.setLocation(0,0);
		ImageIcon image =new ImageIcon("logo.jpg");
        jf.setIconImage(image.getImage());
        jf.getContentPane().setBackground(new Color(0,139,139));
	
	JLabel guessDisplay = new JLabel("Guess the Number 1 to 100 ");
	guessDisplay.setFont(myFont);
	guessDisplay.setBounds(95,20,285,40);
	guessDisplay.setBackground(Color.black);
	guessDisplay.setOpaque(true);
	guessDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
	guessDisplay.setForeground(Color.white);
	jf.add(guessDisplay);	
	
	JButton clearButton = new JButton("C");
	clearButton.setBounds(30,20,60,40);
	clearButton.setBackground(color);
	clearButton.setFont(myFont);
	jf.add(clearButton);
	
	JButton zeroButton = new JButton("0");
	zeroButton.setBounds(30,70,80,80);
	zeroButton.setBackground(color);
	zeroButton.setFont(myFont);
	jf.add(zeroButton);

	JButton oneButton = new JButton("1");
	oneButton.setBounds(120,70,80,80);
	oneButton.setBackground(color);
	oneButton.setFont(myFont);
	jf.add(oneButton);

	JButton twoButton = new JButton("2");
	twoButton.setBounds(210,70,80,80);
	twoButton.setBackground(color);
	twoButton.setFont(myFont);
	jf.add(twoButton);

	JButton threeButton = new JButton("3");
	threeButton.setBounds(300,70,80,80);
	threeButton.setBackground(color);
	threeButton.setFont(myFont);
	jf.add(threeButton);

	JButton fourButton = new JButton("4");
   	fourButton.setBounds(30,160,80,80);
   	fourButton.setBackground(color);
	fourButton.setFont(myFont);
   	jf.add(fourButton);
 
 	JButton enterButton = new JButton("Enter");
 	enterButton.setBounds(120,160,170,80);
 	enterButton.setBackground(new Color(153,50,204));
	enterButton.setFont(myFont);
 	jf.add(enterButton);
 	
 	JButton fiveButton = new JButton("5");
	fiveButton.setBounds(300,160,80,80);
	fiveButton.setBackground(color);
	fiveButton.setFont(myFont);
	jf.add(fiveButton);
	
	JButton sixButton = new JButton("6");
	sixButton.setBounds(30,250,80,80);
	sixButton.setBackground(color);
	sixButton.setFont(myFont);
	jf.add(sixButton);
	
	JButton sevenButton = new JButton("7");
	sevenButton.setBounds(120,250,80,80);
    sevenButton.setBackground(color);
	sevenButton.setFont(myFont);
    jf.add(sevenButton);

    JButton eightButton = new JButton("8");
    eightButton.setBounds(210,250,80,80);
    eightButton.setBackground(color);
	eightButton.setFont(myFont);
    jf.add(eightButton);

    JButton nineButton = new JButton("9");
    nineButton.setBounds(300,250,80,80);
    nineButton.setBackground(color);
	nineButton.setFont(myFont);
    jf.add(nineButton);

	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.setResizable(false);
    }
    public static void main(String[] args){
        new UI2();
    }

}