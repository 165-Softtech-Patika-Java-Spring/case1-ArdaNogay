package Business;

import Entities.BaseHouse;
import Entities.House;
import Entities.Summery;
import Entities.Villa;

import java.util.List;

public interface BaseHousingService {

    Integer totalHousingPrice(List<House> houses, List<Summery> summeries, List<Villa> villas);

    Integer totalHousingSquareMeter(List<House> houses, List<Summery> summeries, List<Villa> villas);

    String filterRooms(List<House> houses, List<Summery> summeries, List<Villa> villas,
                       int numberOfRooms, int numberOfHalls);

}
