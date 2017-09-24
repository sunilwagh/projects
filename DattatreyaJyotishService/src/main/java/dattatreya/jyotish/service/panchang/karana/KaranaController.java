package dattatreya.jyotish.service.panchang.karana;

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


@RestController
@RequestMapping("/karana")
final class KaranaController {

    private static final Logger LOGGER = LoggerFactory.getLogger(KaranaController.class);
    private KaranaService karanaService;

    
    @Autowired
    public KaranaController(KaranaService nakshatraService) {
        this.karanaService = karanaService;
    }
    
   
   @RequestMapping(value = "{id}", method = RequestMethod.GET)
   Karana getNakshtra(@PathVariable("id") int id) {
	   
        LOGGER.info("Finding todo entry by using id: {}", id);
        Karana karana = karanaService.getKarana(id);
        LOGGER.info("Found todo entry: {}", karana);
        return karana;
    }

   
    
    
  
    
    
    
}