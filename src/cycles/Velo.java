package cycles;

import java.util.Random;

public class Velo {
	private final double DEFAUT_BRAQUET = 13.0 ;
	private double braquet ;
	private double diamRoue ;
	private Random genAlea =new Random () ;
	


	public Velo(double braquet, double diamRoue) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;
	}
	
	public Velo(double braquet) {
		this.braquet = braquet;
	}
	
	public Velo() {}
	
	public double getBraquet() {
		return braquet;
	}
	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}
	public double getDiamRoue() {
		return diamRoue;
	}
	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}
	public Random getGenAlea() {
		return genAlea;
	}
	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	}
	public double getDEFAUT_BRAQUET() {
		return DEFAUT_BRAQUET;
	}

	@Override
	public String toString() {
		return "Velo [braquet=" + braquet + ", diamRoue=" + diamRoue + "]";
	}

	public double getPuissance(double FrequenceCoupsDePedale) {
		return FrequenceCoupsDePedale*braquet*diamRoue*genAlea.nextDouble();
	}
	
	public static void main (String args[]) {
		Velo v1 = new Velo();
		Velo v2 = new Velo(15);
		Velo v3 = new Velo(15, 4);
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v3.getPuissance(10));
	}

	
}
