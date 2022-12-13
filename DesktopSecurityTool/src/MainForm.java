import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MainForm extends JFrame implements ActionListener {

	JMenuBar mb1;
	JMenu mDesktop, mHelp;
	JMenuItem dLogging, dView, dExit;
	JMenuItem habout;
	Dimension d;
	JEditorPane jed;
	JPanel p;
	JLabel l;

	public MainForm() {
		this.setVisible(true);
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mb1=new JMenuBar();
		mDesktop=new JMenu("Desktop");
		mHelp=new JMenu("Help");
		
		dLogging=new JMenuItem("Logging");
		dView=new JMenuItem("View");
		dExit=new JMenuItem("Exit");

		
		habout=new JMenuItem("About");
		
		d=new Dimension();
		int d1=(int)d.getWidth();
		l=new JLabel("Desktop Logger",d1);
		l.setForeground(Color.RED);
		mDesktop.add(dLogging);mDesktop.add(dView);mDesktop.add(dExit);
		
		mHelp.add(habout);
		
		mb1.add(mDesktop);mb1.add(mHelp);
		this.setJMenuBar(mb1);
		jed=new JEditorPane();
		p=new JPanel();
		p.add(l);
		this.add(jed);
		this.add(p);
		
		dLogging.addActionListener(this);
		dView.addActionListener(this);
		dExit.addActionListener(this);
		
		habout.addActionListener(this);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==dLogging) {
			new Logger();
		}
		if(e.getSource()==dView) {
			new View();
		}
		if(e.getSource()==dExit) {
			System.exit(0);
		}
		if(e.getSource()==habout) {
			JOptionPane.showMessageDialog(null, "Project Developed by \n Malay Kumar Jain");
		}
		
	}
	
	public static void main(String args[]) {
		new MainForm();
	}
}
