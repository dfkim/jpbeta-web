package com.jpbeta.web.form;

import java.io.Serializable;

public abstract class BaseForm implements Serializable {
  private String funcId;
  private Long version;
  private int resultCd;
  private Integer start;
  private Integer limit;
  private String sort;
  private String dir;
  public String getFuncId() {
    return funcId;
  }
  public void setFuncId(String funcId) {
    this.funcId = funcId;
  }
  public Long getVersion() {
    return version;
  }
  public void setVersion(Long version) {
    this.version = version;
  }
  public int getResultCd() {
    return resultCd;
  }
  public void setResultCd(int resultCd) {
    this.resultCd = resultCd;
  }
  public Integer getStart() {
    return start;
  }
  public void setStart(Integer start) {
    this.start = start;
  }
  public Integer getLimit() {
    return limit;
  }
  public void setLimit(Integer limit) {
    this.limit = limit;
  }
  public String getSort() {
    return sort;
  }
  public void setSort(String sort) {
    this.sort = sort;
  }
  public String getDir() {
    return dir;
  }
  public void setDir(String dir) {
    this.dir = dir;
  }
}
