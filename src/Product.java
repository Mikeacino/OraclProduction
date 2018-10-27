/*
 * Michael Carracino
 * Last Updated: 9-29-2018
 * Implements the item Interface and does some stuff
 */

import java.util.Date;

public abstract class Product implements Item, Comparable {

  private int serialNumber;
  private String MANUFACTURER = Item.MANUFACTURER;
  private Date manufacturedOn;
  private String name;
  private int currentProductionNumber = 1;

  public Product(String name) {
    this.name = name;
    serialNumber = currentProductionNumber;
    currentProductionNumber++;
    manufacturedOn = new Date();
  }

  public void setProductionNumber(int x) {
    this.currentProductionNumber = x;
  }

  public void setName(String y) {
    name = y;
  }

  public String getName() {
    return this.name;
  }

  public Date getManufacturerDate() {
    return this.manufacturedOn;
  }

  public int getSerialNumber() {
    return this.serialNumber;
  }

  public String toString() {
    return "\nManufacturer : " + MANUFACTURER + "\n"
        + "Serial Number : " + serialNumber + "\n"
        + "Date : " + manufacturedOn + "\n"
        + "Name : " + name;
  }
}