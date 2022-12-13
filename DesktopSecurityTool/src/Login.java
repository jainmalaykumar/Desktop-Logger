import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Login extends JFrame implements ActionListener {

	JLabel l1,l2;
	JTextField ta1;
	JPasswordField pf1;
	JPanel p,p1;
	JButton b1,b2;

	public Login() {
		this.setVisible(true);
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1=new JLabel("User Name ");
		ta1=new JTextField(15);
		l2=new JLabel("Password ");
		pf1=new JPasswordField(15);
		b1=new JButton("Submit");
		b2=new JButton("Cancel");
		p=new JPanel();
		p1=new JPanel();
		p.add(l1);p.add(ta1);
		p.add(l2);p.add(pf1);
		p.add(b1);p.add(b2);
		p.setLayout(new GridLayout(3, 2,10,10));
		p1.add(p);
		this.add(p1);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			if(ta1.getText().equals("admin") && pf1.getText().equals("root"))
				new MainForm();
			else
				JOptionPane.showMessageDialog(null, "invalid id or password");
		}
		if(e.getSource()==b2) {
			System.exit(0);
		}
		
	}
	
	public static void main(String args[]) {
		new Login();
	}
}
