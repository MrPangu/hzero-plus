package com.pigic.hzeropigic.infra.annotation;

import com.pigic.hzeropigic.configration.ConditionOnOSCondition;
import com.pigic.hzeropigic.infra.enums.OSSystem;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @Author: 潘顾昌
 * @Date: 2019/8/11 21:26
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
@Conditional({ConditionOnOSCondition.class})
public @interface ConditionOnOS {
    OSSystem value() default OSSystem.WINDOWS;
}