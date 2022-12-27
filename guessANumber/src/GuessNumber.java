import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.util.Random;
import javax.swing.Timer;

public class GuessNumber implements ActionListener{
	JFrame jf;
	JLabel guessDisplay;
	JLabel timerDisplay;
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
	JButton clueButton;
	String inputDisplay;
	Timer countdown;
	static int number;
	int chances = 10, no_clue = 5, last_divisor=1, count=100;
    
	public GuessNumber(){
		Font myFont = new Font("Ink Free",Font.BOLD,15);
		Color color =new Color(192,192,192);
        
		jf = new JFrame("Number Guess");
        jf.setSize(420,550);
        jf.setLayout(null);
        jf.setLocation(0,0);
		ImageIcon image =new ImageIcon("logo2.jpg");
        jf.setIconImage(image.getImage());
        jf.getContentPane().setBackground(new Color(0,139,139));
	
    	guessDisplay = new JLabel("Guess the Number 1 to 100 ");
		guessDisplay.setFont(myFont);
		guessDisplay.setBounds(95,20,285,40);
		guessDisplay.setBackground(Color.black);
		guessDisplay.setOpaque(true);
		guessDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		guessDisplay.setForeground(Color.white);
		jf.add(guessDisplay);	
		
		timerDisplay = new JLabel();
		timerDisplay.setFont(myFont);
		timerDisplay.setBounds(95,430,285,40);
		timerDisplay.setBackground(new Color(0,139,139));
		timerDisplay.setOpaque(true);
		timerDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		timerDisplay.setForeground(Color.white);
		jf.add(timerDisplay);	
	
		clearButton = new JButton("C");
		clearButton.setBounds(30,20,60,40);
		clearButton.setBackground(color);
		clearButton.setFont(myFont);
		clearButton.addActionListener(this);
		jf.add(clearButton);
	
		zeroButton = new JButton("0");
		zeroButton.setBounds(30,70,80,80);
		zeroButton.setBackground(color);
		zeroButton.setFont(myFont);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);

		oneButton = new JButton("1");
		oneButton.setBounds(120,70,80,80);
		oneButton.setBackground(color);
		oneButton.setFont(myFont);
		oneButton.addActionListener(this);
		jf.add(oneButton);

		twoButton = new JButton("2");
		twoButton.setBounds(210,70,80,80);
		twoButton.setBackground(color);
		twoButton.setFont(myFont);
		twoButton.addActionListener(this);
		jf.add(twoButton);

		threeButton = new JButton("3");
		threeButton.setBounds(300,70,80,80);
		threeButton.setBackground(color);
		threeButton.setFont(myFont);
		threeButton.addActionListener(this);
		jf.add(threeButton);

		fourButton = new JButton("4");
   		fourButton.setBounds(30,160,80,80);
   		fourButton.setBackground(color);
		fourButton.setFont(myFont);
   		fourButton.addActionListener(this);
		jf.add(fourButton);
 
 		enterButton = new JButton("Enter");
 		enterButton.setBounds(120,160,170,80);
 		enterButton.setBackground(new Color(153,140,154));
		enterButton.setFont(myFont);
 		enterButton.addActionListener(this);
		jf.add(enterButton);
 	
 		fiveButton = new JButton("5");
		fiveButton.setBounds(300,160,80,80);
		fiveButton.setBackground(color);
		fiveButton.setFont(myFont);
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
	
		sixButton = new JButton("6");
		sixButton.setBounds(30,250,80,80);
		sixButton.setBackground(color);
		sixButton.setFont(myFont);
		sixButton.addActionListener(this);
		jf.add(sixButton);
	
		sevenButton = new JButton("7");
		sevenButton.setBounds(120,250,80,80);
    	sevenButton.setBackground(color);
		sevenButton.setFont(myFont);
    	sevenButton.addActionListener(this);
		jf.add(sevenButton);

    	eightButton = new JButton("8");
    	eightButton.setBounds(210,250,80,80);
    	eightButton.setBackground(color);
		eightButton.setFont(myFont);
    	eightButton.addActionListener(this);
		jf.add(eightButton);

    	nineButton = new JButton("9");
    	nineButton.setBounds(300,250,80,80);
    	nineButton.setBackground(color);
		nineButton.setFont(myFont);
    	nineButton.addActionListener(this);
		jf.add(nineButton);
	
		clueButton = new JButton("Get clue");
		clueButton.setBounds(30,340,350,80);
		clueButton.setBackground(color);
		clueButton.setFont(myFont);
		clueButton.addActionListener(this);
		jf.add(clueButton);

		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setResizable(false);
		
		countdown = new Timer(1000,new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent e){
    			timerDisplay.setText("Count down: "+count);
    			count--;
    			if(count<=0){
    				timerDisplay.setText("Count down: "+count);
    				guessDisplay.setText("You Lose the game (timeout)");
    				countdown.stop();
					reset();
    			}
    		}
    	});	
    	countdown.setRepeats(true);
        countdown.setCoalesce(true);
        countdown.start();
    }

    public static void main(String[] args){
        Random random = new Random();
        number = random.nextInt(100) + 1;
        new GuessNumber();
    }
    public void reset(){
    	Random rand = new Random();
        number = rand.nextInt(100) + 1;
        chances = 10;
        no_clue = 5;
        count=100;
        jf.setEnabled(false);
        Timer timer = new Timer(5000, new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
		    	guessDisplay.setText("New Game,Guess a number 1 to 100");
		    	jf.setEnabled(true);
		    	countdown.start();
            }
         });
         timer.setRepeats(false);
         timer.setCoalesce(true);
         timer.start();
    }
    public void actionPerformed(ActionEvent e) {
    	
    	if(e.getSource() == enterButton){
			// game logic implementation
			try{
				int guess = Integer.parseInt(inputDisplay);
				chances -= 1;
				if (guess == number) {
			  		guessDisplay.setText("You guessed it! The number was "+number);
			  		countdown.stop();
			  		reset();
			  	}
				else if (guess < number) {
			  		guessDisplay.setText("Your guess is too low. Try again.");
				}else {
			  		guessDisplay.setText("Your guess is too high. Try again.");
				}
				inputDisplay = null;
				if(chances <= 0){
					guessDisplay.setText("You Lose the game");
					countdown.stop();
					reset();
				}
			}
			catch(NumberFormatException error){
				guessDisplay.setText("Enter the number");
			}
		}else if(e.getSource() == clueButton){
			if(no_clue == 0){
				JOptionPane.showMessageDialog(jf, "No clue left");
			}else if(no_clue == 5){
				int flag = 0;
				for(int i=1;i<=number/2;i++){
					if(number%i == 0){
						flag = 1;
						break;
					}
				}
				if(flag == 0){
					no_clue = 0;
					JOptionPane.showMessageDialog(jf, "It is a prime number");
				}else{
					JOptionPane.showMessageDialog(jf, "It is not a prime number");
					no_clue--;
				}
			}else if(no_clue == 4){
				if(number%2 == 0){
					JOptionPane.showMessageDialog(jf, "The number is a multiple of 2");
					no_clue--;
					last_divisor = 2;
				}else{
					JOptionPane.showMessageDialog(jf, "The number is not a multiple of 2");
					no_clue--;
				}
			}else if(no_clue == 3){
				if(number%3 == 0){
					JOptionPane.showMessageDialog(jf, "The number is a multiple of 3");
					no_clue--;
					last_divisor = 3;
				}else{
					JOptionPane.showMessageDialog(jf, "The number is not a multiple of 3");
					no_clue--;
				}
			}else if(no_clue == 2){
				if(number%4 == 0){
					JOptionPane.showMessageDialog(jf, "The number is a multiple of 4");
					no_clue--;
					last_divisor = 4;
				}else{
					JOptionPane.showMessageDialog(jf, "The number is not a multiple of 4");
					no_clue--;
				}
			}else if(no_clue == 1){
				for(int n=last_divisor+1;n<=10;n++){
					if(number%n == 0){
						JOptionPane.showMessageDialog(jf, "The number is a multiple of "+n);
						break;
					}
				}
				no_clue--;
			}
		}else if(e.getSource() == clearButton){
        	try{
        		if(inputDisplay.length() >= 2){
        			inputDisplay = inputDisplay.substring(0,inputDisplay.length()-1);
        			guessDisplay.setText(inputDisplay);
        		}else{
        			inputDisplay = null;
        			guessDisplay.setText(" ");
        		}
        	}
        	catch(NullPointerException error){
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
        	guessDisplay.setText(inputDisplay);
        }
    }
}
