package frame;

import java.awt.Frame;

import javax.swing.JFrame;

public class FramEx extends Frame {
	
	public FramEx() {
		super("title - test");
		setBounds(100,100,300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("swing - test");
		f.setBounds(100,100,100,40);
		
		f.setSize(900,600);
		f.setVisible(true);
		
		
	}
}
