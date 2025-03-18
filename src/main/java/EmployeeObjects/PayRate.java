package EmployeeObjects;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
//annotation for payrates
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface PayRate {
    String type();
}
