package com.jpbeta.common.adapter;

import java.io.IOException;
import java.util.OptionalLong;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

public class OptionalLongAdapter extends TypeAdapter<OptionalLong> {

  public static final OptionalLongAdapter instance = new OptionalLongAdapter();

  @Override
  public void write(JsonWriter out, OptionalLong value) throws IOException {
    // value type should not be null
    if (value == null) {
      out.nullValue();
      return;
    }
    if (!value.isPresent()) {
      out.nullValue();
      return;
    }
    out.value(value.getAsLong());
  }

  @Override
  public OptionalLong read(JsonReader in) throws IOException {
    // value type should not be null
    if (in.peek() == JsonToken.NULL) {
      in.nextNull();
      return OptionalLong.empty();
    }
    long value = in.nextLong();
    return OptionalLong.of(value);
  }
}