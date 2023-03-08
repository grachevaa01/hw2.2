public abstract class Total {
    private final int  wheelsCount;
    private final String modelName;

    public Total(int wheelsCount, String modelName) {
        this.wheelsCount = wheelsCount;
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }
}
