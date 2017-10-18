package dattatreya.jyotish.grahas;

import java.util.Set;

import dattatreya.jyotish.util.BhavaNames;
import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.Guna;
import dattatreya.jyotish.util.Mahavidya;
import dattatreya.jyotish.util.NakshatraNames;
import dattatreya.jyotish.util.RashiNames;
import dattatreya.jyotish.util.Tattva;
import dattatreya.jyotish.util.VISHNU_AVATARS;

public interface Graha {

	public void setDegrees(double degrees) ;
    public GrahaNames getGrahaName() ;
    public VISHNU_AVATARS getVishnuAvatar() ;
    public Mahavidya getMahaVidya() ;
    public Tattva getTattva();
    public Guna getGuna() ;
    public RashiNames getExaltationRashi() ;
    public RashiNames getMooltrikonaRashi() ;
    public RashiNames getOwnRashi() ;
	public Set<RashiNames> getGreatFriendSignsToGraha() ;
    public Set<RashiNames> getFriendSignsToGraha() ;
    public Set<RashiNames> getNuetralSignsToGraha() ;
    public Set<RashiNames> getEnemySignsToGraha() ;
    public Set<RashiNames> getGreatEnemySignsToGraha() ;
    public RashiNames getDebilitationRashi() ;
    public Set<NakshatraNames> getLordOfNakshatras();
	public Set<RashiNames> getLordOfRashis();
    public Set<BhavaNames> getKarakaForBhavas();
    public Set<String> getKarakaInLife();
	public Set<GrahaNames> getFriendsToGraha() ;
	public Set<GrahaNames> getNuetralToGraha() ;
    public Set<GrahaNames> getEnemiesToGraha() ;
    public Set<BhavaNames> getStrongestInBhavas() ;
    public Set<BhavaNames> getStrongInBhavas() ;
    public Set<BhavaNames> getNuetralInBhavas();
    public Set<BhavaNames> getWeakInBhavas() ;
    public Set<BhavaNames> getWeakestInBhavas() ;


}
