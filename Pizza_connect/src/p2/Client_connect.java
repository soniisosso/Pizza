package p2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Client_connect {
	
	static ArrayList<Client> clientList = new ArrayList<Client>();	

	public static void main(String[] args) {
		 
		System.out.println("********recup�ration des datas de la base mysql***");
		//recup�ration des datas de la base mysql
		System.out.println("connection a mysql pizzaboxinnodb");
			
		String url = "jdbc:mysql://localhost/pizzaboxinnodb";
		
		String login = "root";
		String passwd = "";
		
		Connection cn =null; 
		
		Statement st =null;
		ResultSet rs =null;
 
		try {
			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Etape 2 : r�cup�ration de la connexion
			cn = DriverManager.getConnection(url, login, passwd);

			// Etape 3 : Cr�ation d'un statement
			st = cn.createStatement();

			String sql = "SELECT * FROM CLIENT"   ;

			// Etape 4 : ex�cution requ�te
			rs = st.executeQuery(sql);
			
			// Si r�cup donn�es alors �tapes 5 (parcours Resultset)
			System.out.println(rs);
			
			while (rs.next()) {
				System.out.println("-----------recup data from mysql------------------------");
				System.out.println(rs.getInt("NROCLIE"));
				System.out.println(rs.getString("NOMCLIE"));
				System.out.println(rs.getString("PRENOMCLIE"));
				System.out.println(rs.getString("ADRESSECLIE"));
				System.out.println(rs.getString("VILLECLIE"));
				System.out.println(rs.getInt("CODEPOSTALCLIE"));
				System.out.println(rs.getString("TITRECLIE"));
				System.out.println(rs.getInt("NROTELCLIE"));
				
				//Client(Integer NROCLIE, String NOMCLIE, String PRENOMCLIE, String ADRESSECLIE, String VILLECLIE, Integer CODEPOSTALCLIE, String TITRECLIE, Integer NROTELCLIE)
				 Client p1= new Client(rs.getInt("NROCLIE"),rs.getString("NOMCLIE"),rs.getString("PRENOMCLIE"),rs.getString("ADRESSECLIE"),rs.getString("VILLECLIE"),rs.getInt("CODEPOSTALCLIE"),rs.getString("TITRECLIE"),rs.getInt("NROTELCLIE"));
			     System.out.println(p1);//appel a la fonction tostring
			     clientList.add(p1);
			}
			
			
		} catch (ClassNotFoundException e) {//si il y un probleme de driver
		 
			e.printStackTrace();
			
			
		} catch (SQLException e) {//si il y un probleme de sql
	 
			e.printStackTrace();
		}
		
		//*******************verifier si la liste des clients****************
		System.out.println("********verifier si la liste des clients***");
		for(Client monClient : clientList) System.out.println(monClient);
			
		
		
	}//fin du main 


}//fin de la classe
