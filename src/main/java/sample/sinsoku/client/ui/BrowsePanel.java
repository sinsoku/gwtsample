package sample.sinsoku.client.ui;

import com.google.gwt.user.client.ui.HorizontalPanel;

public class BrowsePanel extends HorizontalPanel {

  public BrowsePanel() {
    addStyleName("top-browse");
    add(new CommitGraphPanel());
    add(new CommitBrowserPanel());
  }

}
