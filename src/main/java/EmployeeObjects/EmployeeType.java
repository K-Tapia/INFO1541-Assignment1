package EmployeeObjects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
//Annotations for employee type.
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface EmployeeType {
    String type();
}
