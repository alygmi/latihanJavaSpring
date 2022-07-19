/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programmerzamannow.spring.core;

import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

import org.springframework.context.annotation.Bean;
import programmerzamannow.spring.core.data.Foo;

/**
 *
 * @author AlYgmi
 */
@Slf4j
@Configuration
public class BeanConfiguration {
    
    @Bean
    public Foo foo() {
        Foo foo = new Foo();
        log.info("membuat foo");
        return foo;
    }
}
