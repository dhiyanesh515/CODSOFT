import java.util.*;
public class NUMBERGAME {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
        		Random random=new Random();
		int maxattempts=5;
		int score=0;
		boolean play=true;
		System.out.println("Welcomw to Number Game!");
		System.out.println("Instructions:\n"+"1.A random nuber generated between 1 to 100\n"+"2.Guess the number correctly within 10 attempts\n"+"3.If you want to play again you can opt for play again option and you can proceed\n");		
		while(play){
		    int num=random.nextInt(100)+1;
		    System.out.println("Random number generated try to find it!");
		    int attempts=0;
		    boolean found=false;
		    while(attempts<maxattempts){
		        System.out.print("Enter your guess : ");
		        int guess=s.nextInt();
		        if((Math.abs(num-guess))>0 && Math.abs(num-guess)<=10){
		            System.out.println("You are almost there");
		        }
		        else if(guess<num){
		            System.out.println("Too low! Try once again");
		        }
		        else if (guess>num){
		            System.out.println("Too high! Try once again");
		        }
		        else{
		            System.out.print("Nice Congradulations You made it!");
		            score+=(maxattempts-attempts)*10;
		            found=true;
		            break;
		        }
		        attempts++;
		    }
		    if(!found){
		        System.out.println("Sorry! Your attempts exceeded and number is "+num);
		    }
		    System.out.println("Your Score is "+score);
		    System.out.println("Do you want to play again: Yes / No");
		    String again=s.next().toLowerCase();
		    if(again=="yes"){
		        play=true;
		    }
		    else{
		        play=false;
		        System.out.println("Thanks for playing   :)");
		    }
		}
	
}
}


