package gm1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;

public class Class1  extends Canvas implements Runnable  {private static final long serialVersionUID = 1L;boolean running = false;private Thread thread;BufferedImage image =null;BufferedImage spriteSheet=null;


int FPS;
BufferedReader in;
PrintWriter out;
Socket socket;
JFrame frame;
Control c;
Vars v;
keymou km;
Game g;
public boolean isApplet = false;
int maxwidth,maxheight,width,height;
public static Class1 C1;
public synchronized void init(){ C1 = this;}
public synchronized void start(){running = true;running = true;thread=new Thread(this);thread.start();}
public synchronized void stop(){if(!running)return;running = false;try {	thread.join();} catch (InterruptedException e) {e.printStackTrace();}System.exit(0);}
public void run(){init();long lastTime = System.nanoTime();final double amountOfTicks=60.0;double ns = 1000000000/amountOfTicks, delta =0;int updates=0, frames=0;long timer=System.currentTimeMillis();timer+=1001;while(running){long now = System.nanoTime();delta +=(now-lastTime)/ns;lastTime=now;if(delta>=1){tick();updates++;delta--;}render();frames++;if(System.currentTimeMillis()-timer > 1000){timer += 1000;updates =0;frames=0;}}stop();}


public Class1(){v=new Vars();	
c=new Control(v,this);
g=new Game(v,c,this);
	km=new keymou(v,this,c);
	 	 addKeyListener(km);addMouseListener(km);
	}














public void tick(){
	v.tick();
	c.tick();
	}
public void render(){BufferStrategy bs=getBufferStrategy();if(bs==null){createBufferStrategy(3);return;}Graphics g=bs.getDrawGraphics();g.clearRect(0, 0, 5000, 5000);g.setColor(Color.gray);

v.render(g);
c.render(g);
this.g.render(g);


g.drawImage(image, 0, 0, getWidth()+1000, getHeight()+1000, this);g.dispose();bs.show();}
public BufferedImage getSpriteSheet() {return spriteSheet;}






}