package sample.sinsoku.client.ui;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.user.client.ui.FlowPanel;

public class CommitBrowserPanel extends FlowPanel {

  public CommitBrowserPanel() {
    addStyleName("commit-browser");
    
    Canvas canvas = Canvas.createIfSupported();
    add(canvas);
  }

}
