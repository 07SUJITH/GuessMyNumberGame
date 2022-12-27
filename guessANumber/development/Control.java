import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Control implements ActionListener{
	JFrame jf;
	JLabel guessDisplay;
	JButton clearButton;
	JButton zeroButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton fourButton;
	JButton enterButton;
	JButton fiveButton;
	JButton sixButton;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	String inputDisplay;
	int randomNum = (int)Math.random()*100+1 ;
	int inputStorage;
    public Control(){
        jf = new JFrame("Number Guess");
        jf.setSize(400,400);
        jf.setLayout(null);
        jf.setLocation(0,0);

		guessDisplay = new JLabel("Guess the Number 1 to 100 ");
		guessDisplay.setBounds(95,20,285,40);
		guessDisplay.setBackground(Color.black);
		guessDisplay.setOpaque(true);
		guessDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		guessDisplay.setForeground(Color.white);
		jf.add(guessDisplay);	
	
		clearButton = new JButton("C");
		clearButton.setBounds(30,20,60,40);
		clearButton.setBackground(Color.gray);
		clearButton.addActionListener(this);
		jf.add(clearButton);
	
		zeroButton = new JButton("0");
		zeroButton.setBounds(30,70,80,80);
		zeroButton.setBackground(Color.gray);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
	

		oneButton = new JButton("1");
		oneButton.setBounds(120,70,80,80);
		oneButton.setBackground(Color.gray);
		oneButton.addActionListener(this);
		jf.add(oneButton);

		twoButton = new JButton("2");
		twoButton.setBounds(210,70,80,80);
		twoButton.setBackground(Color.gray);
		twoButton.addActionListener(this);
		jf.add(twoButton);

		threeButton = new JButton("3");
		threeButton.setBounds(300,70,80,80);
		threeButton.setBackground(Color.gray);
		threeButton.addActionListener(this);
		jf.add(threeButton);

		fourButton = new JButton("4");
   		fourButton.setBounds(30,160,80,80);
   		fourButton.setBackground(Color.gray);
   		fourButton.addActionListener(this);
   		jf.add(fourButton);
 
 	    enterButton = new JButton("Enter");
 		enterButton.setBounds(120,160,170,80);
 		enterButton.setBackground(Color.gray);
 		enterButton.addActionListener(this);
 		jf.add(enterButton);
 	
 		fiveButton = new JButton("5");
		fiveButton.setBounds(300,160,80,80);
		fiveButton.setBackground(Color.gray);
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
	
		sixButton = new JButton("6");
		sixButton.setBounds(30,250,80,80);
		sixButton.setBackground(Color.gray);
		sixButton.addActionListener(this);
		jf.add(sixButton);
	
		sevenButton = new JButton("7");
		sevenButton.setBounds(120,250,80,80);
    	sevenButton.setBackground(Color.gray);
    	sevenButton.addActionListener(this);
    	jf.add(sevenButton);

    	eightButton = new JButton("8");
    	eightButton.setBounds(210,250,80,80);
    	eightButton.setBackground(Color.gray);
    	eightButton.addActionListener(this);
    	jf.add(eightButton);

    	nineButton = new JButton("9");
    	nineButton.setBounds(300,250,80,80);
    	nineButton.setBackground(Color.gray);
    	nineButton.addActionListener(this);
    	jf.add(nineButton);

		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
    	if(e.getSource() == enterButton){
        	System.out.println(randomNum);
        
        }else if(e.getSource() == clearButton){
        	if(inputDisplay.length() >= 2){
        		
        		inputDisplay = inputDisplay.substring(0,inputDisplay.length()-1);
        		inputStorage = Integer.parseInt(inputDisplay);
        		guessDisplay.setText(inputDisplay);
        	}else{
        		inputDisplay = null;
        		inputStorage = 0;
        		guessDisplay.setText(" ");
        	}
        }else{
        	JButton source = (JButton)e.getSource();
        	String value = source.getText();
        	if(inputDisplay == null)
        		inputDisplay = value;
        	else{
        		if(inputDisplay.length()<=8)
        			inputDisplay += value;	
        	}
        	inputStorage = Integer.parseInt(inputDisplay);
        	System.out.println(inputStorage);
        	guessDisplay.setText(inputDisplay);
        }
    }
    public static void main(String[] args){
        new Control();
    }
}

