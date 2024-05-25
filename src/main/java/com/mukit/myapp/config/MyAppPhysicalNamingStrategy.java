package com.mukit.myapp.config;

import com.mukit.myapp.utility.AppEnvironment;
import com.mukit.myapp.utility.CommonUtils;
import com.mukit.myapp.utility.DatabaseType;
import lombok.RequiredArgsConstructor;
import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategy;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.util.Arrays;
import java.util.List;

@Configuration
@RequiredArgsConstructor
public class MyAppPhysicalNamingStrategy implements PhysicalNamingStrategy {

    private final Environment env;
    private final List<String> alphaAppTables = Arrays.asList("ALPHA_APP_USER");

    @Override
    public Identifier toPhysicalCatalogName(Identifier identifier, JdbcEnvironment jdbcEnvironment) {
        return identifier;
    }

    @Override
    public Identifier toPhysicalSchemaName(Identifier identifier, JdbcEnvironment jdbcEnvironment) {
        return identifier;
    }

    @Override
    public Identifier toPhysicalTableName(Identifier identifier, JdbcEnvironment jdbcEnvironment) {
        AppEnvironment currentEnv = CommonUtils.getCurrentEnv(env);
        String databaseType = DatabaseType.fromEnvironment(currentEnv, identifier.getText(), alphaAppTables);
        return new Identifier(databaseType + "." + identifier.getText(), identifier.isQuoted());
    }

    @Override
    public Identifier toPhysicalSequenceName(Identifier identifier, JdbcEnvironment jdbcEnvironment) {
        return identifier;
    }

    @Override
    public Identifier toPhysicalColumnName(Identifier identifier, JdbcEnvironment jdbcEnvironment) {
        return identifier;
    }
}
