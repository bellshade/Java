package learn.advanced.RockPaperScissors;

public enum Move {
  ROCK("rock"),
  PAPER("paper"),
  SCISSORS("scissors");

  private final String value;

  Move(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
