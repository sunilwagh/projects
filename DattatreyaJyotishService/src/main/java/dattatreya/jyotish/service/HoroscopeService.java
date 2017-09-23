package dattatreya.jyotish.service;

import java.util.List;

/**
 * This service provides CRUD operation **/

public interface HoroscopeService {
	
    public HoroscopeReport create(HoroscopeReport horoscope);
	
	public List<HoroscopeReport> findAll();
	
	public HoroscopeReport findById(Long id);
	
	public HoroscopeReport update(HoroscopeReport horoscope);
	
	public HoroscopeReport delete(Long id);
	
	
}
