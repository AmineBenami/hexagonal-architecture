package cacib.interview.demo.application.request;
import com.baeldung.dddhexagonalspring.domain.Product;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
/**
 * CreateCounterRequest
 */
public class CreateCounterRequest {
    @NotNull private String key;
    
    @JsonCreator
    public CreateCounterRequest(@JsonProperty("key") @NotNull final String key) {
        this.key = key;
    }

    public String getKey() {
        return product;
    }
}
