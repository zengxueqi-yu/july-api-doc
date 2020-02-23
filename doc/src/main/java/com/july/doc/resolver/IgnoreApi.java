package com.july.doc.resolver;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 忽略生成接口文档,标注了该注解的接口,将不会生成接口文档
 * <p>
 * Created by leaf on 2018/2/28.
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IgnoreApi {
}
