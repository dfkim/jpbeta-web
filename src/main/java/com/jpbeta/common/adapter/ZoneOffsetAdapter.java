package com.jpbeta.common.adapter;

import java.io.IOException;
import java.time.ZoneOffset;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

public class ZoneOffsetAdapter extends TypeAdapter<ZoneOffset> {

  public static final ZoneOffsetAdapter instance = new ZoneOffsetAdapter();

  @Override
  public void write(JsonWriter out, ZoneOffset zoneOffset) throws IOException {
    // value type should not be null
    if (zoneOffset == null) {
      out.nullValue();
      return;
    }
    out.value(zoneOffset.getId());
  }

  @Override
  public ZoneOffset read(JsonReader in) throws IOException {
    // value type should not be null
    if (in.peek() == JsonToken.NULL) {
      in.nextNull();
      return null;
    }
    String s = in.nextString();
    return ZoneOffset.of(s);
  }
}