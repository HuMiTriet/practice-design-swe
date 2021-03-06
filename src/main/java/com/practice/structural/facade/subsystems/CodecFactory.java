package com.practice.structural.facade.subsystems;

public class CodecFactory {
  public static Codec extract(VideoFile file) {
    String type = file.getCodecType();
    if (type.equals("mp4")) {
      System.out.println("CodecFactory: extracting mpeg audio...");
      return new MPEGCodec();
    } else {
      System.out.println("CodecFactory: extracting ogg audio...");
      return new OggCodec();
    }
  }
}
