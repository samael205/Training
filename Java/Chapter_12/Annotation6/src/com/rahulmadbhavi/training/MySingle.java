
package com.rahulmadbhavi.training;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MySingle
{
	int value();
}