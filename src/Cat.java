import javax.swing.JOptionPane;

public class Cat {
	 String name;
	 String color;
	 int age;
	 String size;
	 public Cat(String name, String color, int age, String size){
		 this.age = age;
		 this.name = name;
		 this.color = color;
		 this.size = size;
	 }
	 void meow(){
		 JOptionPane.showMessageDialog(null, name + " is meowing.");
	 }
	 void hair(){
		 JOptionPane.showMessageDialog(null, name + "'s " + color + " hair is every where.");
	 }
}
