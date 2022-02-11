package Business;

import Entities.Summery;

import java.util.List;

public class SummeryManager implements SummeryService {
    @Override
    public String getSummeryList(List<Summery> summeries) {
        String names = "Listelenen Yazlıklar :";
        for (Summery i : summeries){
            names = names.concat(" "+i.getName());
        }
        return names;
    }

    @Override
    public Integer totalSummeryPrice(List<Summery> price) {
        int totalPrice=0;
        for (Summery i : price) {
            totalPrice += i.getPrice();
        }
        System.out.println("\nYazlıkların toplam fiyatı;");
        return totalPrice;
    }


    @Override
    public Integer totalSummerySquareMeter(List<Summery> squareMeter) {
        int totalSquareMeter=0;
        for (Summery i : squareMeter) {
            totalSquareMeter += i.getSquareMeter();
        }
        System.out.println("\nYazlıkların toplam metrekaresi;");
        return totalSquareMeter;
    }
}
