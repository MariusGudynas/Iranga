package Iranga;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Irankiai {
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;	

	private String tipas;	
    private String inventoriaus_numeris;
    private String isigijimo_data;
    private String kaina;
    private String pavadinimas;
    private String nuomos_kaina;
    
	@Transient
	private ArrayList<String> errors;    
    
    
	public Irankiai() {
		// super();    
	}
    
	public Irankiai(String tipas, String inventoriaus_numeris, String isigijimo_data, String kaina, String pavadinimas, String nuomos_kaina) {
		this.setTipas(tipas);	
		this.setInventoriaus_numeris(inventoriaus_numeris);
		this.setIsigijimo_data(isigijimo_data);
		this.setKaina(kaina);
		this.setPavadinimas(pavadinimas);
		this.setNuomos_kaina(nuomos_kaina);
	}

	public String getTipas() {
		return tipas;
	}

	public void setTipas(String tipas) {
		this.tipas = tipas;
	}

	public String getInventoriaus_numeris() {
		return inventoriaus_numeris;
	}

	public void setInventoriaus_numeris(String inventoriaus_numeris) {
		this.inventoriaus_numeris = inventoriaus_numeris;
	}

	public String getIsigijimo_data() {
		return isigijimo_data;
	}

	public void setIsigijimo_data(String isigijimo_data) {
		this.isigijimo_data = isigijimo_data;
	}

	public String getKaina() {
		return kaina;
	}

	public void setKaina(String kaina) {
		this.kaina = kaina;
	}

	public String getPavadinimas() {
		return pavadinimas;
	}

	public void setPavadinimas(String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}

	public String getNuomos_kaina() {
		return nuomos_kaina;
	}

	public void setNuomos_kaina(String nuomos_kaina) {
		this.nuomos_kaina = nuomos_kaina;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
