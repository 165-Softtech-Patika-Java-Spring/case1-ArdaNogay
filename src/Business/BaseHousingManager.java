package Business;

import Entities.BaseHouse;
import Entities.House;
import Entities.Summery;
import Entities.Villa;

import java.util.ArrayList;
import java.util.List;

public class BaseHousingManager implements BaseHousingService{
    @Override
    public Integer totalHousingPrice(List<House> houses, List<Summery> summeries, List<Villa> villas) {
        List<BaseHouse> list = new ArrayList<>();
        list.addAll(houses);
        list.addAll(summeries);
        list.addAll(villas);

        int totalHousingPrice = 0;

        for(BaseHouse house : list){
            totalHousingPrice += house.getPrice();
        }
        System.out.println("\nTüm evlerin toplam fiyatı : ");
        return totalHousingPrice;
    }

    @Override
    public Integer totalHousingSquareMeter(List<House> houses, List<Summery> summeries, List<Villa> villas) {
        List<BaseHouse> list = new ArrayList<>();
        list.addAll(houses);
        list.addAll(summeries);
        list.addAll(villas);

        int totalHousingSquareMeter = 0;

        for(BaseHouse house : list){
            totalHousingSquareMeter += house.getSquareMeter();
        }
        System.out.println("\nTüm evlerin toplam metrekaresi : ");
        return totalHousingSquareMeter;
    }

    @Override
    public String filterRooms(List<House> houses, List<Summery> summeries, List<Villa> villas,
        int numberOfRooms, int numberOfHalls) {
        List<BaseHouse> list = new ArrayList<>();
        list.addAll(houses);
        list.addAll(summeries);
        list.addAll(villas);

        String listedItems = "";
        for(BaseHouse i: list){
            if(i.getNumberOfRooms()==numberOfRooms && i.getNumberOfHalls()==numberOfHalls){
                listedItems = listedItems.concat(" "+i.getName());
            }
        }
        if(listedItems == ""){
            listedItems = "Aranan niteliklerde ev bulunamamıştır.";
        }
        else{
            System.out.println("\nArama kriterlerinize göre " + numberOfRooms + " oda " + numberOfHalls + " salona sahip");
            listedItems = "Listelenen Evleriniz :" + listedItems;
        }
        return  listedItems;
    }

}
