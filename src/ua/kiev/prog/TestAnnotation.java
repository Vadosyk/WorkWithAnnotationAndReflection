package ua.kiev.prog;

import java.lang.annotation.*;


@Target(value=ElementType.METHOD)
@Retention(value=RetentionPolicy.RUNTIME)
public @interface TestAnnotation {
    int a();
    int b();
}
