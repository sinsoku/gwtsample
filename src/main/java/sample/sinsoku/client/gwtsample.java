package sample.sinsoku.client;

import sample.sinsoku.client.ui.BrowsePanel;
import sample.sinsoku.client.ui.CommandPanel;
import sample.sinsoku.client.ui.HeaderPanel;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class gwtsample implements EntryPoint {
  public void onModuleLoad() {
    RootPanel rootPanel = RootPanel.get();

    VerticalPanel mainContentPanel = new VerticalPanel();
    mainContentPanel.add(new HeaderPanel());
    mainContentPanel.add(new BrowsePanel());
    mainContentPanel.add(new CommandPanel());

    rootPanel.add(mainContentPanel);
  }
}
