package com.practice.structural.facade;

import com.practice.structural.facade.subsystems.Codec;
import com.practice.structural.facade.subsystems.MPEGCodec;
import com.practice.structural.facade.subsystems.OggCodec;
import com.practice.structural.facade.subsystems.VideoFile;

// This is the facade class
public class VideoConverter {
  public static String extract(String filename, String format) {
    System.out.println("Video file conversion has started");

    VideoFile videoFile = new VideoFile(filename);

    videoFile.setCodecType("");

    Codec destinationCodec;

    if (format.equals("mp4"))
      destinationCodec = new MPEGCodec();
    else
      destinationCodec = new OggCodec();

    videoFile.setCodecType(destinationCodec.getType());

    return videoFile.getName() + videoFile.getCodecType();
  }
}
