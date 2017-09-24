package dattatreya.jyotish.panchang.yoga;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("siddha")
@Order(value=21)
public class Siddha implements Yoga {
	
	private final String feature ="A person born in Siddha Yoga is an all rounder. He is perfect in almost every work. He performs all his tasks with dedication and sincerity. He has good appearance and enjoys blissful life. He is always ready to help others. He also contributes to charities for poor and helpless. He may face some health related problems and difficulties in his life.";
	
	public String getFeature() {
		return feature;
	}


}
