/**
 * Michael Carracino
 * Last Updated: 9-29-2018
 * Implements the item Interface and does some
 */

import java.util.Date;

public abstract class Product implements Item{
  int serialNumber;
  String MANUFACTURER = Item.MANUFACTURER; //This line is because MANUFACTURER is otherwise null
  Date manufacturedOn;
  String name;


  static int currentProductionNumber;

  public Product (String name){
    this.name = name;
    serialNumber = currentProductionNumber++;   //++ is post fix, There is a bug here.
    manufacturedOn = new Date();

  }

  public void setProductionNumber(int x){
    serialNumber = currentProductionNumber;
  }

  public void setName(String y){
    name = y;
  }

  public String getName(){
    return name;
  }

  public Date getManufacturerDate(){
    return manufacturedOn;    //Bug here, but I was told to do this in this manner
  }

  public int getSerialNumber(){
    return serialNumber;
  }

  public String toString(){
    return "Manufacturer  : "+ MANUFACTURER +"\n"
         + "Serial Number : "+ serialNumber +"\n"
         + "Date          : "+ manufacturedOn +"\n"
         + "Name          : "+ name;
  }
}
