/*
 * Michael Carracino
 * Last Updated: 9-29-2018
 */

import java.util.Date;

public interface Item {

  String MANUFACTURER = "OracleProduction";

  void setProductionNumber(int x);

  void setName(String y);

  String getName();

  Date getManufactureDate();

  int getSerialNumber();
}
