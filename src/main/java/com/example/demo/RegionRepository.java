package com.example.demo;

import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

/**
 * @author cemo
 */
@JdbcRepository(dialect = Dialect.MYSQL)
public interface RegionRepository extends CrudRepository<Region, Long> {

}
