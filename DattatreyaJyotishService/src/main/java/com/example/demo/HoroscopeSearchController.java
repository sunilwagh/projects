package com.example.demo;

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


@RestController
@RequestMapping("/horoscope")
final class HoroscopeSearchController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HoroscopeSearchController.class);
    private HoroscopeService horoscopeService;

    
    @Autowired
    public HoroscopeSearchController(HoroscopeService horoscopeService) {
        this.horoscopeService = horoscopeService;
    }
    
   
    @RequestMapping(method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    HoroscopeReport create(@RequestBody @Valid HoroscopeReport newHoroscopeEntry) {
        LOGGER.info("Creating a new horoscope entry by using information: {}", newHoroscopeEntry);
        HoroscopeReport created = horoscopeService.create(newHoroscopeEntry);
        LOGGER.info("Created a new horoscope entry: {}", created);

        return created;
    }

    
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public HoroscopeReport delete(@PathVariable("id") Long id) {
        LOGGER.info("Deleting a todo entry with id: {}", id);
        HoroscopeReport deleted = horoscopeService.delete(id);
        LOGGER.info("Deleted the todo entry: {}", deleted);
        return deleted;
    }

   
    @RequestMapping(method = RequestMethod.GET)
    List<HoroscopeReport> findAll() {
        LOGGER.info("Finding all todo entries");
        List<HoroscopeReport> horoscopeEntries = horoscopeService.findAll();
        LOGGER.info("Found {} todo entries.", horoscopeEntries.size());
        return horoscopeEntries;
    }

   
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    HoroscopeReport findById(@PathVariable("id") Long id) {
        LOGGER.info("Finding todo entry by using id: {}", id);
        HoroscopeReport todoEntry = horoscopeService.findById(id);
        LOGGER.info("Found todo entry: {}", todoEntry);
        return todoEntry;
    }

   
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    HoroscopeReport update(@RequestBody @Valid HoroscopeReport horoscope) {
        LOGGER.info("Updating the information of a todo entry by using information: {}", horoscope);
        HoroscopeReport updated = horoscopeService.update(horoscope);
        LOGGER.info("Updated the information of the todo entrY: {}", updated);
        return updated;
    }
    
    
    
}