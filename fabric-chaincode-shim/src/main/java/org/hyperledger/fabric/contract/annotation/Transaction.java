/*
Copyright IBM Corp., DTCC All Rights Reserved.

SPDX-License-Identifier: Apache-2.0
*/

package org.hyperledger.fabric.contract.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Method level annotation indicating the function to be a callable transaction
 * function
 */
@Retention(RUNTIME)
@Target(METHOD)
public @interface Transaction {
    /**
     * TRUE indicates that this function is intended to be called with the 'submit'
     * semantics.
     *
     * FALSE indicates that this is intended to be called with the evaluate
     * semantics
     *
     * @return
     */
    boolean submit() default true;

    /**
     * The name of the callable transaction if it should be different to the method
     * name
     *
     * @return the transaction name
     */
    String name() default "";
}
