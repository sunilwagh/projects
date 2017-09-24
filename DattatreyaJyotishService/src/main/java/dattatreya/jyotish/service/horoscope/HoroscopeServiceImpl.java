package dattatreya.jyotish.service.horoscope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


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
	public List<HoroscopeReport> findAll() {
		LOGGER.info("Finding all horoscopes");
		List<HoroscopeReport> horoscopeReports = repository.findAll();
		LOGGER.info("Found horoscopes no: ", horoscopeReports.size());
		return horoscopeReports;
	}

	@Transactional
	@Override
	public HoroscopeReport create(HoroscopeReport horoscopeReport) {
		LOGGER.info("Creating a new todo entry by using information: {}", horoscopeReport);
		horoscopeReport = repository.save(horoscopeReport);
		LOGGER.info("Created a new todo entry: {}", horoscopeReport);
		return horoscopeReport;
	}

	@Transactional
	@Override
	public HoroscopeReport delete(Long id) {
		LOGGER.info("Deleting a todo entry with id: {}", id);

		HoroscopeReport deleted = findTodoEntryById(id);
		LOGGER.debug("Found todo entry: {}", deleted);

		repository.delete(deleted);
		LOGGER.info("Deleted todo entry: {}", deleted);

		return deleted;
	}

	@Transactional(readOnly = true)
	@Override
	public HoroscopeReport findById(Long id) {
		LOGGER.info("Finding todo entry by using id: {}", id);
        HoroscopeReport horoscopeReport = findTodoEntryById(id);
		LOGGER.info("Found todo entry: {}", horoscopeReport);
        return horoscopeReport;
	}

	@Transactional
	@Override
	public HoroscopeReport update(HoroscopeReport updatedEntry) {
		LOGGER.info("Updating the information of a todo entry by using information: {}", updatedEntry);

		HoroscopeReport updated = findTodoEntryById(updatedEntry.getId());
		updated.setFirstName(updatedEntry.getFirstName());

		// We need to flush the changes or otherwise the returned object
		// doesn't contain the updated audit information.
		repository.flush();

		LOGGER.info("Updated the information of the todo entry: {}", updated);

		return updated;
	}

	private HoroscopeReport findTodoEntryById(Long id) {
		HoroscopeReport horoscope = repository.findOne(id);
		return horoscope;
	}

}