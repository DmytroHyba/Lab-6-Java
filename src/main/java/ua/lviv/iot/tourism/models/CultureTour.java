package ua.lviv.iot.tourism.models;

public class CultureTour extends Tour {

  private String popularPlaces;

  public CultureTour() {
    super();
  }
    
  public CultureTour(final double price, final double date, final String name,
            final String typeOfTour, final Rating rating, final String popularPlaces) {
    super(price, date, name, typeOfTour, rating);
    this.popularPlaces = popularPlaces;

  }

  public String getHeaders() { 
    return  super.getHeaders() + "," + "popularPlaces";
  }

  public String toCSV() { 
    return super.toCSV() + popularPlaces;
  }
    
  public final String getPopularPlaces() {
    return popularPlaces;
  }

  public final void setPopularPlaces(final String popularPlaces) {
    this.popularPlaces = popularPlaces;
  }
}