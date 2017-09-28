package dattatreya.jyotish.grahas;

import java.util.HashSet;
import java.util.Set;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.Guna;
import dattatreya.jyotish.util.NakshatraNames;
import dattatreya.jyotish.bhavas.Bhava;
import dattatreya.jyotish.panchang.nakshatras.Nakshatra;
import dattatreya.jyotish.panchang.nakshatras.padas.Pada;
import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.BhavaNames;
import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.RashiNames;
import dattatreya.jyotish.util.Tattva;

@Component("surya")
@Order(value=1)
public final class Surya implements Graha {

	
	Nakshatra nakshatra;
	Pada pada;
	double degrees;

	private final GrahaNames GRAHA_NAME = GrahaNames.SURYA;
	private final RashiNames MOOLTRIKONARASHI = RashiNames.LEO;
	private final RashiNames EXALTATION = RashiNames.ARIES;
	private final RashiNames DEBILITATION = RashiNames.LIBRA;
	private final RashiNames OWN = RashiNames.LEO;
	private final Set<RashiNames> FRIEND_SIGNS_TO_GRAHA = new HashSet<RashiNames>();
	private final Set<RashiNames> ENEMY_SIGNS_TO_GRAHA = new HashSet<RashiNames>();
	// private final Tattva TATTVA = Tattva.AKASH;
	private final Set<NakshatraNames> LORD_OF_NAKSHATRAS = new HashSet<NakshatraNames>();
	private final Guna GUNA = Guna.SATTVIC;
	private final Set<RashiNames> LORD_OF_RASHIS = new HashSet<RashiNames>();
	
	private final Set<BhavaNames> KARAKA = new HashSet<BhavaNames>();
	private final Set<String> KARAKA_IN_LIFE = new HashSet<String>();
	
	
	private final Set<GrahaNames> ENEMIES_TO_GRAHA = new HashSet<GrahaNames>();
	private final Set<GrahaNames> FRIENDS_TO_GRAHA = new HashSet<GrahaNames>();
	private final Set<GrahaNames> NUETRAL_TO_GRAHA = new HashSet<GrahaNames>();
	
	
	private final Set<BhavaNames> STRONGEST = new HashSet<BhavaNames>();
	private final Set<BhavaNames> STRONG = new HashSet<BhavaNames>();
	private final Set<BhavaNames> NUETRAL = new HashSet<BhavaNames>();
	private final Set<BhavaNames> WEAK = new HashSet<BhavaNames>();
	private final Set<BhavaNames> WEAKEST = new HashSet<BhavaNames>();

	Surya() {
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
		addKarakasInLifeForGraha();

	}

	public void addLordOfNakshatrasToGraha() {
		LORD_OF_NAKSHATRAS.add(NakshatraNames.KRITTIKA);
		LORD_OF_NAKSHATRAS.add(NakshatraNames.UTTAR_PHALGUNI);
		LORD_OF_NAKSHATRAS.add(NakshatraNames.UTTAR_ASHADA);
	}

	private void addLordOfRashisToGraha() {
		LORD_OF_RASHIS.add(RashiNames.LEO);

	}

	public void addKarakasToGraha() {
		KARAKA.add(BhavaNames.BHAVA4);
		KARAKA.add(BhavaNames.BHAVA10);

	}
	
	public void addKarakasInLifeForGraha() {
		KARAKA_IN_LIFE.add("Father");
		KARAKA_IN_LIFE.add("Government");
		KARAKA_IN_LIFE.add("Royalty");
		KARAKA_IN_LIFE.add("Ruling Powers");
		KARAKA_IN_LIFE.add("Places of Worship");
		KARAKA_IN_LIFE.add("Prana");
		KARAKA_IN_LIFE.add("Self");
		KARAKA_IN_LIFE.add("Soul");

	}

	public void addEnemiesToGraha() {
		ENEMIES_TO_GRAHA.add(GrahaNames.SHANI);
		ENEMIES_TO_GRAHA.add(GrahaNames.SHUKRA);
	}

	public void addFriendsToGraha() {
		FRIENDS_TO_GRAHA.add(GrahaNames.CHANDRA);
		FRIENDS_TO_GRAHA.add(GrahaNames.MANGAL);
		FRIENDS_TO_GRAHA.add(GrahaNames.GURU);

	}

	public void addNuetralToGraha() {

		NUETRAL_TO_GRAHA.add(GrahaNames.BUDHA);

	}

	public void addBhavasToStrongest() {
		STRONGEST.add(BhavaNames.BHAVA10);
	}

	public void addBhavasToStrong() {
		STRONG.add(BhavaNames.BHAVA3);
		STRONG.add(BhavaNames.BHAVA6);
		STRONG.add(BhavaNames.BHAVA11);

	}

	public void addBhavasToNuetral() {
		NUETRAL.add(BhavaNames.BHAVA1);
		NUETRAL.add(BhavaNames.BHAVA2);
		NUETRAL.add(BhavaNames.BHAVA5);
		NUETRAL.add(BhavaNames.BHAVA7);
		NUETRAL.add(BhavaNames.BHAVA9);
		NUETRAL.add(BhavaNames.BHAVA12);

	}

	public void addBhavasToWeak() {
		WEAK.add(BhavaNames.BHAVA4);

	}

	public void addBhavasToWeakest() {

	}

	public Nakshatra getNakshatra() {
		return nakshatra;
	}

	public void setNakshatra(Nakshatra nakshatra) {
		this.nakshatra = nakshatra;
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

	public Rashi getLagnaKundaliRashi() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setLagnaKundaliRashi(Rashi lagnaKundaliRashi) {
		// TODO Auto-generated method stub
		
	}

	public Bhava getBhava() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setBhava(Bhava bhava) {
		// TODO Auto-generated method stub
		
	}

	public Set<RashiNames> getLORD_OF_RASHIS() {
		// TODO Auto-generated method stub
		return null;
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

	public Set<NakshatraNames> getLordOfNakshatras() {
		return LORD_OF_NAKSHATRAS;
	}

	public Set<RashiNames> getLordOfRashis() {
		return LORD_OF_RASHIS;
	}

	public Set<BhavaNames> getNuetral() {
		return NUETRAL;
	}

	public RashiNames getMOOLTRIKONARASHI() {
		// TODO Auto-generated method stub
		return null;
	}

	public RashiNames getEXALTATION() {
		// TODO Auto-generated method stub
		return null;
	}

	public RashiNames getDEBILITATION() {
		// TODO Auto-generated method stub
		return null;
	}

	public RashiNames getOWN() {
		// TODO Auto-generated method stub
		return null;
	}

	public Tattva getTATTVA() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<NakshatraNames> getLORD_OF_NAKSHATRAS() {
		// TODO Auto-generated method stub
		return null;
	}

	public Guna getGUNA() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getKARAKA() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<GrahaNames> getENEMIES_TO_GRAHA() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<GrahaNames> getFRIENDS_TO_GRAHA() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<GrahaNames> getNUETRAL_TO_GRAHA() {
		// TODO Auto-generated method stub
		return null;
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
