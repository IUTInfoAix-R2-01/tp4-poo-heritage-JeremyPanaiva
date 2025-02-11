package cycles;

public class VeloElec extends Velo  {
	double  DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15 ;
	double facteurPuissanceMoteur ;
	
	public VeloElec(double braquet, double diamRoue,double coupleMoteur ) {
		super(braquet, diamRoue);
		this.facteurPuissanceMoteur=coupleMoteur ;
	}
	public VeloElec(double braquet,double coupleMoteur) {
		super(braquet);
		this.facteurPuissanceMoteur=coupleMoteur ;
	}
	
	public VeloElec() {}
	
	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}
	public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}
	
	@Override
	public double getPuissance(double FrequenceCoupsDePedale){
		 return super.getPuissance(FrequenceCoupsDePedale)*facteurPuissanceMoteur ;
		
	}
	
	@Override
	public String toString() {
		return "VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	public static void main (String args[]) {
		VeloElec v1 = new VeloElec();
		VeloElec v2 = new VeloElec(15,10);
		VeloElec v3 = new VeloElec(15,4,10);
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v3.getPuissance(10));
		System.out.println(v3.getFacteurPuissanceMoteur());
		
	}

	
}
