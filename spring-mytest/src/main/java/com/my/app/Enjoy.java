package com.my.app;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Author: huzp
 * @Description:
 * @Date: Created in  10:57 2020/10/26
 * @param:
 */
@Retention(RetentionPolicy.RUNTIME)
@Import(EnjoyAopBeanPostProcessor.class)
public @interface Enjoy {
}
