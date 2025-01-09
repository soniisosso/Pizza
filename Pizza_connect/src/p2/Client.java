package p2;

public class Client {
	
	Integer NROCLIE ;
	String NOMCLIE;
	String PRENOMCLIE;
	String ADRESSECLIE;
	String VILLECLIE;
	Integer CODEPOSTALCLIE;
	String TITRECLIE;
	Integer NROTELCLIE;
	
	public Client(	Integer NROCLIE, String NOMCLIE, String PRENOMCLIE, String ADRESSECLIE, String VILLECLIE, Integer CODEPOSTALCLIE, String TITRECLIE, Integer NROTELCLIE) {
		super();
		this.NROCLIE = NROCLIE;
		this.NOMCLIE = NOMCLIE;
		this.PRENOMCLIE = PRENOMCLIE;
		this.ADRESSECLIE = ADRESSECLIE;
		this.VILLECLIE = VILLECLIE;
		this.CODEPOSTALCLIE = CODEPOSTALCLIE;
		this.TITRECLIE = TITRECLIE;
		this.NROTELCLIE = NROTELCLIE;
	}

	@Override
	public String toString() {
		return "Client [NROCLIE=" + NROCLIE + ", NOMCLIE=" + NOMCLIE + ", PRENOMCLIE=" + PRENOMCLIE + ", ADRESSECLIE="
				+ ADRESSECLIE + ", VILLECLIE=" + VILLECLIE + ", CODEPOSTALCLIE=" + CODEPOSTALCLIE + ", TITRECLIE="
				+ TITRECLIE + ", NROTELCLIE=" + NROTELCLIE + "]";
	}

	
	}
	
	 
	


