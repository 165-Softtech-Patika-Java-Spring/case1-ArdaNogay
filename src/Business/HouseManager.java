package Business;

import Entities.House;

import java.util.List;

public class HouseManager implements HouseService{

    @Override
    public String getHouseList(List<House> houses) {
        String names = "Listelenen Evler :";
        for (House i : houses){
            names = names.concat(" "+i.getName());
        }
        return names;
    }

    @Override
    public Integer totalHousePrice(List<House> price) {
        int totalPrice=0;
        for (House i : price) {
            totalPrice += i.getPrice();
        }
        System.out.println("\nEvlerin toplam fiyatı;");
        return totalPrice;
    }

    @Override
    public Integer totalHouseSquareMeter(List<House> squareMeter) {
        int totalSquareMeter=0;
        for (House i : squareMeter) {
            totalSquareMeter += i.getSquareMeter();
        }
        System.out.println("\nEvlerin toplam metrekaresi;");
        return totalSquareMeter;
    }
}
