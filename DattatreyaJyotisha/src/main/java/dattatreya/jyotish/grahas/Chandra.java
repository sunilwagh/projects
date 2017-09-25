package dattatreya.jyotish.grahas;

import java.util.HashSet;
import java.util.Set;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.bhavas.Bhava;
import dattatreya.jyotish.panchang.nakshatras.Nakshatra;
import dattatreya.jyotish.panchang.nakshatras.padas.Pada;
import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.Guna;
import dattatreya.jyotish.util.NakshatraNames;
import dattatreya.jyotish.util.BhavaNames;
import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.RashiNames;
import dattatreya.jyotish.util.Tattva;

@Component("chandra")
@Order(value=2)
public final class Chandra implements Graha{
	
	//FEMALE
	
	Rashi lagnaKundaliRashi;
	Nakshatra nakshatra;
	Bhava bhava;
	Pada pada;
	double degrees;
	
	private  final GrahaNames GRAHA_NAME = GrahaNames.CHANDRA;
	private  final RashiNames MOOLTRIKONARASHI = RashiNames.TAURUS;
	private  final RashiNames EXALTATION = RashiNames.TAURUS;
	private  final RashiNames DEBILITATION = RashiNames.SCORPIO;
	private  final RashiNames OWN = RashiNames.CANCER;
	private final Set<RashiNames> FRIEND_SIGNS_TO_GRAHA = new HashSet<RashiNames>();
	private final Set<RashiNames> ENEMY_SIGNS_TO_GRAHA = new HashSet<RashiNames>();
	private  final Tattva TATTVA = Tattva.APA;
	private  final Set<NakshatraNames> LORD_OF_NAKSHATRAS = new HashSet<NakshatraNames>();
	private  final Guna GUNA = Guna.SATTVIC;
	private  final Set<RashiNames> LORD_OF_RASHIS = new HashSet<RashiNames>();
	private  final Set<BhavaNames> KARAKA = new HashSet<BhavaNames>();
	private  final Set<GrahaNames> ENEMIES_TO_GRAHA = new HashSet<GrahaNames>();
	private  final Set<GrahaNames> FRIENDS_TO_GRAHA = new HashSet<GrahaNames>();
	private  final Set<GrahaNames> NUETRAL_TO_GRAHA = new HashSet<GrahaNames>();
	private  final Set<BhavaNames> STRONGEST_IN_BHAVAS = new HashSet<BhavaNames>();
	private  final Set<BhavaNames> STRONG_IN_BHAVAS = new HashSet<BhavaNames>();
	private  final Set<BhavaNames> NUETRAL_IN_BHAVAS = new HashSet<BhavaNames>();
	private  final Set<BhavaNames> WEAK_IN_BHAVAS = new HashSet<BhavaNames>();
	private  final Set<BhavaNames> WEAKEST_IN_BHAVAS = new HashSet<BhavaNames>();

	public Chandra() 
	{
		addFriendsToGraha();
		addEnemiesToGraha();
		addLordOfNakshatrasToGraha();
		addKarakasToGraha();
		addLordOfRashisToGraha();
		addBhavasToStrongest();
		addBhavasToStrong();
		addBhavasToNuetral();
		addBhavasToWeak();
		addBhavasToWeakest();

	}

	public  void addLordOfNakshatrasToGraha() {
		LORD_OF_NAKSHATRAS.add(NakshatraNames.ROHINI);
		LORD_OF_NAKSHATRAS.add(NakshatraNames.HASTA);
		LORD_OF_NAKSHATRAS.add(NakshatraNames.SHRAVANA);
	}

	private  void addLordOfRashisToGraha() {
		LORD_OF_RASHIS.add(RashiNames.CANCER);
		

	}

	public  void addKarakasToGraha() {
		

	}

	public  void addEnemiesToGraha() {
		

	}

	public  void addFriendsToGraha() {
		FRIENDS_TO_GRAHA.add(GrahaNames.SURYA);
		FRIENDS_TO_GRAHA.add(GrahaNames.BUDHA);

	}

	public  void addNuetralToGraha() {
		NUETRAL_TO_GRAHA.add(GrahaNames.MANGAL);
		NUETRAL_TO_GRAHA.add(GrahaNames.GURU);
		NUETRAL_TO_GRAHA.add(GrahaNames.SHANI);
		NUETRAL_TO_GRAHA.add(GrahaNames.SHUKRA);

	}

	public  void addBhavasToStrongest() {
		STRONGEST_IN_BHAVAS.add(BhavaNames.BHAVA4);
	}

	public  void addBhavasToStrong() {
		STRONG_IN_BHAVAS.add(BhavaNames.BHAVA5);
		STRONG_IN_BHAVAS.add(BhavaNames.BHAVA9);
		STRONG_IN_BHAVAS.add(BhavaNames.BHAVA11);
		
	}

	public  void addBhavasToNuetral() {
		NUETRAL_IN_BHAVAS.add(BhavaNames.BHAVA1);
		NUETRAL_IN_BHAVAS.add(BhavaNames.BHAVA2);
		NUETRAL_IN_BHAVAS.add(BhavaNames.BHAVA3);

	}

	public  void addBhavasToWeak() {
		WEAK_IN_BHAVAS.add(BhavaNames.BHAVA6);
		WEAK_IN_BHAVAS.add(BhavaNames.BHAVA8);
		WEAK_IN_BHAVAS.add(BhavaNames.BHAVA12);

	}

	public  void addBhavasToWeakest() {
		WEAKEST_IN_BHAVAS.add(BhavaNames.BHAVA10);

	}

	
	public Rashi getLagnaKundaliRashi() {
		return lagnaKundaliRashi;
	}
	public void setLagnaKundaliRashi(Rashi lagnaKundaliRashi) {
		this.lagnaKundaliRashi = lagnaKundaliRashi;
	}
	public Nakshatra getNakshatra() {
		return nakshatra;
	}
	public void setNakshatra(Nakshatra nakshatra) {
		this.nakshatra = nakshatra;
	}
	public Bhava getBhava() {
		return bhava;
	}
	public void setBhava(Bhava bhava) {
		this.bhava = bhava;
	}
	public Pada getPada() {
		return pada;
	}
	public void setPada(Pada pada) {
		this.pada = pada;
	}
	public double getDegrees() {
		return degrees;
	}
	public void setDegrees(double degrees) {
		this.degrees = degrees;
	}

	public GrahaNames getGRAHA_NAME() {
		return GRAHA_NAME;
	}

	public RashiNames getMOOLTRIKONARASHI() {
		return MOOLTRIKONARASHI;
	}

	public RashiNames getEXALTATION() {
		return EXALTATION;
	}

	public RashiNames getDEBILITATION() {
		return DEBILITATION;
	}

	public RashiNames getOWN() {
		return OWN;
	}

	public Tattva getTATTVA() {
		return TATTVA;
	}

	public Set<NakshatraNames> getLORD_OF_NAKSHATRAS() {
		return LORD_OF_NAKSHATRAS;
	}

	public Guna getGUNA() {
		return GUNA;
	}

	public Set<RashiNames> getLORD_OF_RASHIS() {
		return LORD_OF_RASHIS;
	}

	public Set<BhavaNames> getKARAKA() {
		return KARAKA;
	}

	public Set<GrahaNames> getENEMIES_TO_GRAHA() {
		return ENEMIES_TO_GRAHA;
	}

	public Set<GrahaNames> getFRIENDS_TO_GRAHA() {
		return FRIENDS_TO_GRAHA;
	}

	public Set<GrahaNames> getNUETRAL_TO_GRAHA() {
		return NUETRAL_TO_GRAHA;
	}

	public Set<BhavaNames> getSTRONGEST_IN_BHAVAS() {
		return STRONGEST_IN_BHAVAS;
	}

	public Set<BhavaNames> getSTRONG_IN_BHAVAS() {
		return STRONG_IN_BHAVAS;
	}

	public Set<BhavaNames> getNUETRAL_IN_BHAVAS() {
		return NUETRAL_IN_BHAVAS;
	}

	public Set<BhavaNames> getWEAK_IN_BHAVAS() {
		return WEAK_IN_BHAVAS;
	}

	public Set<BhavaNames> getWEAKEST_IN_BHAVAS() {
		return WEAKEST_IN_BHAVAS;
	}

	public GrahaNames getGrahaName() {
		// TODO Auto-generated method stub
		return null;
	}

	public RashiNames getMooltrikonarashi() {
		// TODO Auto-generated method stub
		return null;
	}

	public RashiNames getExaltation() {
		// TODO Auto-generated method stub
		return null;
	}

	public RashiNames getDebilitation() {
		// TODO Auto-generated method stub
		return null;
	}

	public RashiNames getOwn() {
		// TODO Auto-generated method stub
		return null;
	}

	public Tattva getTattva() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getKaraka() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<GrahaNames> getEnemiesToGraha() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<GrahaNames> getFriendsToGraha() {
		// TODO Auto-generated method stub
		return null;
	}

	public Guna getGuna() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getStrongest() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getStrong() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<GrahaNames> getNuetralToGraha() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getWeak() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getWeakest() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<RashiNames> getFRIEND_SIGNS_TO_GRAHA() {
		return FRIEND_SIGNS_TO_GRAHA;
	}

	public Set<RashiNames> getENEMY_SIGNS_TO_GRAHA() {
		return ENEMY_SIGNS_TO_GRAHA;
	}

	public Set<BhavaNames> getSTRONGEST() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getSTRONG() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getNUETRAL() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getWEAK() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getWEAKEST() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
