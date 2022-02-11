package Business;

import Entities.Summery;

import java.util.List;

public interface SummeryService {
    String getSummeryList(List<Summery> summeries);
    Integer totalSummeryPrice(List<Summery> price);
    Integer totalSummerySquareMeter(List<Summery> squareMeter);
}
