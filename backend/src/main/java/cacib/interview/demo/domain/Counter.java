package cacib.interview.demo.domain;

/**
 * Counter
 */
public class Counter {
    private String key;

    private Integer count;

    protected Counter() {}

    public Counter(String key, Interger count) {
        this.key = key;
        this.count = count;
    }
    
    public Counter(String key) {
        this.key = key;
        this.count = 0;
    }

    public Interger getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void incrementCount() {
        this.count += 1;
    }
}