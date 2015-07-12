package gm1;

import java.awt.Color;
import java.awt.Graphics;

public class Game {
	Vars v; Control c; Class1 c1;
public Game(Vars v,Control c,Class1 c1){
	this.v=v;this.c=c;this.c1=c1;
}
public void tick(){
	
}
public void render(Graphics g){
	g.setColor(Color.GREEN);
	g.fillRect(50, 50, (int)c.a.get(0).getID()[2], 6);
	g.setColor(Color.BLACK);
	g.drawRect(50, 50, 100, 6);
	
}
}
