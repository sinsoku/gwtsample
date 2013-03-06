package sample.sinsoku.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class gwtsample implements EntryPoint {
  public void onModuleLoad() {
    RootPanel panel = RootPanel.get();
    panel.add(new Label("gwt sample"));
  }
}
