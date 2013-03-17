package sample.sinsoku.client.command;

public class CommandFactory {

  public static Command parse(String text) {
    String args = text.replaceFirst("echo", "").trim();
    Command command = new EchoCommand(args);
    return command;
  }

}
