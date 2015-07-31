package com.teddy.jfinal.annotation;

import java.lang.annotation.*;

/**
 * Created by teddy on 2015/7/20.
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface PluginHandler {
}
