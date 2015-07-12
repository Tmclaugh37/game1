package gm1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.LinkedList;

public class Control {
	public LinkedList<EntityA> a =new LinkedList<EntityA>();
	public LinkedList<EntityB> b =new LinkedList<EntityB>();
	public LinkedList<EntityC> c =new LinkedList<EntityC>();
	EntityA entA;EntityB entB;double ID[]={0,0};EntityC entC;double ID1[]={0,0,0,0};
	Class1 C1;
	Vars v;
public Control(Vars v,Class1 C1){
this.C1=C1;
	this.v=v;
	addEntityA(new Player());
}
public void tick(){
for(int i=0;i<a.size();i++){entA=a.get(i);entA.tick();
ID=entA.getID();ID[0]+=v.md[1];ID[1]+=v.md[0];
entA.setID(ID);}

for(int i=0;i<b.size();i++){entB=b.get(i);entB.tick();ID1[0]=entB.getID()[0];ID1[1]=entB.getID()[1];for(int ii=0;ii<c.size();ii++){entC=c.get(ii);ID1[2]=entC.getID()[0];ID1[3]=entC.getID()[1];
if(ID1[0]>ID1[2]-6&&ID1[0]<ID1[2]+6&&ID1[1]>ID1[3]-6&&ID1[1]<ID1[3]+6){ID=entB.getID();ID[6]-=5;entB.setID(ID);if(ID[6]<=0){removeEntityB(entB);}}

}}

for(int i=0;i<c.size();i++){entC=c.get(i);entC.tick();}
}
public void render(Graphics g){	  Graphics2D g2d = (Graphics2D) g.create();
	for(int i=0;i< a.size();i++){
		entA=a.get(i);
		entA.render(g);
		}
	for(int i=0;i<b.size();i++){entB=b.get(i);entB.render(g);}
	for(int i=0;i<c.size();i++){entC=c.get(i);entC.render(g);}
}
public void addEntityA(EntityA block){
	a.add(block);
}
public void removeEntityA(EntityA block){
	a.remove(block);
}
public void addEntityB(EntityB block){
	b.add(block);
}
public void removeEntityB(EntityB block){
	b.remove(block);
}
public void addEntityC(EntityC block){
	c.add(block);
}
public void removeEntityC(EntityC block){
	c.remove(block);
}

public void shoot(){
	entA=a.get(0);
	c.add(new pbull(entA.getID()[0],entA.getID()[1],v.mx,v.my));
}














}
