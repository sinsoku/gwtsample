package sample.sinsoku.client.command;

import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ScrollPanel;

public class ConsolePanel extends ScrollPanel {

  private FlowPanel consolePanel;

  public ConsolePanel() {
    addStyleName("console-panel");
    
    consolePanel = new FlowPanel();
    add(consolePanel);
  }

  public void appendText(String text) {
    consolePanel.add(new Label(text));
  }
}
