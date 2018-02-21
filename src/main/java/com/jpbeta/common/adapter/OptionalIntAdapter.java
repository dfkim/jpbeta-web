package com.jpbeta.common.adapter;

import java.io.IOException;
import java.util.OptionalInt;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

public class OptionalIntAdapter extends TypeAdapter<OptionalInt> {

  public static final OptionalIntAdapter instance = new OptionalIntAdapter();

  @Override
  public void write(JsonWriter out, OptionalInt value) throws IOException {
    // value type should not be null
    if (value == null) {
      out.nullValue();
      return;
    }
    if (!value.isPresent()) {
      out.nullValue();
      return;
    }
    out.value(value.getAsInt());
  }

  @Override
  public OptionalInt read(JsonReader in) throws IOException {
    // value type should not be null
    if (in.peek() == JsonToken.NULL) {
      in.nextNull();
      return OptionalInt.empty();
    }
    int value = in.nextInt();
    return OptionalInt.of(value);
  }
}