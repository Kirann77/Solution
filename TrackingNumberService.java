public class TrackingNumberService {
    private SnowflakeIdGenerator idGenerator;

    public TrackingNumberService(long machineId, long datacenterId) {
        this.idGenerator = new SnowflakeIdGenerator(machineId, datacenterId);
    }

    public String generateTrackingNumber() {
        long id = idGenerator.generateId();
        return String.format("TRK-%d", id);
    }
}
