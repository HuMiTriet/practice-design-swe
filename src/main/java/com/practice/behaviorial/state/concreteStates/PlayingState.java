package com.practice.behaviorial.state.concreteStates;

import com.practice.behaviorial.state.AudioPlayer;
import com.practice.behaviorial.state.State;

public class PlayingState extends State {

  @Override
  public void clickLock(AudioPlayer autdioPlayer) {
    autdioPlayer.changeState(new PlayingToLockedState());
  }

  @Override
  public void clickPlay(AudioPlayer audioPlayer) {
    System.out.println("PLAYING MUSIC");
  }

}
