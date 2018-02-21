package com.jpbeta.common.adapter;

import java.io.IOException;
import java.util.OptionalDouble;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

public class OptionalDoubleAdapter extends TypeAdapter<OptionalDouble> {

  public static final OptionalDoubleAdapter instance = new OptionalDoubleAdapter();

  @Override
  public void write(JsonWriter out, OptionalDouble value) throws IOException {
    // value type should not be null
    if (value == null) {
      out.nullValue();
      return;
    }
    if (!value.isPresent()) {
      out.nullValue();
      return;
    }
    out.value(value.getAsDouble());
  }

  @Override
  public OptionalDouble read(JsonReader in) throws IOException {
    // value type should not be null
    if (in.peek() == JsonToken.NULL) {
      in.nextNull();
      return OptionalDouble.empty();
    }
    double value = in.nextDouble();
    return OptionalDouble.of(value);
  }
}