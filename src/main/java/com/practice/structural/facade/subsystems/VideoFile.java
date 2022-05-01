package com.practice.structural.facade.subsystems;

public class VideoFile {
  private String name;
  private String codecType;

  public VideoFile(String name) {
    this.name = name;
    this.codecType = name.substring(name.indexOf(".") + 1);
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCodecType(String codecType) {
    this.codecType = codecType;
  }

  public String getCodecType() {
    return codecType;
  }

  public String getName() {
    return name;
  }
}
