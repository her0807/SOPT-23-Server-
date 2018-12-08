package org.sopt.seminar7.utills.Auth;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
//런타임시까지 참조 가능
@Retention(RetentionPolicy.RUNTIME)
//Java Doc에도 표시
@Documented
//상속 가능
@Inherited
public @interface Auth {
}
