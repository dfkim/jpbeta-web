package com.jpbeta.web.service;

import org.springframework.stereotype.Service;

import com.jpbeta.web.form.SearchPostCdForm;

@Service
public class SearchPostCdService {
  private final String ZIP_LIST = "[  {    \"postCd\": \"9013400\",    \"kenNameKana\": \"ｵｷﾅﾜｹﾝ\",    \"cityNameKana\": \"ｼﾏｼﾞﾘｸﾞﾝｻﾞﾏﾐｿﾝ\",    \"cityAreaNameKana\": \"ｲｶﾆｹｲｻｲｶﾞﾅｲﾊﾞｱｲ\",    \"kenName\": \"沖縄県\",    \"cityName\": \"島尻郡座間味村\" ,\"cityAreaName\":\"以下に掲載がない場合\" }, " + " {    \"postCd\": \"9013311\",    \"kenNameKana\": \"ｵｷﾅﾜｹﾝ\",    \"cityNameKana\": \"ｼﾏｼﾞﾘｸﾞﾝｻﾞﾏﾐｿﾝ\",    \"cityAreaNameKana\": \"ｱｶ\",    \"kenName\": \"沖縄県\",    \"cityName\": \"島尻郡座間味村\" ,\"cityAreaName\":\"阿嘉\" },  " + "{    \"postCd\": \"9013401\",    \"kenNameKana\": \"ｵｷﾅﾜｹﾝ\",    \"cityNameKana\": \"ｼﾏｼﾞﾘｸﾞﾝｻﾞﾏﾐｿﾝ\",    \"cityAreaNameKana\": \"ｱｻ\",    \"kenName\": \"沖縄県\",    \"cityName\": \"島尻郡座間味村\" ,\"cityAreaName\":\"阿佐\" }, " + " {    \"postCd\": \"9013403\",    \"kenNameKana\": \"ｵｷﾅﾜｹﾝ\",    \"cityNameKana\": \"ｼﾏｼﾞﾘｸﾞﾝｻﾞﾏﾐｿﾝ\",    \"cityAreaNameKana\": \"ｱﾏ\",    \"kenName\": \"沖縄県\",    \"cityName\": \"島尻郡座間味村\"  ,\"cityAreaName\":\"阿真\"},  " + "{    \"postCd\": \"9013312\",    \"kenNameKana\": \"ｵｷﾅﾜｹﾝ\",    \"cityNameKana\": \"ｼﾏｼﾞﾘｸﾞﾝｻﾞﾏﾐｿﾝ\",    \"cityAreaNameKana\": \"ｹﾞﾙﾏ\",    \"kenName\": \"沖縄県\",    \"cityName\": \"島尻郡座間味村\" ,\"cityAreaName\":\"慶留間\" }, " + " {    \"postCd\": \"9013402\",    \"kenNameKana\": \"ｵｷﾅﾜｹﾝ\",    \"cityNameKana\": \"ｼﾏｼﾞﾘｸﾞﾝｻﾞﾏﾐｿﾝ\",    \"cityAreaNameKana\": \"ｻﾞﾏﾐ\",    \"kenName\": \"沖縄県\",    \"cityName\": \"島尻郡座間味村\" ,\"cityAreaName\":\"座間味\" }, " + " {    \"postCd\": \"9013700\",    \"kenNameKana\": \"ｵｷﾅﾜｹﾝ\",    \"cityNameKana\": \"ｼﾏｼﾞﾘｸﾞﾝｱｸﾞﾆｿﾝ\",    \"cityAreaNameKana\": \"ｲｶﾆｹｲｻｲｶﾞﾅｲﾊﾞｱｲ\",    \"kenName\": \"沖縄県\",    \"cityName\": \"島尻郡粟国村\" ,\"cityAreaName\":\"以下に掲載がない場合\" }, " + " {    \"postCd\": \"9013703\",    \"kenNameKana\": \"ｵｷﾅﾜｹﾝ\",    \"cityNameKana\": \"ｼﾏｼﾞﾘｸﾞﾝｱｸﾞﾆｿﾝ\",    \"cityAreaNameKana\": \"ﾆｼ\",    \"kenName\": \"沖縄県\",    \"cityName\": \"島尻郡粟国村\" ,\"cityAreaName\":\"西\" }, " + " {    \"postCd\": \"9013701\",    \"kenNameKana\": \"ｵｷﾅﾜｹﾝ\",    \"cityNameKana\": \"ｼﾏｼﾞﾘｸﾞﾝｱｸﾞﾆｿﾝ\",    \"cityAreaNameKana\": \"ﾊﾏ\",    \"kenName\": \"沖縄県\",    \"cityName\": \"島尻郡粟国村\",\"cityAreaName\":\"浜\"  },  {    \"postCd\": \"9013702\",    \"kenNameKana\": \"ｵｷﾅﾜｹﾝ\",    \"cityNameKana\": \"ｼﾏｼﾞﾘｸﾞﾝｱｸﾞﾆｿﾝ\",    \"cityAreaNameKana\": \"ﾋｶﾞｼ\",    \"kenName\": \"沖縄県\",    \"cityName\": \"島尻郡粟国村\"  ,\"cityAreaName\":\"東\"}]";

  /**
   * 郵便番号検索
   *
   * @param zipForm
   * @return
   */
  public String doSearchAjax(SearchPostCdForm zipForm) {
    // 画面から取得した郵便番号
    if (zipForm.getPostCd() != null && !"".equals(zipForm.getPostCd())) {
      // ＤＢ検索する必要
    }
    return ZIP_LIST;
  }
}
