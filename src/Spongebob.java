
public class Spongebob {
 public static void main(String[] args) {
	 SeaCreature Spongebob = new SeaCreature("SpongeBob");
	 String name = Spongebob.getName();
	 System.out.println(name);
	 Spongebob.eat();
	 Spongebob.laugh();
	SeaCreature Squidward = new SeaCreature("Squidward");
	String Name = Squidward.getName();
	System.out.println(Name);
	Squidward.eat();
	Squidward.laugh();
	SeaCreature Patrick = new SeaCreature("Patrick");
	String nam = Patrick.getName();
	System.out.println(nam);
	Patrick.eat();
	Patrick.laugh();
}
}
