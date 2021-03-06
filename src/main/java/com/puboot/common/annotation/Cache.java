package com.puboot.common.annotation;

import java.lang.annotation.*;
import java.util.concurrent.TimeUnit;

/**
 * Redis缓存自定义注解
 *
 * @author LinZhaoguan
 * @version V1.0
 * @date 2019年9月11日
 */
@Target({ElementType.METHOD}) //标明注解可作用的地方 FIELD--字段  METHOD--方法
@Retention(RetentionPolicy.RUNTIME) //存活阶段 RUNTIME 运行时   还有JVM Class
@Inherited //可继承
public @interface Cache {

    /**
     * 业务的名称
     */
    String value() default "";

    /**
     * redis缓存的Key（默认类名-方法名-自定义key）
     */
    String key() default "";

    /**
     * 是否刷新缓存，默认false
     */
    boolean flush() default false;

    /**
     * 缓存失效时间，默认30
     */
    long expire() default 30L;

    /**
     * 缓存时间单位，默认天
     */
    TimeUnit unit() default TimeUnit.DAYS;
}
