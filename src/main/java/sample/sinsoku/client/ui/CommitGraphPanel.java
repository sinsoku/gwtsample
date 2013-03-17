package sample.sinsoku.client.ui;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.canvas.dom.client.CssColor;
import com.google.gwt.user.client.ui.FlowPanel;

public class CommitGraphPanel extends FlowPanel {

  public CommitGraphPanel() {
    addStyleName("top-commit-graph");
    
    Canvas canvas = Canvas.createIfSupported();
//    canvas.setWidth(400 + "px");
//    canvas.setHeight(500 + "px");
//    canvas.setCoordinateSpaceWidth(400);
//    canvas.setCoordinateSpaceHeight(500);
    
    Context2d context2d = canvas.getContext2d();
    context2d.beginPath();
    context2d.arc(10, 10, 5, 0, Math.PI*2);
    context2d.setFillStyle(CssColor.make("green"));
//    context2d.fillRect(100, 50, 100, 100);
    context2d.fillText("hoge", 20, 20);
    context2d.closePath();
    context2d.fill();
    
    add(canvas);
  }

}
