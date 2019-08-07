package ua.lviv.iot;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.tourism.models.Rating;
import ua.lviv.iot.tourism.models.Tour;
import ua.lviv.iot.tourism.models.TourWriter;

class TourWriterTest {
  List<Tour> tourList = new ArrayList<>();
  TourWriter tw = new TourWriter(tourList);



  @BeforeEach
    void setUp() throws Exception {
    tourList.add(new Tour(440, 18.01, "Spain", "For family", Rating.OUTSOLD));
    tourList.add(new Tour(700, 12.01, "Egypt", "For maximum rest", Rating.EXPENSIVE));
    tourList.add(new Tour(610, 14.01, "Portugal", "For best rest", Rating.EXPENSIVE));
    tourList.add(new Tour(100, 19.01, "Russia", "For vodka", Rating.CHEAP));
  }

  @Test
    void testWriteToFile() throws IOException {


    File file = new File("tourList.txt");
    tw.writeToFile(tourList);
    assertTrue(file.length() > 0);

  }


}
