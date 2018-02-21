package com.jpbeta.dbcommon.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;

import org.seasar.doma.SingletonConfig;
import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.UnknownColumnHandler;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.MssqlDialect;
import org.seasar.doma.jdbc.entity.EntityType;
import org.seasar.doma.jdbc.query.Query;
import org.seasar.doma.jdbc.tx.LocalTransactionDataSource;
import org.seasar.doma.jdbc.tx.LocalTransactionManager;
import org.seasar.doma.jdbc.tx.TransactionManager;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SingletonConfig
public class DbConfig implements Config {

  private static final DbConfig CONFIG = new DbConfig();

  private final Dialect dialect;

  private LocalTransactionDataSource dataSource;

  private TransactionManager transactionManager;

  private String dataSourceUrl;

  private String username;

  private String password;

  private String driverClassName;

  private DbConfig() {
    Properties properties = new Properties();
    Resource resource = new ClassPathResource("application.properties");

    try {
      File dbAsFile = resource.getFile();
      System.out.println("----------------------------------------");
      System.out.println(dbAsFile.getAbsolutePath());
      System.out.println("----------------------------------------");
      InputStream inputStream = new FileInputStream(dbAsFile.getAbsolutePath());
      properties.load(inputStream);

      dataSourceUrl = properties.getProperty("spring.datasource.url");
      username = properties.getProperty("spring.datasource.username");
      password = properties.getProperty("spring.datasource.password");
      driverClassName = properties.getProperty("spring.datasource.driverClassName");

    } catch (IOException e) {
      // TODO 自動生成された catch ブロック
      e.printStackTrace();
    }
    System.out.println("----------------------------------------");
    System.out.println(dataSourceUrl);
    System.out.println("----------------------------------------");
    DriverManagerDataSource ds = new DriverManagerDataSource();
    ds.setDriverClassName(driverClassName);
    ds.setUrl(dataSourceUrl);
    ds.setUsername(username);
    ds.setPassword(password);

    dialect = new MssqlDialect();
    dataSource = new LocalTransactionDataSource(ds);
    transactionManager = new LocalTransactionManager(dataSource.getLocalTransaction(getJdbcLogger()));
  }

  @Override
  public UnknownColumnHandler getUnknownColumnHandler() {
    return new UnknownColumnHandler() {
      @Override
      public void handle(Query query, EntityType<?> entityType, String unknownColumnName) {
      }
    };
  }

  @Override
  public Dialect getDialect() {
    return dialect;
  }

  @Override
  public DataSource getDataSource() {
    return dataSource;
  }

  @Override
  public TransactionManager getTransactionManager() {
    return transactionManager;
  }

  public static DbConfig singleton() {
    return CONFIG;
  }

}
