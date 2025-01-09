package p2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Livreur_connect {
	
	static ArrayList<Livreur> livreurList = new ArrayList<Livreur>();	

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
			Class.forName("com.mysql.jdbc.Driver");
			
			// Etape 2 : r�cup�ration de la connexion
			cn = DriverManager.getConnection(url, login, passwd);

			// Etape 3 : Cr�ation d'un statement
			st = cn.createStatement();

			String sql = "SELECT * FROM LIVREUR"   ;

			// Etape 4 : ex�cution requ�te
			rs = st.executeQuery(sql);
			
			// Si r�cup donn�es alors �tapes 5 (parcours Resultset)
			System.out.println(rs);
			
			while (rs.next()) {
				System.out.println("-----------------------------------");
				System.out.println(rs.getInt("NROLIVR"));
				System.out.println(rs.getString("NOMLIVR"));
				System.out.println(rs.getString("PRENOMLIVR"));
				System.out.println(rs.getDate("DATEEMBAUCHLIVR"));
				
				//Pizza(String nomPizza, double prixPizza, Integer numeroPizza, String cheminImage)
				 Livreur p1= new Livreur(rs.getInt("NROLIVR"),rs.getString("NOMLIVR"),rs.getString("PRENOMLIVR"),rs.getDate("DATEEMBAUCHLIVR"));
			     System.out.println(p1);//appel a la fonction tostring
			     livreurList.add(p1);
			}
			 
			
		} catch (ClassNotFoundException e) {//si il y un probleme de driver
		 
			e.printStackTrace();
			
			
		} catch (SQLException e) {//si il y un probleme de sql
	 
			e.printStackTrace();
		}
		
		//*******************verifier si la liste de pizzas****************
		System.out.println("********verifier si la liste de pizzas***");
		for(Livreur monLivreur : livreurList) System.out.println(monLivreur);
			
		
		
	}//fin du main 

}//fin de la classe
