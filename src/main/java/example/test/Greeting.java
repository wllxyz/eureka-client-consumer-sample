package example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wll on 17-12-18.
 */
@RestController
public class Greeting {
    @Autowired
    HelloRemote helloRemote;

    @RequestMapping(name = "/greeting/")
    public String greeting() {
        return helloRemote.hello("every one!");
    }
}
