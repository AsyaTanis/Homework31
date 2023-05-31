public abstract class Transport {

    private final String model;

    public Transport(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "model='" + model + '\'' +
                '}';
    }
}
