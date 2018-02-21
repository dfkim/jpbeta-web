package com.jpbeta.dbcommon.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;
import org.seasar.doma.Version;

/**
 */
@Entity(listener = TblAdMstAgeDivListener.class)
@Table(name = "TBL_AD_MST_AGE_DIV")
public class TblAdMstAgeDiv {

  /** */
  @Id
  @Column(name = "AGE_DIV")
  String ageDiv;

  /** */
  @Column(name = "AGE_DIV_NAME")
  String ageDivName;

  /** */
  @Column(name = "AGE_FROM")
  Integer ageFrom;

  /** */
  @Column(name = "AGE_TO")
  Integer ageTo;

  /** */
  @Column(name = "DISPLAY_NO")
  Integer displayNo;

  /** */
  @Column(name = "DEL_DIV")
  String delDiv;

  /** */
  @Column(name = "CREATE_DTIME")
  LocalDateTime createDtime;

  /** */
  @Column(name = "CREATE_FUNC_ID")
  String createFuncId;

  /** */
  @Column(name = "CREATE_USER_ID")
  String createUserId;

  /** */
  @Column(name = "CREATE_LOGIN_USER_ID")
  String createLoginUserId;

  /** */
  @Column(name = "UPDATE_DTIME")
  LocalDateTime updateDtime;

  /** */
  @Column(name = "UPDATE_FUNC_ID")
  String updateFuncId;

  /** */
  @Column(name = "UPDATE_USER_ID")
  String updateUserId;

  /** */
  @Column(name = "UPDATE_LOGIN_USER_ID")
  String updateLoginUserId;

  /** */
  @Version
  @Column(name = "VERSION")
  Long version;

  /**
   * Returns the ageDiv.
   * 
   * @return the ageDiv
   */
  public String getAgeDiv() {
    return ageDiv;
  }

  /**
   * Sets the ageDiv.
   * 
   * @param ageDiv
   *          the ageDiv
   */
  public void setAgeDiv(String ageDiv) {
    this.ageDiv = ageDiv;
  }

  /**
   * Returns the ageDivName.
   * 
   * @return the ageDivName
   */
  public String getAgeDivName() {
    return ageDivName;
  }

  /**
   * Sets the ageDivName.
   * 
   * @param ageDivName
   *          the ageDivName
   */
  public void setAgeDivName(String ageDivName) {
    this.ageDivName = ageDivName;
  }

  /**
   * Returns the ageFrom.
   * 
   * @return the ageFrom
   */
  public Integer getAgeFrom() {
    return ageFrom;
  }

  /**
   * Sets the ageFrom.
   * 
   * @param ageFrom
   *          the ageFrom
   */
  public void setAgeFrom(Integer ageFrom) {
    this.ageFrom = ageFrom;
  }

  /**
   * Returns the ageTo.
   * 
   * @return the ageTo
   */
  public Integer getAgeTo() {
    return ageTo;
  }

  /**
   * Sets the ageTo.
   * 
   * @param ageTo
   *          the ageTo
   */
  public void setAgeTo(Integer ageTo) {
    this.ageTo = ageTo;
  }

  /**
   * Returns the displayNo.
   * 
   * @return the displayNo
   */
  public Integer getDisplayNo() {
    return displayNo;
  }

  /**
   * Sets the displayNo.
   * 
   * @param displayNo
   *          the displayNo
   */
  public void setDisplayNo(Integer displayNo) {
    this.displayNo = displayNo;
  }

  /**
   * Returns the delDiv.
   * 
   * @return the delDiv
   */
  public String getDelDiv() {
    return delDiv;
  }

  /**
   * Sets the delDiv.
   * 
   * @param delDiv
   *          the delDiv
   */
  public void setDelDiv(String delDiv) {
    this.delDiv = delDiv;
  }

  /**
   * Returns the createDtime.
   * 
   * @return the createDtime
   */
  public LocalDateTime getCreateDtime() {
    return createDtime;
  }

  /**
   * Sets the createDtime.
   * 
   * @param createDtime
   *          the createDtime
   */
  public void setCreateDtime(LocalDateTime createDtime) {
    this.createDtime = createDtime;
  }

  /**
   * Returns the createFuncId.
   * 
   * @return the createFuncId
   */
  public String getCreateFuncId() {
    return createFuncId;
  }

  /**
   * Sets the createFuncId.
   * 
   * @param createFuncId
   *          the createFuncId
   */
  public void setCreateFuncId(String createFuncId) {
    this.createFuncId = createFuncId;
  }

  /**
   * Returns the createUserId.
   * 
   * @return the createUserId
   */
  public String getCreateUserId() {
    return createUserId;
  }

  /**
   * Sets the createUserId.
   * 
   * @param createUserId
   *          the createUserId
   */
  public void setCreateUserId(String createUserId) {
    this.createUserId = createUserId;
  }

  /**
   * Returns the createLoginUserId.
   * 
   * @return the createLoginUserId
   */
  public String getCreateLoginUserId() {
    return createLoginUserId;
  }

  /**
   * Sets the createLoginUserId.
   * 
   * @param createLoginUserId
   *          the createLoginUserId
   */
  public void setCreateLoginUserId(String createLoginUserId) {
    this.createLoginUserId = createLoginUserId;
  }

  /**
   * Returns the updateDtime.
   * 
   * @return the updateDtime
   */
  public LocalDateTime getUpdateDtime() {
    return updateDtime;
  }

  /**
   * Sets the updateDtime.
   * 
   * @param updateDtime
   *          the updateDtime
   */
  public void setUpdateDtime(LocalDateTime updateDtime) {
    this.updateDtime = updateDtime;
  }

  /**
   * Returns the updateFuncId.
   * 
   * @return the updateFuncId
   */
  public String getUpdateFuncId() {
    return updateFuncId;
  }

  /**
   * Sets the updateFuncId.
   * 
   * @param updateFuncId
   *          the updateFuncId
   */
  public void setUpdateFuncId(String updateFuncId) {
    this.updateFuncId = updateFuncId;
  }

  /**
   * Returns the updateUserId.
   * 
   * @return the updateUserId
   */
  public String getUpdateUserId() {
    return updateUserId;
  }

  /**
   * Sets the updateUserId.
   * 
   * @param updateUserId
   *          the updateUserId
   */
  public void setUpdateUserId(String updateUserId) {
    this.updateUserId = updateUserId;
  }

  /**
   * Returns the updateLoginUserId.
   * 
   * @return the updateLoginUserId
   */
  public String getUpdateLoginUserId() {
    return updateLoginUserId;
  }

  /**
   * Sets the updateLoginUserId.
   * 
   * @param updateLoginUserId
   *          the updateLoginUserId
   */
  public void setUpdateLoginUserId(String updateLoginUserId) {
    this.updateLoginUserId = updateLoginUserId;
  }

  /**
   * Returns the version.
   * 
   * @return the version
   */
  public Long getVersion() {
    return version;
  }

  /**
   * Sets the version.
   * 
   * @param version
   *          the version
   */
  public void setVersion(Long version) {
    this.version = version;
  }
}