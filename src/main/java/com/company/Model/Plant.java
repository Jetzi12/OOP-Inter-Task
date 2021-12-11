package com.company.Model;


public abstract class Plant {

    public Long photosythesis(Long quantityOfSunEnergy, Long numberOfCO2){
        Long oxygen;
        oxygen = quantityOfSunEnergy + numberOfCO2;
        return oxygen;
    }

    public void shedLeaves(Long numberOfLeaves){
        numberOfLeaves = 0L;
    }

}

