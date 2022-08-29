package structural.adapter.adapter;

import structural.adapter.Android;
import structural.adapter.adaptertarget.Warrior;

public class AndroidAdapter implements Warrior {
    private final Android android;

    public AndroidAdapter(Android android) {
        this.android = android;
    }

    @Override
    public void attack() {
        android.laserBeam();
    }
}
