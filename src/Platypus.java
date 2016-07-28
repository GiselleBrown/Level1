public class Platypus {
	private String name;
	private String gender;

	public Platypus(String name, String gender) {
		this.name = name;
		this.gender = gender;

	}

	void sayHi() {
		System.out.println("The " + gender + " platypus " + name + " is smarter than your average platypus.");
	}

	public static void main(String[] args) {
		// 1. Make an instance of your new pet platypus
		Platypus Percy = new Platypus("Percy", "male");
		Platypus Pippen = new Platypus("Pippen", "male");
		Platypus Patrick = new Platypus("Patrick", "male");
		Platypus Penelope = new Platypus("Penelope", "female");
		// 2. Call the sayHi method
		Percy.sayHi();
		Pippen.sayHi();
		Patrick.sayHi();
		Penelope.sayHi();
		// 3. Create a constructor in the platypus class so that you can give
		// your platypus a name.

	}

}
