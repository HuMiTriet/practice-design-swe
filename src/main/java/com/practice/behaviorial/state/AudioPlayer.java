package com.practice.behaviorial.state;

// Context class 
public class AudioPlayer {

  // store reference to the concrete State object to which it will delegate all
  // of its work to
  private State state;

  public AudioPlayer(State state) {
    this.state = state;
  }

  public String toString() {
    return state.getClass().toString();
  }

  // Setter to allow the state object to change the current state
  public void changeState(State state) {
    this.state = state;
  }

  // communicate with the state object via interfaces

  // deletegate the actual work to the State object
  public void clickLock() {
    state.clickLock(this);
  }

  public void clickPlay() {
    state.clickPlay(this);
  }
}
