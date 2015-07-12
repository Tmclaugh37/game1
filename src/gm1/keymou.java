package gm1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class keymou implements  KeyListener,MouseListener{
Vars v;Class1 c1;Control c;
	public keymou(Vars v, Class1 c1,Control c){
		this.v=v;this.c1=c1;this.c=c;
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	v.mx=e.getX();v.my=e.getY();
		c.shoot();
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {int code=e.getExtendedKeyCode();
		switch(code){
		case 87: v.md[0]=-1;break;
		case 65: v.md[1]=-1;break;
		case 83: v.md[0]=1;break;
		case 68: v.md[1]=1;break;
		case 92: c.addEntityB(new enemy());break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent evt) {
		int code=evt.getExtendedKeyCode();
	
		switch(code){
		case 27:System.exit(0);break;
		case 87: v.md[0]=0;break;
		case 65: v.md[1]=0;break;
		case 83: v.md[0]=0;break;
		case 68: v.md[1]=0;break;
			
		default:	System.out.println("Keycode: "+code);break;
		
		
		}
	}

	@Override
	public void keyTyped(KeyEvent evt) {
		
	}

}
