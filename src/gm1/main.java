package gm1;



import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;



public class main extends Applet{

	private static final long serialVersionUID = 1L;


	public static Class1 C1=new Class1();

	
//	Client    CL=new Client(v,c);
	
	
	

	@Override
	public void init(){
		setLayout(new BorderLayout());
		add(C1,BorderLayout.CENTER);
		setPreferredSize(new Dimension((int)C1.width,(int)C1.height));
		setMaximumSize(new Dimension((int)C1.width,(int)C1.height));
		setMinimumSize(new Dimension(300,300));
	
	}
	@Override
	public void start(){
	C1.start();
	}
	
	@Override
	public void stop(){
	
		C1.stop();
	}
	public static void main (String args[]) {
		


	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	 C1.maxwidth = (int)screenSize.getWidth();
	 C1.maxheight = (int)screenSize.getHeight();
	 C1.width =C1.maxwidth-300;
	 C1.height = C1.maxheight-300;
	C1.setPreferredSize(new Dimension((int)C1.width,(int)C1.height));
	C1.setMaximumSize(new Dimension((int)C1.width,(int)C1.height));
	C1.setMinimumSize(new Dimension(300,300));
	C1.frame = new JFrame("Game");
    C1.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    C1.frame.setLayout(new BorderLayout());
C1.frame.setUndecorated(true);
    C1.frame.add(C1, BorderLayout.CENTER);
    C1.frame.pack();
    
    C1.frame.setResizable(false);
    C1.frame.setLocationRelativeTo(null);
    C1.frame.setVisible(true);

    
	C1.start();}}
