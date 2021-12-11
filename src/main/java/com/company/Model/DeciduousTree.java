package com.company.Model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class DeciduousTree extends Plant implements Tree  {
    private final String commonName;
    private final String latinName;
    private Long height;
    private Long girth;
    private Boolean isBranches;
    private Boolean isStump;
    private Long quantityOfBranches;
    private Long numberOfLeaves;
    private final String type = "Deciduous";

    @Override
    public void growUp() {

    }

    @Override
    public void increaseRoots() {

    }

    @Override
    public void createNewRoots() {

    }

    @Override
    public Long fotosythesis(Long quantityOfSunEnergy, Long numberOfCO2) {
        return super.fotosythesis(quantityOfSunEnergy, numberOfCO2);
    }


    public Long fotosythesis(Long quantityOfSunEnergy, Long numberOfCO2, Long quantityOfOxygen) {
        return super.fotosythesis(quantityOfSunEnergy, numberOfCO2);
    }

    @Override
    public void shedLeaves(Long numberOfLeaves) {
        super.shedLeaves(numberOfLeaves);
    }
}
