package com.jpbeta.common.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jpbeta.common.factory.GsonJava8TypeAdapterFactory;

/**
 * Gson 関係共通関数
 */
public class GsonUtil {

  /**
   * Localdatetime変換できるGsonインスタンスを生成
   *
   * @return
   */

  public static Gson createGson() {
    Gson gson = new GsonBuilder().serializeNulls()
        .registerTypeAdapterFactory(new GsonJava8TypeAdapterFactory()).create();
    return gson;
  }
}
