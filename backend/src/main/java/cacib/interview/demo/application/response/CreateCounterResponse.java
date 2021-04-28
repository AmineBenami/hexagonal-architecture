package cacib.interview.demo.application.response;

/**
 * CreateCounterResponse
 */
public class CreateCounterResponse {
    private final Integer count;

    public CreateCounterResponse(final Integer count) {
        this.count = count;
    }

    public UUID getCount() {
        return count;
    }    
}