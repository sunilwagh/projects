package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoroscopeRepository extends CrudRepository<HoroscopeReport, Long> {

	HoroscopeReport findOne(Long id);

	List<HoroscopeReport> findAll();

	void flush();

	@SuppressWarnings("unchecked")
	HoroscopeReport save(HoroscopeReport persisted);

	void delete(Long id);

}
