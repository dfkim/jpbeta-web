package com.jpbeta.dbcommon.entity;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

/**
 * 
 */
public class TblAdMstAgeDivListener implements EntityListener<TblAdMstAgeDiv> {

  @Override
  public void preInsert(TblAdMstAgeDiv entity, PreInsertContext<TblAdMstAgeDiv> context) {
  }

  @Override
  public void preUpdate(TblAdMstAgeDiv entity, PreUpdateContext<TblAdMstAgeDiv> context) {
  }

  @Override
  public void preDelete(TblAdMstAgeDiv entity, PreDeleteContext<TblAdMstAgeDiv> context) {
  }

  @Override
  public void postInsert(TblAdMstAgeDiv entity, PostInsertContext<TblAdMstAgeDiv> context) {
  }

  @Override
  public void postUpdate(TblAdMstAgeDiv entity, PostUpdateContext<TblAdMstAgeDiv> context) {
  }

  @Override
  public void postDelete(TblAdMstAgeDiv entity, PostDeleteContext<TblAdMstAgeDiv> context) {
  }
}