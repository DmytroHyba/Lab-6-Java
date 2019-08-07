package ua.lviv.iot.tourism.manager;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.tourism.models.*;

public class TourismManager  {

  private List<Tour> tours;

  public TourismManager() {
  }

  public TourismManager(final List<Tour> tours) {
    this.tours = tours;
  }

  public final List<Tour> sortByPrice(final boolean descending) {
    Comparator<Tour> comparator = (Tour obj1, Tour obj2) ->
            Double.compare(obj1.getPrice(), obj2.getPrice());

    if (descending) {
      Collections.sort(tours, comparator.reversed());
    } else {
      tours.sort(comparator);
    }
    return tours;
  }

  public final List<Tour> sortByRating(final boolean descending) {
    Comparator<Tour> comparator = (Tour obj1, Tour obj2) ->
            (obj1.getRating()).compareTo(obj2.getRating());

    if (descending) {
      Collections.reverse(tours);
    } else {
      tours.sort(comparator);

    }
    return tours;
  }

  public final List<Tour> findByDate(final double date) {
    List<Tour> toursList = tours;
    List<Tour> sortedSecurityList =
                toursList.stream().filter(tours ->
        tours.getDate() == date)
                .collect(Collectors.toList());
    return sortedSecurityList;
  }

  public final List<Tour> findByTypeOfTours(final String typeOfTours) {
    List<Tour> toursList = tours;
    List<Tour> filteredToursList
                = toursList.stream().filter(tours ->
                tours.getTypeOfTour() == typeOfTours)
                .collect(Collectors.toList());
    return filteredToursList;
  }

  public final List<Tour> getTour() {
    return tours;
  }

  public final void setTour(final List<Tour> tours) {
    this.tours = tours;
  }

  public static void main(String[] args) throws IOException {
  /*
        List<Tour> tourList = new ArrayList<>();

        tourList.add(new Tour(440, 18.01, "Spain", "For family", Rating.OUTSOLD));
        tourList.add(new Tour(700, 12.01, "Egypt", "For maximum rest", Rating.EXPENSIVE));
        tourList.add(new Tour(610, 14.01, "Portugal", "For best rest", Rating.EXPENSIVE));
        tourList.add(new Tour(100, 19.01, "Russia", "For vodka", Rating.CHEAP));

        TourWriter writer = new TourWriter(tourList);
        writer.writeToFile(tourList);

        */


  }
}

