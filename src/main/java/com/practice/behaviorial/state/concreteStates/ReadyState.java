package com.practice.behaviorial.state.concreteStates;

import com.practice.behaviorial.state.AudioPlayer;
import com.practice.behaviorial.state.State;

// Initial state of the autdioPlayer (context)
public class ReadyState extends State {

  @Override
  public void clickLock(AudioPlayer autdioPlayer) {
    autdioPlayer.changeState(new ReadyToLocked());
  }

  @Override
  public void clickPlay(AudioPlayer autdioPlayer) {
    autdioPlayer.changeState(new PlayingState());
  }

}
