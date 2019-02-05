package App.bankapplication.Data;


import org.springframework.stereotype.Component;



public enum Currency {

    DOLLARS(1.40) , POLISHZLOTYS(1.20) , EURO(1.10);


    private final double converter;
    Currency(double converter) {
        this.converter = converter;
    }
}
