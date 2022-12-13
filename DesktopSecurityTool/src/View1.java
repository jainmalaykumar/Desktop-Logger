import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class View1 extends JFrame implements ActionListener{

	int cnt=0;
	JButton b1;
	JPanel p;
	public View1() {
		this.setSize(400,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1=new JButton("View");
		p=new JPanel();
		p.add(b1, "East");
		b1.addActionListener(this);
		this.add(p);
	}
	public static void main(String args[]) {
		new View1();
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			new View();
		}
		
	}
}
