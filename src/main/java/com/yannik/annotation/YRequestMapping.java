package com.yannik.annotation;

import java.lang.annotation.*;

/**
 * @author yannik
 * @date 2020/11/15
 * @describe
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface YRequestMapping {
    String value() default "";
}
