package learn.java.annotation;

/**
 * Created by liuda on 2017/4/13.
 */


@interface Person {
    String property() default "i'm liuda";
}
