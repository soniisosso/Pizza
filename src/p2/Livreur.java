package p2;
import java.util.Date;

public class Livreur {
	
	Integer NROLIVR ;
	String NOMLIVR;
	String PRENOMLIVR;
	Date DATEEMBAUCHLIVR;
	
	public Livreur(	Integer NROLIVR , String NOMLIVR, String PRENOMLIVR, Date DATEEMBAUCHLIVR) {
		super();
		this.NROLIVR = NROLIVR;
		this.NOMLIVR = NOMLIVR;
		this.PRENOMLIVR = PRENOMLIVR;
		this.DATEEMBAUCHLIVR = DATEEMBAUCHLIVR;
		
	}

	@Override
	public String toString() {
		return "Livreur [NROLIVR=" + NROLIVR + ", NOMLIVR=" + NOMLIVR + ", PRENOMLIVR=" + PRENOMLIVR
				+ ", DATEEMBAUCHLIVR=" + DATEEMBAUCHLIVR + "]";
	}

	
	
	
	 
	

}
