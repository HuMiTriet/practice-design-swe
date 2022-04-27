package com.practice.behaviorial.state;

public abstract class State {

  // the State object somehow has to have a way to back reference the context
  // So that it can change the current state of the context and possibly get
  // certain information from the context this is done by passsing the context
  // object to
  // each of the method

  // Declare the state-specific methods
  public abstract void clickLock(AudioPlayer autdioPlayer);

  // the in class example passed the context object instide of each of the State
  // method but in this implementation we have a private field autdioPlayer
  // from the abstract class so that they will all have a context object. Yet
  // they are not the same object because the autdioPlayer variable is not static
  public abstract void clickPlay(AudioPlayer autdioPlayer);

}
