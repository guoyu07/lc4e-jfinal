package com.teddy.jfinal.interfaces;

import com.jfinal.aop.Invocation;
import com.teddy.jfinal.exceptions.ValidateException;

/**
 * Created by teddy on 2015/8/22.
 */
public interface AnnotationResolver {

    public void resolve(Invocation invocation) throws Exception;
}