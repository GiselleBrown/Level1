import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimplePainter extends JPanel implements MouseListener , KeyListener, MouseMotionListener{
	private static final long serialVersionUID = 1L;
	int x =0;
	int y = 0;
	Random r = new Random();
	JFrame window;
	Color color = new Color(0, 0, 0);
	
	
	ArrayList<Dot> dots = new ArrayList<Dot>();

	public static void main(String[] args) {
		new SimplePainter();
	}

	public SimplePainter() {
		window = new JFrame();
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.pack();
		window.addMouseListener(this);
		run();
		window.addKeyListener(this);
		window.addMouseMotionListener(this);
	}

	private void run(){
		// 1. Make the window respond to mouse clicks
		
		// 2. Use the addDot() method to create a new dot at the mouse's x and y
		// position when the mouse is clicked. Call the repaint() method to
		// update the window.
		// 3. Make the window respond to keyboard presses
		// 4. Use the changeDotColor(Color) method to change the dots color when
		// the number keys are pressed
		// 5. Add a key to make the dot color random

// 6. Implement the MouseMotionListener interface
		// 7. Draw a stream of dots when the mouse is clicked and dragged
	}

	public void paintComponent(Graphics g) {
		for (Dot d : dots) {
			d.draw(g);
		}
	}

	private void addDot(int x, int y) {
		dots.add(new Dot(x, y, 50, 50, color));
	}

	private void changeDotColor(Color c){
		color = c;
	}
	
	private class Dot {
		int x;
		int y;
		int width;
		int height;

		Color c = new Color(0, 0, 0);

		public Dot(int x, int y, int width, int height, Color c) {
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
			this.c = c;
		}

		public void draw(Graphics g) {
			g.setColor(c);
			g.fillRect(x, y, width, height);
		}

		public void setColor(Color c) {
			this.c = c;
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		 x = e.getX();
		 y = e.getY();
		 addDot(x,y);
		 repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()== e.VK_1){
			changeDotColor(color.YELLOW);	
		}else if(e.getKeyCode()==e.VK_2){
			changeDotColor(color.BLUE);
		}else if(e.getKeyCode()==e.VK_3){
			changeDotColor(color.LIGHT_GRAY);
		}else if(e.getKeyCode()==e.VK_4){
			changeDotColor(color.GREEN);
		}else if(e.getKeyCode()==e.VK_5){
			changeDotColor(color.MAGENTA);
		}else if(e.getKeyCode()==e.VK_6){
			changeDotColor(color.ORANGE);
		}else if(e.getKeyCode()==e.VK_7){
			changeDotColor(color.PINK);
		}else if(e.getKeyCode()==e.VK_8){
			changeDotColor(color.RED);
		}else if(e.getKeyCode()== e.VK_0){
			changeDotColor(new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256)));
		}else{
			changeDotColor(color.BLACK);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		addDot(x,y);
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
