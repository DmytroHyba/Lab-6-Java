package ua.lviv.iot.tourism.models;

public class ExtremeTour extends Tour {

  private String place;

  public ExtremeTour(final double price,
            final double date,
            final String name,
            final String typeOfTour,
            final Rating rating,
            final String place) {
    super(price, date, name, typeOfTour, rating);
    this.place = place;

  }

  public String getHeaders() { 
    return  super.getHeaders() + "," + "place";
  }

  public String toCSV() { 
    return super.toCSV() + place;
  }
    
    


  public final String getPlace() {
    return place;
  }

  public final void setPlace(final String place) {
    this.place = place;
  }

}