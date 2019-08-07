package ua.lviv.iot.tourism.models;

public class FamilyTour extends Tour {

  private StopAtTheHotel hotel;

  public FamilyTour(final double price,
            final double date, final String name,
            final String typeOfTour,
            final Rating rating,
            final StopAtTheHotel hotel) {
    super(price, date, name, typeOfTour, rating);
    this.hotel = hotel;
  }
    
  public String getHeaders() { 
    return  super.getHeaders() + "," + "hotel";
  }

  public String toCSV() { 
    return super.toCSV() + hotel;
  }

  public final StopAtTheHotel getHotel() {
    return hotel;
  }

  public final void setHotel(final StopAtTheHotel hotel) {
    this.hotel = hotel;
  }

}