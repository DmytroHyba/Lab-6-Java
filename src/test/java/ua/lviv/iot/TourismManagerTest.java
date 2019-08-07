package ua.lviv.iot;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.tourism.manager.TourismManager;
import ua.lviv.iot.tourism.models.CultureTour;
import ua.lviv.iot.tourism.models.Rating;
import ua.lviv.iot.tourism.models.StopAtTheHotel;
import ua.lviv.iot.tourism.models.Tour;


public class TourismManagerTest {

  private List<Tour> newTours;
  private TourismManager tourismManager;

  @BeforeEach
    public void beforeEach() {
    //      TourismManager b = new TourismManager();
    //      Tour buffer = new Tour();
    //      CultureTour buff = new CultureTour();
    //      StopAtTheHotel buf = StopAtTheHotel.FIVE_STARS;
        
    newTours = new ArrayList<>();
    newTours.add(new Tour(700, 12.01, "Egypt", "For maximum rest", Rating.EXPENSIVE));
    newTours.add(new Tour(610, 12.01, "Portugal", "For best rest", Rating.EXPENSIVE));
    newTours.add(new Tour(440, 18.01, "Spain", "For family", Rating.OUTSOLD));
    newTours.add(new Tour(500, 19.01, "Russia", "For vodka", Rating.CHEAP));
    newTours.add(new Tour(100, 17.03, "USA", "Business", Rating.CHEAP));
    newTours.add(new Tour(100, 25.03, "SPAIN", "Business", Rating.CHEAP));
    tourismManager = new TourismManager(newTours);
  }

  @Test
    public void testFindByDate() {
    Assertions.assertEquals(2, tourismManager.findByDate(12.01).size());
    Assertions.assertEquals(1, tourismManager.findByDate(18.01).size());
    Assertions.assertEquals(1, tourismManager.findByDate(19.01).size());
    Assertions.assertEquals(0, tourismManager.findByDate(01.01).size());
  }
    
  @Test
    public void testSortByPrice() {
    Assertions.assertEquals(700, tourismManager.sortByPrice(true).get(0).getPrice());
    Assertions.assertEquals(100, tourismManager.sortByPrice(false).get(0).getPrice());
  }
    
  @Test
    public void testSortByRating() {
    Assertions.assertEquals(Rating.CHEAP, tourismManager.sortByRating(true).get(0).getRating());
    Assertions.assertEquals(Rating.EXPENSIVE, tourismManager.sortByRating(false)
              .get(0).getRating());
    Assertions.assertEquals(6, tourismManager.sortByRating(false).size());
  }

  @Test
    public void testFindByTypeOfTours() {
    Assertions.assertEquals(1, tourismManager.findByTypeOfTours("For vodka").size());
    Assertions.assertEquals(1, tourismManager.findByTypeOfTours("For family").size());
  }
}
