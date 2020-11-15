package com.yannik.annotation;

import java.lang.annotation.*;

/**
 * @author yannik
 * @date 2020/11/15
 * @describe
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface YAutowired {
    String value() default "";
}
