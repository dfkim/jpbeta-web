package com.jpbeta.dbcommon.dao.table;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.builder.SelectBuilder;

import com.jpbeta.dbcommon.config.DbConfig;
import com.jpbeta.dbcommon.entity.TblAdMstAgeDiv;


/**
 */
@Dao(config = DbConfig.class)
public interface TblAdMstAgeDivDao {
  /**
   *
   * @return
   */
  default List<TblAdMstAgeDiv> getList() {
    Config config = Config.get(this);
    SelectBuilder builder = SelectBuilder.newInstance(config);
    builder.sql("SELECT * FROM TBL_AD_MST_AGE_DIV WHERE  DEL_DIV = '0'   ");
    return builder.getEntityResultList(TblAdMstAgeDiv.class);
  }

  /**
   * @param ageDiv
   * @return the TblAdMstAgeDiv entity
   */
  @Select
  TblAdMstAgeDiv selectById(String ageDiv);

  /**
   * @param ageDiv
   * @param version
   * @return the TblAdMstAgeDiv entity
   */
  @Select(ensureResult = true)
  TblAdMstAgeDiv selectByIdAndVersion(String ageDiv, Long version);

  /**
   * @param entity
   * @return affected rows
   */
  @Insert
  int insert(TblAdMstAgeDiv entity);

  /**
   * @param entity
   * @return affected rows
   */
  @Update
  int update(TblAdMstAgeDiv entity);

  /**
   * @param entity
   * @return affected rows
   */
  @Delete
  int delete(TblAdMstAgeDiv entity);
}