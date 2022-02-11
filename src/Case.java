import Business.*;
import Entities.BaseHouse;
import Entities.House;
import Entities.Summery;
import Entities.Villa;

import java.util.ArrayList;
import java.util.List;

public class Case {
    public static void main(String[] args) {
        // EV VE VİLLA TANIMLAMALARI
        House house1 = new House(1,100,120,2,1,"Ev1");
        House house2 = new House(2,100,120,3,1,"Ev2");
        House house3 = new House(3,100,120,3,0,"Ev3");
        List<House> houseList = new ArrayList<>();
        houseList.add(house1);
        houseList.add(house2);
        houseList.add(house3);

        Summery summery1 = new Summery(1,100,120,2,1,"Yazlık1");
        Summery summery2 = new Summery(1,100,120,3,1,"Yazlık2");
        Summery summery3 = new Summery(1,100,120,3,0,"Yazlık3");
        List<Summery> summeryList = new ArrayList<>();
        summeryList.add(summery1);
        summeryList.add(summery2);
        summeryList.add(summery3);

        Villa villa1 = new Villa(1,100,120,2,1,"Villa1");
        Villa villa2 = new Villa(1,100,120,3,1,"Villa2");
        Villa villa3 = new Villa(1,100,120,3,0,"Villa3");
        List<Villa> villaList = new ArrayList<>();
        villaList.add(villa1);
        villaList.add(villa2);
        villaList.add(villa3);

        System.out.println("-----------------------------------");

        VillaService villaService = new VillaManager();
        System.out.println(villaService.getVillaList(villaList));
        System.out.println(villaService.totalVillaPrice(villaList));
        System.out.println(villaService.totalVillaSquareMeter(villaList));

        System.out.println("-----------------------------------");

        SummeryService summeryService = new SummeryManager();
        System.out.println(summeryService.getSummeryList(summeryList));
        System.out.println(summeryService.totalSummeryPrice(summeryList));
        System.out.println(summeryService.totalSummerySquareMeter(summeryList));

        System.out.println("-----------------------------------");

        HouseService houseService = new HouseManager();
        System.out.println(houseService.getHouseList(houseList));
        System.out.println(houseService.totalHousePrice(houseList));
        System.out.println(houseService.totalHouseSquareMeter(houseList));

        System.out.println("-----------------------------------");

        BaseHousingService baseHousingService = new BaseHousingManager();
        System.out.println(baseHousingService.totalHousingPrice(houseList,summeryList,villaList));
        System.out.println(baseHousingService.totalHousingSquareMeter(houseList,summeryList,villaList));
        System.out.println(baseHousingService.filterRooms(houseList,summeryList,villaList,1,1));

    }
}
