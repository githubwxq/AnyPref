package net.nashlegend.anypref.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by NashLegend on 16/5/20.
 */
@Target(FIELD)
@Retention(RUNTIME)
public @interface PrefField {
    String value() default "";

    double numDef() default 0;

    boolean boolDef() default false;

    String[] strDef() default "";
}
