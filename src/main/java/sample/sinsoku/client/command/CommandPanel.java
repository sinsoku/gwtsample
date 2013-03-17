package sample.sinsoku.client.command;

import sample.sinsoku.client.base.VerticalPanel;

import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.user.client.ui.TextBox;

public class CommandPanel extends VerticalPanel {

  private ConsolePanel consolePanel;

  public CommandPanel() {
    addStyleName("top-command");

    consolePanel = new ConsolePanel();
    add(consolePanel);

    final TextBox inputTextBox = new TextBox();
    inputTextBox.addKeyPressHandler(new KeyPressHandler() {
      @Override
      public void onKeyPress(KeyPressEvent event) {
        int keyCode = event.getNativeEvent().getKeyCode();
        if (keyCode == KeyCodes.KEY_ENTER) {
          consolePanel.appendText(inputTextBox.getText());
          consolePanel.scrollToBottom();
          inputTextBox.setText("");
        }
      }
    });
    add(inputTextBox);
  }

}
