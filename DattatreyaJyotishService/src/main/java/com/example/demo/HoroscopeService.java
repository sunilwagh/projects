package com.example.demo;

import java.util.List;

/**
 * This service provides CRUD operation **/

public interface HoroscopeService {
	
    public Horoscope create(Horoscope horoscope);
	
	public List<Horoscope> findAll();
	
	public Horoscope findById(Long id);
	
	public Horoscope update(Horoscope horoscope);
	
	public Horoscope delete(Long id);
	
	
}
