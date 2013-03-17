package sample.sinsoku.client.command;

public class EchoCommand implements Command {
  private String args;

  public EchoCommand(String args) {
    this.args = args;
  }

  @Override
  public String execute() {
    return args;
  }

}
