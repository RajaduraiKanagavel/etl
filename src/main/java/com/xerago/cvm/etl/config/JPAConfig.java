package com.xerago.cvm.etl.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages="com.xerago.cvm.etl.domain")
@EnableTransactionManagement
public class JPAConfig {

}
