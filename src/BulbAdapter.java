public class BulbAdapter implements SmartDevice {

    private final LegacyBulb bulb;
    public static final int DEFAULT_K = 1;

    public BulbAdapter(LegacyBulb bulb) {
        if (bulb == null) {
            throw new IllegalArgumentException("Adaptee LegacyBulb reference cannot be null.");
        }
        this.bulb = bulb;
    }

    @Override
    public void turnOn() {
        this.bulb.setBrightness(255);
    }

    @Override
    public void turnOff() {
        this.bulb.setBrightness(0);
    }

    @Override
    public boolean isOn() {
        if (!this.bulb.hasPower()) {
            return false; //[cite: 2]
        }
        return this.bulb.readBrightness() > 0;
    }

    @Override
    public int getPowerPercent() {
        if (!this.bulb.hasPower()) {
            return 0;
        }

        int rawBrightness = this.bulb.readBrightness();
        if (rawBrightness == 0) {
            return 0;
        }

        int rawPercent = (rawBrightness * 100) / 255;
        int calibratedPercent = rawPercent + DEFAULT_K;

        return Math.min(100, calibratedPercent);
    }
}