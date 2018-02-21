package com.jpbeta.common.adapter;

import java.io.IOException;
import java.time.Year;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

public class YearAdapter extends TypeAdapter<Year> {

  public static final YearAdapter instance = new YearAdapter();

  @Override
  public void write(JsonWriter out, Year year) throws IOException {
    // value type should not be null
    if (year == null) {
      out.nullValue();
      return;
    }
    out.value(year.toString());
  }

  @Override
  public Year read(JsonReader in) throws IOException {
    // value type should not be null
    if (in.peek() == JsonToken.NULL) {
      in.nextNull();
      return null;
    }
    String s = in.nextString();
    return Year.parse(s);
  }
}