
package com.rahulmadbhavi.training;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation
{
	String str() default "Testing";
	int val() default 9000;
}