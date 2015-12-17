package hello;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.ResourceSupport;

public class Greeting extends ResourceSupport {
    private final String content;

    @JsonCreator
    public Greeting(@JsonProperty("contet") String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
