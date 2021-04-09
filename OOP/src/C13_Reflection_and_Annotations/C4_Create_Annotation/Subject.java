package C13_Reflection_and_Annotations.C4_Create_Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target (ElementType.ANNOTATION_TYPE)
@Retention (RetentionPolicy.RUNTIME)
public @interface Subject {
    String[] categories();
}