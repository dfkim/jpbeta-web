package com.jpbeta.common.adapter;

import java.io.IOException;
import java.time.Duration;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

public class DurationAdapter extends TypeAdapter<Duration> {

  public static final DurationAdapter instance = new DurationAdapter();

  @Override
  public void write(JsonWriter out, Duration duration) throws IOException {
    // value type should not be null
    if (duration == null) {
      out.nullValue();
      return;
    }
    out.value(duration.toString());
  }

  @Override
  public Duration read(JsonReader in) throws IOException {
    // value type should not be null
    if (in.peek() == JsonToken.NULL) {
      in.nextNull();
      return null;
    }
    String s = in.nextString();
    return Duration.parse(s);
  }
}