package Business;

import Entities.House;

import java.util.List;

public interface HouseService {
    String getHouseList(List<House> houses);
    Integer totalHousePrice(List<House> price);
    Integer totalHouseSquareMeter(List<House> squareMeter);

}
