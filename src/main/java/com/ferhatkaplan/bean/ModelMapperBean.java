package com.ferhatkaplan.bean;


import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Log4j2
@Data
public class ModelMapperBean {

    @Bean(initMethod ="initalBeanMethods",destroyMethod = "destroyBeanMethods")
    @Scope("singleton")
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
    public void initalBeanMethods(){
        log.info("Model Mapper İnitializition (başladı)==>"+hashCode());
    }
    public void destroyBeanMethods(){
        log.error("Model Mapper kapatıldı==>"+hashCode());
    }
}
