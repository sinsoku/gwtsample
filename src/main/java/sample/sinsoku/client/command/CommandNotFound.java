package sample.sinsoku.client.command;

public class CommandNotFound implements Command {

  @Override
  public String execute() {
    return "command not found";
  }

}
