package com.interview.singtel.animals.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.interview.singtel.animals.service.AnimalService;
import com.interview.singtel.animals.utils.ActivitiesFactory;

@RestController
public class AnimalController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AnimalController.class);

    @Autowired
    private AnimalService animalService;

    @GetMapping(value = "/animals", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> listAnimals() {
        return ResponseEntity.ok().body(animalService.listAnimals());
    }

    @GetMapping(value = "/animals/{activity}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> getAnimals(@PathVariable String activity) {
    	LOGGER.debug("Activity: ", activity);
        return ResponseEntity.ok().body(animalService.listAnimals(ActivitiesFactory.getActivity(activity)));
    }

    @GetMapping(value = "/animals/{activity}/count", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> count(@PathVariable String activity) {
    	LOGGER.debug("Activity: ", activity);
        return ResponseEntity.ok().body(animalService.count(ActivitiesFactory.getActivity(activity)));
    }
}
