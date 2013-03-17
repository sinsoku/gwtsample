package sample.sinsoku.client.ui;

import sample.sinsoku.client.base.VerticalPanel;

public class MainContent extends VerticalPanel {
  public MainContent() {
    addStyleName("top-main-content");
    add(new HeaderPanel());
    add(new BrowsePanel());
    add(new CommandPanel());
  }
}
