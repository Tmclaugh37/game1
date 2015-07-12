package gm1;

import java.awt.Color;
import java.awt.Graphics;

public class pbull implements EntityC{
double ID[]={0,0,0,0,0,10},spdx=0,spdy=0;
public pbull(double x,double y,double tx,double ty){
	ID[0]=x;ID[1]=y;ID[2]=tx;ID[3]=ty;
	double length = Math.sqrt(( ID[2]- ID[0])*(ID[2] -ID[0]) + (ID[3] - ID[1])*(ID[3]- ID[1])); //calculates the distance between the two points
	 spdx = (ID[2] - ID[0]) /length * ID[5];
	spdy = (ID[3] - ID[1]) /length * ID[5];ID[4]=0;
}
	@Override
	public double[] getID() {
		// TODO Auto-generated method stub
		return ID;
	}

	@Override
	public void setID(double[] ID) {
		this.ID=ID;
		
	}

	@Override
	public void tick() {
		ID[0]+=spdx;
		ID[1]+=spdy;
		
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawOval((int)ID[0], (int)ID[1], 5, 5);
	}

}
