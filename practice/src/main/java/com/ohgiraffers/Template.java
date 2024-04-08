package com.ohgiraffers;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class Template {

    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost/employeedb";
    private static String USERNAME = "ohgiraffers";
    private static String PASSWORD = "ohgiraffers";

    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSqlSession() {

        if (sqlSessionFactory == null) {
            Environment environment = new Environment(
                    "dev",
                    new JdbcTransactionFactory(),
                    new PooledDataSource(DRIVER, URL, USERNAME, PASSWORD)
            );

            Configuration configuration = new Configuration(environment);
            configuration.addMapper(EmployeeMapper.class);

            sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
        }

        return sqlSessionFactory.openSession(false);
    }
}
