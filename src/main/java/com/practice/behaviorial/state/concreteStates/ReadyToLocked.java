package com.practice.behaviorial.state.concreteStates;

import com.practice.behaviorial.state.AudioPlayer;
import com.practice.behaviorial.state.State;

// Locked state that is transitioned from the ready state
public class ReadyToLocked extends State {

  // if pressed lock button again it will toggle it and return it to the original
  // State
  @Override
  public void clickLock(AudioPlayer autdioPlayer) {
    autdioPlayer.changeState(new ReadyState());
  }

  // device is locked so it does nothing
  @Override
  public void clickPlay(AudioPlayer autdioPlayer) {
  }

}
