package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * https://github.com/pkainulainen/spring-data-jpa-examples/blob/master/query-methods/src/main/java/net/petrikainulainen/springdata/jpa/todo/TodoCrudService.java
 */

@Service
public class HoroscopeServiceImpl implements HoroscopeService {

	private static final Logger LOGGER = LoggerFactory.getLogger(HoroscopeServiceImpl.class);

	private final HoroscopeRepository repository;

	@Autowired
	HoroscopeServiceImpl(HoroscopeRepository repository) {
		this.repository = repository;
	}

	@Transactional(readOnly = true)
	@Override
	public List<Horoscope> findAll() {
		LOGGER.info("Finding all horoscopes");
		List<Horoscope> horoscopes = repository.findAll();
		LOGGER.info("Found horoscopes no: ", horoscopes.size());
		return horoscopes;
	}

	@Transactional
	@Override
	public Horoscope create(Horoscope horoscope) {
		LOGGER.info("Creating a new todo entry by using information: {}", horoscope);
		horoscope = repository.save(horoscope);
		LOGGER.info("Created a new todo entry: {}", horoscope);
		return horoscope;
	}

	@Transactional
	@Override
	public Horoscope delete(Long id) {
		LOGGER.info("Deleting a todo entry with id: {}", id);

		Horoscope deleted = findTodoEntryById(id);
		LOGGER.debug("Found todo entry: {}", deleted);

		repository.delete(deleted);
		LOGGER.info("Deleted todo entry: {}", deleted);

		return deleted;
	}

	@Transactional(readOnly = true)
	@Override
	public Horoscope findById(Long id) {
		LOGGER.info("Finding todo entry by using id: {}", id);

		Horoscope horoscope = findTodoEntryById(id);
		LOGGER.info("Found todo entry: {}", horoscope);

		return horoscope;
	}

	@Transactional
	@Override
	public Horoscope update(Horoscope updatedEntry) {
		LOGGER.info("Updating the information of a todo entry by using information: {}", updatedEntry);

		Horoscope updated = findTodoEntryById(updatedEntry.getId());
		updated.setFirstName(updatedEntry.getFirstName());

		// We need to flush the changes or otherwise the returned object
		// doesn't contain the updated audit information.
		repository.flush();

		LOGGER.info("Updated the information of the todo entry: {}", updated);

		return updated;
	}

	private Horoscope findTodoEntryById(Long id) {
		Horoscope horoscope = repository.findOne(id);
		return horoscope;
	}

}