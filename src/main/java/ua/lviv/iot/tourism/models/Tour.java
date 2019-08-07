package ua.lviv.iot.tourism.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Tour  {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private double price;
  private double date;
  private String name;
  
  public Tour(Integer id, double price, double date, String name,
             String typeOfTour, Rating rating) {
    super();
    this.id = id;
    this.price = price;
    this.date = date;
    this.name = name;
    this.typeOfTour = typeOfTour;
    this.rating = rating;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  private String typeOfTour;
  private Rating rating;

  public Tour() {

  }
    
  public Tour(final double price,
            final double date,
            final String name,
            final String typeOfTour,
            final Rating rating) {
    super();
    this.price = price;
    this.date = date;
    this.name = name;
    this.typeOfTour = typeOfTour;
    this.rating = rating;

  }
    
  public String getHeaders() { 
    return  "price" + "," + "date" + "," + "name" + "," + "typeOfTour" + "," + "rating";
  }

  public String toCSV() { 
    return  price + "," + date + "," + name + "," + typeOfTour + "," + rating;
  }

  @Override
    public final String toString() {
    return "Tours [price=" + price + " " + date + ", name="
      + name + ", typeOfTour=" + typeOfTour + ", rating="
                + rating + "]";
  }

  public final double getPrice() {
    return price;
  }

  public final void setPrice(final double price) {
    this.price = price;
  }

  public final double getDate() {
    return date;
  }

  public final void setDate(final double date) {
    this.date = date;
  }

  public final String getName() {
    return name;
  }

  public final void setNmae(final String name) {
    this.name = name;
  }

  public final String getTypeOfTour() {
    return typeOfTour;
  }

  public final void setTypeOfTour(final String typeOfTour) {
    this.typeOfTour = typeOfTour;
  }

  public final Rating getRating() {
    return rating;
  }

  public final void setRating(final Rating rating) {
    this.rating = rating;
  }

}