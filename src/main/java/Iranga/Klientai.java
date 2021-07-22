package Iranga;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Klientai {
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;	

	private String tipas;	
    private String pavadinimas;
    private String kontaktai;

    
	@Transient
	private ArrayList<String> errors;    
    
    
	public Klientai() {
		// super();    
	}
    
	public Klientai(String tipas, String pavadinimas, String kontaktai) {
		this.setTipas(tipas);	
		this.setPavadinimas(pavadinimas);
		this.setKontaktai(kontaktai);
	}

	public String getTipas() {
		return tipas;
	}

	public void setTipas(String tipas) {
		this.tipas = tipas;
	}

	public String getPavadinimas() {
		return pavadinimas;
	}

	public void setPavadinimas(String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKontaktai() {
		return kontaktai;
	}

	public void setKontaktai(String kontaktai) {
		this.kontaktai = kontaktai;
	}
}
