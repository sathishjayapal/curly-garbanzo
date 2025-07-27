package me.sathish.allsummer.sathish_test_spring.base.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EntityScan("me.sathish.allsummer.sathish_test_spring.base.domain")
@EnableJpaRepositories("me.sathish.allsummer.sathish_test_spring.base.repos")
@EnableTransactionManagement
public class DomainConfig {
}
