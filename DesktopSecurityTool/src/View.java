import javax.swing.*;
public class View extends JFrame implements Runnable{

	int cnt=0;
	Thread t1;
	JLabel L1;
	JButton b1;
	public View() {
		this.setSize(600,600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		L1=new JLabel();
		b1=new JButton("View");
		this.add(L1);
		t1=new Thread(this);
		t1.start();
	}
	public void run() {
		for(;;) {
			try {
				ImageIcon ico=new ImageIcon("d:\\pic\\"+cnt+".jpg");
				L1.setIcon(ico);
				cnt++;
				t1.sleep(300);
			}catch(Exception ex) {
				
			}
		}
	}
	public static void main(String args[]) {
		new View();
	}
}
