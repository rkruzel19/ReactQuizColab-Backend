package com.reactquiz.backend.model;

import org.apache.commons.dbcp2.BasicDataSource;

public class Database {
    private BasicDataSource dataSource;

    public Database() {
        dataSource = new BasicDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/quiz_app");
        dataSource.setUsername("quiz_user");
        dataSource.setPassword("frog123");
    }

    public BasicDataSource getDataSource() {
        return dataSource;
    }
}


