package com.jpbeta.common.adapter;

import java.io.IOException;
import java.time.YearMonth;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

public class YearMonthAdapter extends TypeAdapter<YearMonth> {

  public static final YearMonthAdapter instance = new YearMonthAdapter();

  @Override
  public void write(JsonWriter out, YearMonth yearMonth) throws IOException {
    // value type should not be null
    if (yearMonth == null) {
      out.nullValue();
      return;
    }
    out.value(yearMonth.toString());
  }

  @Override
  public YearMonth read(JsonReader in) throws IOException {
    // value type should not be null
    if (in.peek() == JsonToken.NULL) {
      in.nextNull();
      return null;
    }
    String s = in.nextString();
    return YearMonth.parse(s);
  }
}