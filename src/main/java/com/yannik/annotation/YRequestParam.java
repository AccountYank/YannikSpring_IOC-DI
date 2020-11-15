package com.yannik.annotation;

import java.lang.annotation.*;

/**
 * @author yannik
        * @date 2020/11/15
        * @describe
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface YRequestParam {
    String value() default "";
}
