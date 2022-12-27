import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Example{
  public Example(){
    JFrame jf = new JFrame("Calculator");
    jf.setSize(600,600);
    jf.setLayout(null);
    jf.setLocation(100,200);

    JLabel displayLabel= new JLabel("Input");
    displayLabel.setBounds(30, 30, 540, 40);
    displayLabel.setBackground(Color.gray);
    displayLabel.setOpaque(true);
    displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    displayLabel.setForeground(Color.white);
    jf.add(displayLabel);

    JButton sevenButton = new JButton("7");
    sevenButton.setBounds(30,120,80,80);
    sevenButton.setBackground(Color.gray);
    jf.add(sevenButton);

    JButton eightButton = new JButton("8");
    eightButton.setBounds(120,120,80,80);
    eightButton.setBackground(Color.gray);
    jf.add(eightButton);

    JButton nineButton = new JButton("9");
    nineButton.setBounds(210,120,80,80);
    nineButton.setBackground(Color.gray);
    jf.add(nineButton);

    JButton fourButton = new JButton("4");
    fourButton.setBounds(30,210,80,80);
    fourButton.setBackground(Color.gray);
    jf.add(fourButton);

    JButton fiveButton = new JButton("5");
    fiveButton.setBounds(120,210,80,80);
    fiveButton.setBackground(Color.gray);
    jf.add(fiveButton);

    JButton sixButton = new JButton("6");
    sixButton.setBounds(210,210,80,80);
    sixButton.setBackground(Color.gray);
    jf.add(sixButton);

    JButton oneButton = new JButton("1");
    oneButton.setBounds(30,300,80,80);
    oneButton.setBackground(Color.gray);
    jf.add(oneButton);

    JButton twoButton = new JButton("2");
    twoButton.setBounds(120,300,80,80);
    twoButton.setBackground(Color.gray);
    jf.add(twoButton);

    JButton threeButton = new JButton("3");
    threeButton.setBounds(210,300,80,80);
    threeButton.setBackground(Color.gray);
    jf.add(threeButton);

    JButton zeroButton = new JButton("0");
    zeroButton.setBounds(120,390,80,80);
    zeroButton.setBackground(Color.gray);
    jf.add(zeroButton);

    JButton additionButton = new JButton("+");
    additionButton.setBounds(300,120,80,80);
    additionButton.setBackground(Color.gray);
    jf.add(additionButton);

    JButton subtractionButton = new JButton("-");
    subtractionButton.setBounds(300,210,80,80);
    subtractionButton.setBackground(Color.gray);
    jf.add(subtractionButton);

    JButton multiplicationButton = new JButton("x");
    multiplicationButton.setBounds(300,300,80,80);
    multiplicationButton.setBackground(Color.gray);
    jf.add(multiplicationButton);

    JButton divisionButton = new JButton("/");
    divisionButton.setBounds(300,390,80,80);
    divisionButton.setBackground(Color.gray);
    jf.add(divisionButton);

    JButton clearButton = new JButton("C");
    clearButton.setBounds(210,390,80,80);
    clearButton.setBackground(Color.gray);
    jf.add(clearButton);

    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public static void main(String[] args){
    new Example();
  }
  
}