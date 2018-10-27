/**
 * Michael Carracino Last Updated: 10-27-2018 Pretty standard enum here.
 */

public enum ItemType {
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIOMOBILE("AM"),
  VISUALMOBILE("VM");
  //This next block was reccomended to me online, I am not sure exactly why I need it
  private final String representation;

  ItemType(String representation) {
    this.representation = representation;
  }
}
