package sample.sinsoku.client;

import sample.sinsoku.client.ui.CommandPanel;
import sample.sinsoku.client.ui.CommitBrowserPanel;
import sample.sinsoku.client.ui.CommitGraphPanel;
import sample.sinsoku.client.ui.HeaderPanel;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class gwtsample implements EntryPoint {
  public void onModuleLoad() {
    RootPanel rootPanel = RootPanel.get();

    HeaderPanel headerPanel = new HeaderPanel();
    HorizontalPanel browsePanel = new HorizontalPanel();
    browsePanel.add(new CommitGraphPanel());
    browsePanel.add(new CommitBrowserPanel());
    CommandPanel commandPanel = new CommandPanel();
    
    rootPanel.add(headerPanel);
    rootPanel.add(browsePanel);
    rootPanel.add(commandPanel);
  }
}
