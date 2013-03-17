package sample.sinsoku.client;

import sample.sinsoku.client.ui.MainContent;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class gwtsample implements EntryPoint {
  public void onModuleLoad() {
    RootPanel rootPanel = RootPanel.get();
    rootPanel.add(new MainContent());
  }
}
