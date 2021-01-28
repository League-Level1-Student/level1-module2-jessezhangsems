package _02_smurf;

public class smurfrunner {
public static void main(String args[]) {
	Smurf handy_smurf=new Smurf("handy_smurf");
	System.out.println("Handy smurf");
	handy_smurf.eat();
	Smurf Papa_Smurf=new Smurf("Papa_Smurf");
	System.out.println("Papa Smurf");
	Papa_Smurf.getHatColor();
	Papa_Smurf.isGirlOrBoy();
	Smurf Smurfette=new Smurf ("Smurfette");
	Smurfette.getHatColor();
	Smurfette.isGirlOrBoy();
	
	
}
}
