package M.Kalmyk.aop6Kalmyk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class RestControl {
    @GetMapping("/user")
    public Principal user(Principal principal) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("user.xml");
        User user = (User) appContext.getBean("user");
        if (principal != null) {
            user.setName(principal.getName());
        }
        return principal;
    }
}
