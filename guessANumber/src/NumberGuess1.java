import javax.swing.*;

public class NumberGuess1{
    
    public static void main(String[] args) {
        int computerNumber=(int)(Math.random()*100+1);
        //Math is a predefined class and random is a predefined method in Math class
        int userAnswer=0;
        System.out.println("the correct guess would be : "+ computerNumber);
        //random number will print
        int count=1;
        while(userAnswer!=computerNumber){
            String response=JOptionPane.showInputDialog(null,"enter a guess between 1 and 100","Guessing Game",3);
            userAnswer=Integer.parseInt(response);  
            JOptionPane.showMessageDialog(null,""+determineGuess(userAnswer, computerNumber, count++
            ));
            //JOptionPane is a predefined class and  and showMessageDialog is predefined method in JOptionPane class.

        }
    }
        // create a userdefined method ,dtermineGuess it is used in while loop
        public static String determineGuess(int userAnswer,int computerNumber,int count){
            if(userAnswer<=0||userAnswer>100)
                return "Your guess is invalid";
            else if(userAnswer==computerNumber)
                return "correct!\nTotal guess : " +count;
            else if(userAnswer>computerNumber)
                return "Your guess is too high,Try again.\nTry number :" +count;
            else if(userAnswer<computerNumber)
                return "Your guess is too low,Try again.\nTry number :" +count;
            else
                return "Your guess is incorrect\ntry number: "+count;
            
        
        }
    }



