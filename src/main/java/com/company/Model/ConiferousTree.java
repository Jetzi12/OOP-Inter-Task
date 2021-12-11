package com.company.Model;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
public class ConiferousTree extends Plant implements Tree  {
    private final String commonName;
    private final String latinName;
    private Long height;
    private Long girth;
    private Boolean isBranches;
    private Boolean isStump;
    private Long quantityOfBranches;
    private Long numberOfNeedles;
    private final String type = "Coniferous";


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
}
