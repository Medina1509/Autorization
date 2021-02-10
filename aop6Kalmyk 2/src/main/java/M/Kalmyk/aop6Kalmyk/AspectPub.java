package M.Kalmyk.aop6Kalmyk;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

@Aspect
public class AspectPub {

    @AfterReturning (pointcut = "execution(* M.Kalmyk.aop6Kalmyk.User.setName(..))", returning = "name")
    public void logAfter(Object name) {
        System.out.println("1111111111111111111111111111111111111");
        System.out.println(name);
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println("1111111111111111111111111111111111111");
    }

}
