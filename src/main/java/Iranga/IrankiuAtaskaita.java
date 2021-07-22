package Iranga;

public class IrankiuAtaskaita {
	
	private String pavadinimas;
	private int is_viso;
	private int fiziniai_asmenys_sk;
	private int juridinai_asmenys_sk;
	
	public IrankiuAtaskaita() {}
	
	public IrankiuAtaskaita(String pavadinimas, int is_viso, int fiziniai_asmenys_sk, int juridinai_asmenys_sk) {

		this.setPavadinimas(pavadinimas);
		this.setIs_viso(is_viso);
		this.setFiziniai_asmenys_sk(fiziniai_asmenys_sk);
		this.setJuridinai_asmenys_sk(juridinai_asmenys_sk);
	}

	public String getPavadinimas() {
		return pavadinimas;
	}

	public void setPavadinimas(String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}

	public int getIs_viso() {
		return is_viso;
	}

	public void setIs_viso(int is_viso) {
		this.is_viso = is_viso;
	}

	public int getFiziniai_asmenys_sk() {
		return fiziniai_asmenys_sk;
	}

	public void setFiziniai_asmenys_sk(int fiziniai_asmenys_sk) {
		this.fiziniai_asmenys_sk = fiziniai_asmenys_sk;
	}

	public int getJuridinai_asmenys_sk() {
		return juridinai_asmenys_sk;
	}

	public void setJuridinai_asmenys_sk(int juridinai_asmenys_sk) {
		this.juridinai_asmenys_sk = juridinai_asmenys_sk;
	}

}
