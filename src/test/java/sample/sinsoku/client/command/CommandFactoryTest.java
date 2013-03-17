package sample.sinsoku.client.command;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class CommandFactoryTest {

  @Test
  public void test_is_echo() {
    assertThat(CommandFactory.isEcho("echo hoge"), is(true));
    assertThat(CommandFactory.isEcho(" echo foo"), is(true));
    assertThat(CommandFactory.isEcho("aaa"), is(false));
  }

}
