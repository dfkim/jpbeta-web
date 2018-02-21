package com.jpbeta.common.adapter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAccessor;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class LocalDateTimeAdapter extends XmlAdapter<String, LocalDateTime> {
  public static LocalDateTime parse(String value) {
    DateTimeFormatter dateTimeAndZoneformatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
    DateTimeFormatter dateTimeformatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
    TemporalAccessor ta = null;
    try {
      ta = dateTimeformatter.parse(value);
    } catch (DateTimeParseException ex) {
      ta = dateTimeAndZoneformatter.parse(value);
    }
    return LocalDateTime.from(ta);
  }

  public static String print(LocalDateTime value) {
    return value.toString();
  }

  public LocalDateTime unmarshal(String value) {
    return parse(value);
  }

  public String marshal(LocalDateTime value) {
    return print(value);
  }
}