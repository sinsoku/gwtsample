package sample.sinsoku.client.ui;

import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;

public class CommandPanel extends FlowPanel {

  public CommandPanel() {
    addStyleName("top-command");

    add(new Label("command"));
  }

}
