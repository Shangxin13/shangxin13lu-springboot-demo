package org.shangxin13lu.springboot.thymeleaf.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@MapperScan(basePackages = "org.shangxin13lu.springboot.thymeleaf.demo.**.**.mapper")
public class SpringbootThymeleafDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootThymeleafDemoApplication.class, args);
  }
}
