package C7_INTERFACES_AND_ABSTRACTION.Car_Shop;

import java.io.Serializable;

public interface Car extends Serializable {
    Integer TIRES  = 4;
    String getModel();
    String getColor();
    Integer getHorsePower();
    String countryProduced();

}
