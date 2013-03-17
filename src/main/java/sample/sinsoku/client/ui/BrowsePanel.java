package sample.sinsoku.client.ui;

import sample.sinsoku.client.base.HorizontalPanel;

public class BrowsePanel extends HorizontalPanel {

  public BrowsePanel() {
    addStyleName("top-browse");
    add(new CommitGraphPanel());
    add(new CommitBrowserPanel());
  }

}
