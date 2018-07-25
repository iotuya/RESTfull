package world.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import world.model.Greeting;

import javax.websocket.server.PathParam;

@RestController
public class GreetingController {

    @ApiOperation(value = "Get a greeting")
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String greeting() {
        return "hello";
    }


    @PostMapping(value = "/greeting")
    public Greeting postGreeting(@RequestBody Greeting greeting) {

        return greeting;
    }

    @RequestMapping(value = "/greeting/{id}", method = RequestMethod.GET)
    @ApiOperation(value = "Get a greeting")
    public Greeting greeting(final @PathParam("id") String id) {
        return new Greeting(14, "hello");
    }

}
