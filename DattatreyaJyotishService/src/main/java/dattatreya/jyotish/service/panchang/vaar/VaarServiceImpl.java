package dattatreya.jyotish.service.panchang.vaar;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import dattatreya.jyotish.panchang.vaar.Vaar;

@Service
public class VaarServiceImpl implements VaarService {

	private static final Logger LOGGER = LoggerFactory.getLogger(VaarServiceImpl.class);

	@Autowired
	List<Vaar> vaars;

	@Transactional(readOnly = true)
	@Override
	public Vaar getVaar(int id) {
		LOGGER.info("Finding todo entry by using id: {}", id);
		Vaar vaar= vaars.get(id-1);
		LOGGER.info("Found todo entry: {}",vaars);
        return vaar;
	}

	

}