import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton joke = new JButton();
	JButton punchline = new JButton();

	public static void main(String[] args) {
		ChuckleClicker laugh = new ChuckleClicker();
		laugh.makeButtons();
	}

	void makeButtons() {
		frame.add(panel);
		panel.add(joke);
		panel.add(punchline);

		frame.setVisible(true);
		joke.setText("Joke");
		punchline.setText("Punchline");
		joke.addActionListener(this);
		punchline.addActionListener(this);
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == joke) {
			JOptionPane.showMessageDialog(null, "Why did Barty Crouch stop drinking?");
		}
		if (e.getSource() == punchline) {
			JOptionPane.showMessageDialog(null, "Because it was making him Moody.");
		}
	}
}
