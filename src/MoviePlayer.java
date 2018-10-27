import java.util.Date;
import javax.management.monitor.Monitor;

public class MoviePlayer extends Product implements MultimediaControl, Comparable {

  private Screen screen = new Screen(null, 0, 0);
  private MonitorType monitorType = MonitorType.LCD;

  public MoviePlayer(String name, Screen screen, MonitorType monitorType) {
    super(name);
    this.screen = screen;
    this.monitorType = monitorType;
  }

  @Override
  public Date getManufactureDate() {
    return null;
  }

  @Override
  public void play() {
    System.out.println("Playing");
  }

  @Override
  public void stop() {
    System.out.println("Stopping");
  }

  @Override
  public void previous() {
    System.out.println("Previous");
  }

  @Override
  public void next() {
    System.out.println("Next");
  }

  public String toString() {
    return super.toString()
        + "\nScreen: " + screen.toString()
        + "\nMonitor Type: " + monitorType;
  }

  public static void main(String args[]) {
    Screen screeny = new Screen("Xc-1", 2, 3);
    MonitorType mony = MonitorType.LED;
    MoviePlayer test3 = new MoviePlayer("Jimmy", screeny, mony);
    test3.toString();
  }

  @Override
  public int compareTo(Object o) {
    return 0;
  }
}
