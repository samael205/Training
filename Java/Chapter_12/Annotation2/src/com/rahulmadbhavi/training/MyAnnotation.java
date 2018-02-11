
package com.rahulmadbhavi.training;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation
{
	String str();
	int val();
}