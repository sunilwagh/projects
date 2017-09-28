package dattatreya.jyotish.grahas;

import java.util.HashSet;
import java.util.Set;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.bhavas.Bhava;
import dattatreya.jyotish.panchang.nakshatras.Nakshatra;
import dattatreya.jyotish.panchang.nakshatras.padas.Pada;
import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.BhavaNames;
import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.Guna;
import dattatreya.jyotish.util.NakshatraNames;
import dattatreya.jyotish.util.RashiNames;
import dattatreya.jyotish.util.Tattva;

@Component("ketu")
@Order(value = 9)
public class Ketu implements Graha {

	public Set<RashiNames> getFRIEND_SIGNS_TO_GRAHA() {
		return FRIEND_SIGNS_TO_GRAHA;
	}

	public Set<RashiNames> getENEMY_SIGNS_TO_GRAHA() {
		return ENEMY_SIGNS_TO_GRAHA;
	}

	Nakshatra nakshatra;
	Pada pada;
	double degrees;
	private StringBuilder notes;

	private final Set<RashiNames> FRIEND_SIGNS_TO_GRAHA = new HashSet<RashiNames>();
	private final Set<RashiNames> ENEMY_SIGNS_TO_GRAHA = new HashSet<RashiNames>();

	private final Set<BhavaNames> STRONGEST = new HashSet<BhavaNames>();
	private final Set<BhavaNames> STRONG = new HashSet<BhavaNames>();
	private final Set<BhavaNames> NUETRAL = new HashSet<BhavaNames>();
	private final Set<BhavaNames> WEAK = new HashSet<BhavaNames>();
	private final Set<BhavaNames> WEAKEST = new HashSet<BhavaNames>();

	public Ketu() {

		addBhavasToStrongest();
		addBhavasToStrong();
		addBhavasToNuetral();
		addBhavasToWeak();
		addBhavasToWeakest();
		addNotes();

	}

	private void addNotes() {
		notes.append("Ketu is the keeper of the knowledge of past lives.");
		notes.append("The aim of Ketu is renunciation.");
		notes.append(
				"Ketu overshadows the planet it is conjunct with, it pinpoints the Karma we are still attached too from the previous life and find it difficult to give up");
		notes.append(
				"Conjunct any planet, it will encourage you to give up something related to that planet's energy, as the planet symbolize relationships, something needs to be given up regarding that person.");

	}

	public void addBhavasToStrongest() {
		STRONGEST.add(BhavaNames.BHAVA12);
	}

	public void addBhavasToStrong() {
		STRONG.add(BhavaNames.BHAVA3);
		STRONG.add(BhavaNames.BHAVA11);

	}

	public void addBhavasToNuetral() {

	}

	public void addBhavasToWeak() {

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
