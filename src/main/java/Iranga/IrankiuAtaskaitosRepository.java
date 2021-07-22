package Iranga;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

public class IrankiuAtaskaitosRepository {
	
	protected Session em;
	
	public IrankiuAtaskaitosRepository() {}
	
	public IrankiuAtaskaitosRepository(  Session em  ) {
		    this.em = em;
	}
	
	 public List<IrankiuAtaskaita> recipePriceRange() {
		  		
		 
		  	String top_nuomoti =
		  				
		  			"SELECT  "
		  			+ "i.pavadinimas,  "
		  			+ "COUNT(*) AS total_count, "
		  		    + "SUM(CASE WHEN k.tipas = 'Fizinis' THEN 1 ELSE 0 END) AS fizinis_count, "
		  		    + "SUM(CASE WHEN k.tipas = 'Juridinis' THEN 1 ELSE 0 END) AS juridinis_count "
		  		    + "FROM irankiai i "
		  		    + "RIGHT JOIN nuoma n ON n.irankiai_id = i.id "
		  		    + "INNER JOIN klientai k ON k.id = n.klientai_id "
		  		    + "GROUP BY i.id "
		  			+ "ORDER BY total_count DESC "
		  			;
		  	System.out.println ( top_nuomoti );
		    Query query = em.createNativeQuery ( top_nuomoti );
		    return (List<IrankiuAtaskaita>) query.getResultList();
	  }	
	 
}