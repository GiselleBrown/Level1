import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JFrame frame = new JFrame();
	int random = new Random().nextInt(5);

	public static void main(String[] args) {

	}

	void showButton() {

		frame.setVisible(true);

		panel.add(button);
		button.addActionListener(this);
		frame.pack();

	}

	{

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			JOptionPane.showMessageDialog(null, "Woohoo");
		}
	}
}
