package sample.sinsoku.client.command;

public class CommandFactory {

  public static Command parse(String text) {
    Command command = null;
    if (isEcho(text)) {
      String args = text.replaceFirst("echo", "").trim();
      command = new EchoCommand(args);
    } else {
      command = new CommandNotFound();
    }
    
    return command;
  }

  public static boolean isEcho(String text) {
    return text.trim().startsWith("echo");
  }

}
