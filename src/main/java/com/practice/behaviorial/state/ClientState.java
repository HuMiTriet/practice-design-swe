package com.practice.behaviorial.state;

import com.practice.behaviorial.state.concreteStates.ReadyState;

public class ClientState {
  public static void execute() {
    ReadyState intialState = new ReadyState();
    AudioPlayer audioPlayer = new AudioPlayer(intialState);

    audioPlayer.clickPlay(); // Ready state ⇒ PlayingState

    audioPlayer.clickPlay(); // PlayingState: play music

    audioPlayer.clickLock(); // PlayingState ⇒ lockedState

    audioPlayer.clickPlay(); // Locked State so does nothing

    audioPlayer.clickLock(); // lockedState ⇒ PlayingState

    audioPlayer.clickPlay(); // Playing state so play music

    System.out.println("--------------------------------------------------------------------------------");

    audioPlayer.changeState(intialState); // ReadyState

    audioPlayer.clickLock(); // Ready state ⇒ lockedState

    audioPlayer.clickPlay(); // Locked State so does nothing

    audioPlayer.clickLock(); // lockedState ⇒ ReadyState

    System.out.println(audioPlayer.toString()); // go back to state before locked

  }
}
