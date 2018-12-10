public class Screen implements ScreenSpec, Comparable {

  private String resolution;
  private int refreshRate;
  private int responseTime;

  public Screen(String resolution, int refreshRate, int responseTime) {
    this.resolution = resolution;
    this.refreshRate = refreshRate;
    this.responseTime = responseTime;
  }

  @Override
  public String getResolution() {
    return null;
  }

  @Override
  public int getRefreshRate() {
    return 0;
  }

  @Override
  public int getResponseTime() {
    return 0;
  }

  public String toString() {
    return "Resolution : " + resolution
        + "\nRefresh Rate : " + refreshRate
        + "\nResponse Time : " + responseTime;
  }

  public static void main(String args[]) {
    //Screen test5 = new Screen("High", 50, 2);
  }

  @Override
  public int compareTo(Object o) {
    return 0;
  }
}