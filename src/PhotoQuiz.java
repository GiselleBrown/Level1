 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {
	
	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
		String Eevee = "http://cdn.bulbagarden.net/upload/thumb/e/e2/133Eevee.png/250px-133Eevee.png";
		String Turtwig ="http://assets.pokemon.com/assets/cms2/img/pokedex/full/387.png";
		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)

		// 2. create a variable of type "Component" that will hold your image
		Component picture;
		// 3. use the "createImage()" method below to initialize your Component
		picture = createImage(Eevee);
		// 4. add the image to the quiz window
		quizWindow.add(picture);
		quizWindow.pack();
		// 5. call the pack() method on the quiz window

		// 6. ask a question that relates to the image
	String eeveeAnswer = JOptionPane.showInputDialog("What Pokemon is this?");
		// 7. print "CORRECT" if the user gave the right answer
	if(eeveeAnswer.equals("Eevee")){
		JOptionPane.showMessageDialog(null, "Correct");
	}else{
		JOptionPane.showMessageDialog(null, "Incorrect");
	}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
	quizWindow.remove(picture);
		// 10. find another image and create it (might take more than one line of code)
		Component pictureTwo;
	pictureTwo = createImage(Turtwig);
		// 11. add the second image to the quiz window
	quizWindow.add(pictureTwo);
	quizWindow.pack();
		// 12. pack the quiz window
	
		// 13. ask another question
	String answer2 = JOptionPane.showInputDialog("What is this Pokemon?");
		// 14+ check answer, say if correct or incorrect, etc.
	if(answer2.equals("Turtwig")){
		JOptionPane.showInternalMessageDialog(null, "Correct");
	}else{
		JOptionPane.showMessageDialog(null, "Incorrect");
	}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}




