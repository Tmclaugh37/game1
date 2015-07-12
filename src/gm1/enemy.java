package gm1;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class enemy implements EntityB{
	         //  0 1 2 3 4 5  6  7 
	double ID[]={0,0,0,0,0,1,20,20};Random ran=new Random();int activity=50,range=100;double spdx=0,spdy=0;
public enemy(){
	ID[0]=500;ID[1]=500;ID[2]=ID[0];ID[3]=ID[1];
}

@Override
public double[] getID() {
	
	return ID;
}

@Override
public void setID(double[] ID) {
this.ID=ID;
	
}

@Override
public void tick() {
	if(ID[0]==ID[2]&&ID[1]==ID[3]){
switch(ran.nextInt(activity)){
case 1: ID[2]=ID[0]+ran.nextInt(range)-range/2;ID[3]=ID[1]+ran.nextInt(range)-range/2;ID[4]=1;break;
}}
if(ID[0]>=ID[2]-5&&ID[0]<=ID[2]+5&&ID[1]>=ID[3]-5&&ID[1]<=ID[3]+5){
	ID[2]=ID[0];ID[3]=ID[1];ID[4]=0;
}else{if(ID[4]==1){
	 double length = Math.sqrt(( ID[2]- ID[0])*(ID[2] -ID[0]) + (ID[3] - ID[1])*(ID[3]- ID[1])); //calculates the distance between the two points
	 spdx = (ID[2] - ID[0]) /length * ID[5];
	spdy = (ID[3] - ID[1]) /length * ID[5];ID[4]=0;
}ID[0]+=spdx;ID[1]+=spdy;}
}

@Override
public void render(Graphics g) {
	g.setColor(Color.magenta);
	g.fillOval((int)ID[0], (int)ID[1], 10, 10);
	g.setColor(Color.GREEN);
	g.fillRect((int)ID[0]-5, (int)ID[1]-5, (int)ID[6], 3);
}
}
