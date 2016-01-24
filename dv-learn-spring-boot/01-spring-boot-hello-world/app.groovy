//@Grab("spring-boot-starter-web")

// import org.springframework.web.bind.annotation.RestController
// + a bunch of other imports

@RestController
//@EnableAutoConfiguration
public class HelloWorld {
    @RequestMapping("/")
    public String home() {
        "Hello World!"
    }

    //public static void main(String[] args) {
    //  SpringApplication.run(HelloWorld.class, args);
    //}
}
