package com.practice.behaviorial.state.concreteStates;

import com.practice.behaviorial.state.AudioPlayer;
import com.practice.behaviorial.state.State;

public class PlayingToLockedState extends State {

  @Override
  public void clickLock(AudioPlayer audioplayer) {
    audioplayer.changeState(new PlayingState());
  }

  // device is locked so does nothing
  @Override
  public void clickPlay(AudioPlayer audioPlayer) {
  }

}
