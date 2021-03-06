package com.justdoit.keller.common.mybatis.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 字段名注解，用于要查询的字段名之前
 * 在select * from tableName时,代替*的位置
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FieldAttribute {
    /**
     * 是否是明细字段，如果是明细字段，在查询列表时不显示该字段
     * @return
     */
    boolean detailed() default false;
}
