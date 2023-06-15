import java.util.Random;
import java.util.Scanner;

class DiceGame{
    static public void main(String args[]){
	Random r = new Random();
	Scanner s = new Scanner(System.in);
	int r1 = r.nextInt(6)+1;
	int r2 = r.nextInt(6)+1;
	System.out.println("What is your name?");
	System.out.print("> ");
	String name = s.next();
	System.out.println("Hello " + name + "!");
	System.out.println("Rolling dice...");
	System.out.println("Die 1: " + r1);
	System.out.println("Die 2: " + r2);
	System.out.println("Total value: " + (r1+r2));
	if((r1+r2)>=7){
	    System.out.println("You won");
	}
	else{
	    System.out.println("You lost");
	}
    }
}
