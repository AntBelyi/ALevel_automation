package hw_14;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

public class Annotations1 {
    @Bean("myBean")
    public class MyClass {}

    @Deprecated
    private int oldValue;

    @Override
    public String toString() {...}

    @SupressWarnings()
    @SaveVarargs
    @Test(@Before, @After)
    @Transactional
    @Entity
    @Autowire

    public @interface Service {
        String name();
        boolean lazyLoad() default false;
    }

    @Documented
    @Inherited
    @Target
    ElementType.ANNOTATION_TYPE
    ElementType.CONSTRUCTOR
    ElementType.FIELD
    ElementType.LOCAL_VARIABLE
    ElementType.METHOD
    ElementType.PACKAGE
    ElementType.PARAMETER
    ElementType.TYPE
    @Retention
    RetentionPolicy.SOURCE
    RetentionPolict.CLASS
    RetentionPolicy.RUNTIME

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Init {
        boolean suppressException() default false;
    }

    public static void main(String[] arg) {
        inspectSerice(SimpleService.class);
        inspectService(LazyService.class);
        inspectService(String.class);
    }
    static void inspectService(Class<?> service) {
    }

    boolean isAnnotationPresent(
            Class<? extends Annotation> ann);
    A getAnnotation(Class<A> ann);
    Annotation[] getAnnotations();
    Annotation[] getDeclaredAnnotations();
    if ( service.isAnnotationPresent(
            Service.class) ) {
    Service ann =
    sevice.getAnnotation(Service.class);
    }
}

