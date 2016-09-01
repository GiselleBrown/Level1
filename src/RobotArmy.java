import java.util.Random;

public class RobotArmy {
	public static void main(String[] asd){
		//1. create a new human
		int random = new Random().nextInt(9);
	Human Jack = new Human("Jack", random);
	random = new Random().nextInt(9);
	Human joe = new Human("Joe", random);
	random = new Random().nextInt(9);
	Human Steven = new Human("Steven",random);
		//2. create a new Robot army of good and evil robots.
	random = new Random().nextInt(9);
		Robot microwave = new Robot("Matt the microwave", true,random);
		random = new Random().nextInt(9);
		Robot phone = new Robot("Phil the phone", true,random);
		random = new Random().nextInt(9);
		Robot TV = new Robot("Stevie the TV", true,random);
		//3. command your robot army to destroy a human
	microwave.battle(Jack);
	phone.battle(joe);
	TV.battle(Steven);
	}
}

/**
 * Human Class
 */
class Human {
	String name;
	boolean isAlive;
	int Hstrenth;
	public Human(String name, int Hstrenth){
		this.name = name;
		this.isAlive = true;
		this.Hstrenth = Hstrenth;
	}
	public String getName() {
		return name;
	}
	public void die(){
		isAlive = false;
	}
	public int getHStrenth(){
		return Hstrenth;
	}
}

/**
 * Robot Class
 */
class Robot {
	boolean isEvil;
	String name;
	int Rstrenth;
	public Robot(String name, boolean isEvil, int Rstrenth){
		this.name = name;
		this.isEvil = isEvil;
		this.Rstrenth = Rstrenth;
	}
	public int getRStrenth(){
		return Rstrenth;
	}
	public void battle(Human man){
		if(man.getHStrenth()> Rstrenth){
			System.out.println( man.getName() + " won the battle");
			
		}else if(man.getHStrenth()< Rstrenth) {
			System.out.println(name + " won the battle");
		}else{
			System.out.println(name + " and " + man.getName() + " tied");
		}
		
	}
}
