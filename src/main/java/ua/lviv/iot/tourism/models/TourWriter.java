package ua.lviv.iot.tourism.models;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

public class TourWriter {
  private List<Tour> tours;

  public TourWriter(final List<Tour> tours) {
    this.tours = tours;

  }
  
  public void writeToFile(List<Tour> tourList) throws IOException {
      
    File myFile = new File("tourList.txt");
    try (FileOutputStream fos = new FileOutputStream(myFile);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bufferedWriter = new BufferedWriter(osw);) {
                
      bufferedWriter.write(tourList.get(0).getHeaders());
      bufferedWriter.newLine();

                
      for (int i = 0;i < tourList.size();i++) {

        bufferedWriter.write(tourList.get(i).toCSV());
        bufferedWriter.newLine();
      }




    }
  }
}
