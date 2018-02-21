package com.jpbeta.web.service;

import java.util.List;

import org.seasar.doma.jdbc.tx.TransactionManager;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.jpbeta.common.utils.GsonUtil;
import com.jpbeta.dbcommon.config.DbConfig;
import com.jpbeta.dbcommon.dao.table.TblAdMstAgeDivDao;
import com.jpbeta.dbcommon.dao.table.TblAdMstAgeDivDaoImpl;
import com.jpbeta.dbcommon.entity.TblAdMstAgeDiv;
import com.jpbeta.web.form.AgeForm;

@Service
public class AgeService {
  private Gson gson = GsonUtil.createGson();
  private TransactionManager tm = DbConfig.singleton().getTransactionManager();
  private TblAdMstAgeDivDao tblAdMstAgeDivDao = new TblAdMstAgeDivDaoImpl();

  /**
   *
   * @param form
   * @return
   */
  public String getList(AgeForm form) {
    List<TblAdMstAgeDiv> list = tm.required(() -> {
      return tblAdMstAgeDivDao.getList();
    });
    return gson.toJson(list);
  }
}
