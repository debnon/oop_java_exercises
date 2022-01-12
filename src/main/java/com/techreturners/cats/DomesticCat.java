package com.techreturners.cats;

import java.util.Random;

public class DomesticCat extends Cat {

    public DomesticCat() {
        super(23,"domestic");
    }

    public String eat() {
        exclamation();
        return "Purrrrrrr";
    }

    public String exclamation() {
        int randomInt = new Random().nextInt(10);
        if (randomInt < 3) {
            return "It will do I suppose";
        } else {
            return "...";
        }
    }
}

