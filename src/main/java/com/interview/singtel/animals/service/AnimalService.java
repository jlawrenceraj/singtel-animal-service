package com.interview.singtel.animals.service;

import java.util.List;

public interface AnimalService {

    public int count(Class<? extends Activities> activity) ;

    public List<String> listAnimals(Class<? extends Activities> activity) ;

    public List<String> listAnimals() ;

}
