package dattatreya.jyotish.grahas;

import java.util.Set;

import dattatreya.jyotish.bhavas.Bhava;
import dattatreya.jyotish.panchang.nakshatras.Nakshatra;
import dattatreya.jyotish.panchang.nakshatras.padas.Pada;
import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.BhavaNames;
import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.Guna;
import dattatreya.jyotish.util.RashiNames;
import dattatreya.jyotish.util.Tattva;

public interface Graha {

	public Rashi getLagnaKundaliRashi();

	public void setLagnaKundaliRashi(Rashi lagnaKundaliRashi);

	public Nakshatra getNakshatra();

	public void setNakshatra(Nakshatra nakshatra);

	public Bhava getBhava();

	public void setBhava(Bhava bhava);

	public Pada getPada();

	public void setPada(Pada pada);

	public double getDegrees();

	public void setDegrees(double degrees);

	public Set<RashiNames> getLORD_OF_RASHIS();

	public GrahaNames getGrahaName();

	public RashiNames getMooltrikonarashi();

	public RashiNames getExaltation();

	public RashiNames getDebilitation();

	public RashiNames getOwn();

	public Tattva getTattva();

	public Set<BhavaNames> getKaraka();

	public Set<GrahaNames> getEnemiesToGraha();

	public Set<GrahaNames> getFriendsToGraha();

	public Guna getGuna();

	public Set<BhavaNames> getStrongest();

	public Set<BhavaNames> getStrong();

	public Set<GrahaNames> getNuetralToGraha();

	public Set<BhavaNames> getWeak();

	public Set<BhavaNames> getWeakest();
	
	public Set<RashiNames> getFRIEND_SIGNS_TO_GRAHA();

	public Set<RashiNames> getENEMY_SIGNS_TO_GRAHA();
}
