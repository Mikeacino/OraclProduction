/**
 * Michael Carracino
 * Last Updated: 9-29-2018
 */

import java.util.Date;

public interface Item {
  final String MANUFACTURER = "OracleProduction";

  public void setProductionNumber(int x);
  public void setName(String y);
  public String getName();
  public Date getManufacturerDate();
  public int getSerialNumber();
}
