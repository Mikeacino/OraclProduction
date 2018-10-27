import java.util.Date;

public class AudioPlayer extends Product implements MultimediaControl {

  private String audioSpecification;
  private ItemType mediaType;

  public AudioPlayer(String name, String audioSpecification) {
    super(name);
    mediaType = ItemType.AUDIO;
    this.audioSpecification = audioSpecification;
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
    return super.toString() + "\nAudio Spec: " + audioSpecification + "\nType: " + mediaType;
  }

  public void main(String args[]) {
    AudioPlayer test4 = new AudioPlayer("Jane", "Speaker");
    System.out.print(test4.toString());
  }

  @Override
  public int compareTo(Object o) {
    return 0;
  }
}
