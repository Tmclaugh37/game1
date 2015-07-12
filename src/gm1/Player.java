package gm1;

import java.awt.Color;
import java.awt.Graphics;

public class Player implements EntityA{
double ID[]={0,0,100};
	@Override
	public double[] getID() {return ID;}
	@Override
	public void setID(double[] ID) {this.ID=ID;}
	@Override
	public void tick() {
	
	}
	@Override
	public void render(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillOval((int)ID[0], (int)ID[1], 10, 10);
	}
}
