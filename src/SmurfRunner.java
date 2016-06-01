
public class SmurfRunner {
public static void main(String[] args) {
	Smurf Handy = new Smurf("Handy");
	String name = Handy.getName();
	System.out.println(name);
	Handy.eat();
	Smurf Papa = new Smurf("Papa");
	String Name1 = Papa.getName();
	System.out.println(Name1);
	String hat = Papa.getHatColor();
	System.out.println( "Papa Smurf's hat is " + hat + ".");
	Smurf Smurfette = new Smurf("Smurfette");
	String nam = Smurfette.getName();
	System.out.println(nam);
	String gen = Smurfette.isGirlOrBoy();
	System.out.println(gen);
}
}
