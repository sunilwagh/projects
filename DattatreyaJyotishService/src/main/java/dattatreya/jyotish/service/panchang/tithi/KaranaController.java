package dattatreya.jyotish.service.panchang.tithi;

import java.util.List;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dattatreya.jyotish.grahas.Graha;
import dattatreya.jyotish.panchang.karana.Karana;
import dattatreya.jyotish.panchang.nakshatras.Nakshatra;
import dattatreya.jyotish.panchang.tithis.Tithi;


@RestController
@RequestMapping("/tithi")
final class TithiController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TithiController.class);
    private TithiService tithiService;

    
    @Autowired
    public TithiController(TithiService tithiService) {
        this.tithiService = tithiService;
    }
    
   
   @RequestMapping(value = "{id}", method = RequestMethod.GET)
   Tithi getNakshtra(@PathVariable("id") int id) {
	   
        LOGGER.info("Finding todo entry by using id: {}", id);
        Tithi tithi = tithiService.getTithi(id);
        LOGGER.info("Found todo entry: {}", tithi);
        return tithi;
    }

   
    
    
  
    
    
    
}