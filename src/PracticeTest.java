import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PracticeTest implements ActionListener{
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		JPanel panel = new JPanel();
		//frame.add(panel);
		frame.add(label);
		frame.setTitle("What is 2+2? Spell it out don't put a letter");
		frame.setSize(500, 500);
		frame.setVisible(true);
		JButton button = new JButton();
		JButton buton = new JButton();
		frame.add(button);
		frame.pack();
		frame.add(buton);
		button.addActionListener(null);
		buton.addActionListener(null);
		button.setText("Submit");
		buton.setSize(10, 10);
		buton.setText("Hint");
	//	label.setText("What is 2 + 2?");
		JTextField text = new JTextField(2);
		frame.add(text);
		String answer = text.getText();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Yay nothing works");
	}
}
