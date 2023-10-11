<<<<<<<< HEAD:session-5/part1/spring/src/main/java/com/beyond/spring/runner/SpringRunner.java
package com.beyond.spring.runner;
========
package com.beyond.open_sesam.runner;
>>>>>>>> development:session-5/challenge-solutions/part1-main/open_sesam/src/main/java/com/beyond/open_sesam/runner/Greeter.java

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Open Sesame.");
    }
}
