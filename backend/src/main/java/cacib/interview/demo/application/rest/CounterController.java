package cacib.interview.demo.application.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import cacib.interview.demo.application.request.CreateCounterRequest;
import cacib.interview.demo.application.response.CreateCounterResponse;
import cacib.interview.demo.domain.service.CounterService;
/**
 * CounterController
 */
@RestController
@RequestMapping("/counters")
public class CounterController {

    private final CounterService counterService;

    @Autowired
    public CounterController(CounterService counterService) {
        this.counterService = counterService;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    CreateCounterResponse createCounter(@RequestBody final CreateCounterRequest createCounterRequest) {
        final Integer count = counterService.createCounter(createCounterRequest.getKey());
        return new CreateCountResponse(count);
    }

    @PostMapping(value = "/{key}/increment", consumes = MediaType.APPLICATION_JSON_VALUE)
    CreateCounterResponse incrementCounter(@PathVariable final String key) {
        final Integer count = counterService.incrementCounter(key);
        return new CreateCountResponse(count);
    }
}
