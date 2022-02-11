package Business;

import Entities.BaseHouse;
import Entities.Villa;

import java.util.List;

public class VillaManager implements VillaService {
    @Override
    public String getVillaList(List<Villa> villas) {
        String names = "Listelenen Villalar :";
        for (Villa i : villas){
            names = names.concat(" "+i.getName());
        }
        return names;
    }

    @Override
    public Integer totalVillaPrice(List<Villa> price) {
        int totalPrice=0;
        for (Villa i : price) {
            totalPrice += i.getPrice();
        }
        System.out.println("\nVillaların toplam fiyatı;");
        return totalPrice;
    }

    @Override
    public Integer totalVillaSquareMeter(List<Villa> squareMeter) {
        int totalSquareMeter=0;
        for (Villa i : squareMeter) {
            totalSquareMeter += i.getSquareMeter();
        }
        System.out.println("\nVillaların toplam metrekaresi;");
        return totalSquareMeter;
    }


}
