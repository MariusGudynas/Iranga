package Iranga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class PageController {
	
	@Autowired
	private KlientaiRepository klientai_repository;	

//	@RequestMapping(path="/klientai", method={ RequestMethod.GET, RequestMethod.POST })
//	public String Kliantas(
//			@RequestParam(name="id", required=false, defaultValue="0") String id
//			, @RequestParam(name="pav", required=false, defaultValue="-") String pav
//			
//			, @RequestParam(name="flag_skirtas_galutiniam_vartojimui", required=false, defaultValue="0") String flag_skirtas_galutiniam_vartojimui
//			, @RequestParam(name="vnt_mato", required=false, defaultValue="") String vnt_mato	
//			, @RequestParam(name="kiekis", required=false, defaultValue="2") String kiekis
//			, @RequestParam(name="kaina_uz_kiekio_vnt", required=false, defaultValue="4") String kaina_uz_kiekio_vnt
//			, @RequestParam(name="aprasymas", required=false, defaultValue="4") String aprasymas
//			
//			, @RequestParam(name="saugoti", required=false, defaultValue="nesaugoti") String saugoti
//			, Model model
//			) {
//		
//		if ( ( saugoti != null ) && saugoti.equals ("saugoti") ) {
//			
//			Zaliavos zaliava = new Zaliavos (
//					id
//					, pav	
//					, flag_skirtas_galutiniam_vartojimui
//					, vnt_mato
//					, kiekis
//					, kaina_uz_kiekio_vnt
//					, aprasymas	
//
//			);
//
//			zaliavos_repository.save( zaliava );
//		}
//		model.addAttribute("zaliavos", zaliavos_repository.findAll() );
//		
//		return "zaliavos";
//	}
	
	@RequestMapping(path="/klientai", method={ RequestMethod.GET, RequestMethod.POST })
	public String Kliantas(
			@RequestParam(name="id", required=false, defaultValue="0") String id
			
			, @RequestParam(name="tipas", required=false, defaultValue="-") String tipas
			, @RequestParam(name="pavadinimas", required=false, defaultValue="0") String pavadinimas
			, @RequestParam(name="kontaktai", required=false, defaultValue="") String kontaktai	
			
			, @RequestParam(name="saugoti", required=false, defaultValue="nesaugoti") String saugoti
			, Model model
			) {
		
		if ( ( saugoti != null ) && saugoti.equals ("saugoti") ) {
			
			Klientai klientas = new Klientai (
				  tipas	
				, pavadinimas
				, kontaktai
			);

			klientai_repository.save( klientas );
		}
		model.addAttribute("klientai", klientai_repository.findAll() );
		
		return "klientai";
	}
}
