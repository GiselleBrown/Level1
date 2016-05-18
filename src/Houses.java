import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Houses {
public static void main(String[] args) {
	Tortoise.penUp();
	Tortoise.setSpeed(10);
	Tortoise.setX(20);
	Tortoise.setY(400);
	Tortoise.setAngle(0);
	Tortoise.penDown();
	for(int i=0;i<3;i++){
	drawHouse("small", "red", "p");
	drawHouse("large", "brown", "f");
	drawHouse("medium", "green", "p");
	}
	
}
private static void drawHouse(String height, String Color, String Roof) {
	int lenth = 0;
	if(height.equals("small")){
		lenth+= 60;
	}else if(height.equals("medium")){
		lenth+= 120;
	}else{
		lenth+= 250;
	}
	if(Color.equals("red")){
		Tortoise.setPenColor(Colors.Reds.FireBrick);
	}else if(Color.equals("brown")){
		Tortoise.setPenColor(Colors.Browns.BurlyWood);
	}else if(Color.equals("green")){
		Tortoise.setPenColor(Colors.Greens.DarkOliveGreen);
	}
	Tortoise.move(lenth);
	int random = new Random().nextInt(2);
	if(random == 0){
		drawPointyRoof();
	}else if(random == 1){
		drawFlatRoof();
	}
	Tortoise.move(lenth);
	Tortoise.setPenColor(Colors.Greens.LimeGreen);
	Tortoise.turn(-90);
	Tortoise.move(40);
	Tortoise.turn(-90);
}
private static void drawPointyRoof() {
	Tortoise.turn(45);
	Tortoise.move(15);
	Tortoise.turn(90);
	Tortoise.move(15);
	Tortoise.setAngle(180);
}
private static void drawFlatRoof() {
	Tortoise.turn(90);
	Tortoise.move(30);
	Tortoise.turn(90);
}
}
