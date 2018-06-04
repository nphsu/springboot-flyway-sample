package shunp.springbootflywaysample.config

import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy
import org.springframework.context.annotation.Bean

class FlywayConfig {

    val clearDb: Boolean = true

    @Bean
    fun strategy(): FlywayMigrationStrategy {
        return CustomFlywayMigrationStrategy()
    }
}