package com.my.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: huzp
 * @Description:
 * @Date: Created in  17:03 2020/10/12
 * @param:
 */

@ComponentScan("com.my")
@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
}
