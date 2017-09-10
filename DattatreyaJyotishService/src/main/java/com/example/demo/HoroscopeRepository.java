package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoroscopeRepository extends CrudRepository<Horoscope, Long> {

	Horoscope findOne(Long id);

	List<Horoscope> findAll();

	void flush();

	@SuppressWarnings("unchecked")
	Horoscope save(Horoscope persisted);

	void delete(Long id);

}
