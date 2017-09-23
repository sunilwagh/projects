package dattatreya.jyotish.service;

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


@RestController
@RequestMapping("/graha")
final class GrahaController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GrahaController.class);
    private GrahaService grahaService;

    
    @Autowired
    public GrahaController(GrahaService grahaService) {
        this.grahaService = grahaService;
    }
    
   
   @RequestMapping(value = "{id}", method = RequestMethod.GET)
   Graha getGraha(@PathVariable("id") int id) {
	   
        LOGGER.info("Finding todo entry by using id: {}", id);
        Graha graha = grahaService.getGraha(id);
        LOGGER.info("Found todo entry: {}", graha);
        return graha;
    }

   
    
    
  
    
    
    
}