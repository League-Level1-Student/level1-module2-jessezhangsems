package _03_tea_maker;

public class teamakerrunner {
public static void main(String args[]) {
	Kettle water=new Kettle();
	Cup cup=new Cup();
	TeaBag teabag=new TeaBag(TeaBag.CHAMOMILE);
	
	water.boil();
	cup.makeTea(teabag, water.getWater());
	
}
}
