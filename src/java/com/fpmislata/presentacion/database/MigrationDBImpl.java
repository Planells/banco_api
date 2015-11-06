/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.presentacion.database;

import com.fpmislata.banco.persistence.JDBC.DataSourceFactory;
import javax.sql.DataSource;
import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author German
 */
public class MigrationDBImpl implements MigrationDB {
    @Autowired
    DataSourceFactory dataSourceFactory;
    @Override
    public void toMigration() {
        try {           
            DataSource dataSource = dataSourceFactory.getDataSource();
            Flyway flyway = new Flyway();
            flyway.setDataSource(dataSource);
            flyway.setLocations("com.fpmislata.banco.persistence.Scripts");
            flyway.setEncoding("utf-8");
            flyway.migrate();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

    }

}
