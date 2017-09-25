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
import dattatreya.jyotish.util.RashiNames;
import dattatreya.jyotish.util.Tattva;


@Component("ketu")
@Order(value=9)
public class Ketu implements Graha{
	
	
	public Set<RashiNames> getFRIEND_SIGNS_TO_GRAHA() {
		return FRIEND_SIGNS_TO_GRAHA;
	}
	public Set<RashiNames> getENEMY_SIGNS_TO_GRAHA() {
		return ENEMY_SIGNS_TO_GRAHA;
	}
	Nakshatra nakshatra;
	Pada pada;
	double degrees;
	
	private final Set<RashiNames> FRIEND_SIGNS_TO_GRAHA = new HashSet<RashiNames>();
	private final Set<RashiNames> ENEMY_SIGNS_TO_GRAHA = new HashSet<RashiNames>();
	
	
	
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
	
	
	
	
	
	
	
}
