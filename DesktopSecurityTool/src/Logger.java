import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class Logger extends JFrame implements ActionListener, Runnable {

	int cnt = 0;
	JButton b1, b2;
	JPanel p1;

	Thread t1;

	public Logger() {
		this.setVisible(true);
		this.setSize(150, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1 = new JPanel();
		b1 = new JButton("Start");
		b2 = new JButton("Stop");
		p1.add(b1);
		p1.add(b2);
		this.add(p1);
		this.setSize(200, 100);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	public void run() {
		for (;;) {
			try {
				Robot r = new Robot();
				BufferedImage img = r.createScreenCapture(new Rectangle(getToolkit().getScreenSize()));
				ImageIO.write(img, "jpg", new File("d:\\pic\\" + cnt + ".jpg"));
				cnt++;
				t1.sleep(300);
			} catch (Exception ex) {

			}
		}
	}

	boolean chk = false;
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			chk = true;
			t1 = new Thread(this);
			t1.start();
		} else {
			if (chk) {
				t1.stop();
				new View1();
			}
		}
	}

	public static void main(String args[]) {
		new Logger();
	}
}
