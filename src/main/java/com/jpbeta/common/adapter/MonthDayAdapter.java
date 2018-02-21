package com.jpbeta.common.adapter;

import java.io.IOException;
import java.time.MonthDay;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

public class MonthDayAdapter extends TypeAdapter<MonthDay> {

  public static final MonthDayAdapter instance = new MonthDayAdapter();

  @Override
  public void write(JsonWriter out, MonthDay monthDay) throws IOException {
    // value type should not be null
    if (monthDay == null) {
      out.nullValue();
      return;
    }
    out.value(monthDay.toString());
  }

  @Override
  public MonthDay read(JsonReader in) throws IOException {
    // value type should not be null
    if (in.peek() == JsonToken.NULL) {
      in.nextNull();
      return null;
    }
    String s = in.nextString();
    return MonthDay.parse(s);
  }
}