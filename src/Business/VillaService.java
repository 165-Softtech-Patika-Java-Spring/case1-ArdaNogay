package Business;

import Entities.BaseHouse;
import Entities.Villa;

import java.util.List;

public interface VillaService {
    String getVillaList(List<Villa> villas);
    Integer totalVillaPrice(List<Villa> price);
    Integer totalVillaSquareMeter(List<Villa> squareMeter);

}
