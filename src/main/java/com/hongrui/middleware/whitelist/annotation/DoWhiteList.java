package com.hongrui.middleware.whitelist.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author hongrui
 * @description
 * @date 2024-11-17 10:28
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DoWhiteList {

    String key() default "";

    String returnJson() default "";

}
