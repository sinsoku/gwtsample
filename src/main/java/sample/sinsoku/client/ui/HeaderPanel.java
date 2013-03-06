package sample.sinsoku.client.ui;


import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;

public class HeaderPanel extends FlowPanel {

  public HeaderPanel() {
    Button menuButton = new Button("メニュー");
    FlowPanel taskBarPanel = new FlowPanel();
    
    add(menuButton);
    add(taskBarPanel);
  }

}
