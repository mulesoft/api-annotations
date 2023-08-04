/*
 * Copyright 2023 Salesforce, Inc. All rights reserved.
 */
package org.mule.api.annotation.jpms;

import static java.lang.annotation.ElementType.MODULE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Marks a JPMS Module as the entry point of a Mule Service.
 * 
 * @since 1.6
 */
@Documented
@Retention(RUNTIME)
@Target(MODULE)
public @interface ServiceModule {

}
