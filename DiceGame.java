import java.util.Random;

class DiceGame{
    static public void main(String args[]){
	Random r = new Random();
	int r1 = r.nextInt(6)+1;
	int r2 = r.nextInt(6)+1;
	System.out.println("Rolling dice...");
	System.out.println("Die 1: " + r1);
	System.out.println("Die 2: " + r2);
	System.out.println("Total value: " + (r1+r2));
    }
}
