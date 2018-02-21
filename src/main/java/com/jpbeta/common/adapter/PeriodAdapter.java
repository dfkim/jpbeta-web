package com.jpbeta.common.adapter;

import java.io.IOException;
import java.time.Period;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

public class PeriodAdapter extends TypeAdapter<Period> {

  public static final PeriodAdapter instance = new PeriodAdapter();

  @Override
  public void write(JsonWriter out, Period period) throws IOException {
    // value type should not be null
    if (period == null) {
      out.nullValue();
      return;
    }
    out.value(period.toString());
  }

  @Override
  public Period read(JsonReader in) throws IOException {
    // value type should not be null
    if (in.peek() == JsonToken.NULL) {
      in.nextNull();
      return null;
    }
    String s = in.nextString();
    return Period.parse(s);
  }
}