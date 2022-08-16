package com.ferhatkaplan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@SpringBootApplication
//exclude:dahil etmemek
@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
        //org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class
}
)

//AuditingEnable
//Dikkat: AuditorAware metodumuzu buraya yazacağız
@EnableJpaAuditing(auditorAwareRef = "auditorAwareMethod")
public class SpringBoot1Application {

    //PSVM Method
    public static void main(String[] args) {

        //devtool active inactive
        System.setProperty("spring.devtools.restart.enabled","false");

        //Disables headless JOptionPane
        System.setProperty("java.awt.headless", "false");

        //PSVM
        SpringApplication.run(SpringBoot1Application.class, args);
    }
}
