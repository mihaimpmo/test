package org.firstinspires.ftc.teamcode.Subsystems;

import org.firstinspires.ftc.teamcode.Constants;
import org.firstinspires.ftc.teamcode.Hardware;
import org.firstinspires.ftc.teamcode.MathUtils;

public class Outtake {
    Hardware hardware;
    private boolean isActive;
    public Outtake(Hardware hardware) {
        isActive = false;
        this.hardware = hardware;
    }

    public void start() {
        start(1.0);
        isActive = true;
    }
    public void start(double scale) {
        hardware.bigShooter.setPower(MathUtils.clamp(Constants.BIG_SHOOTER_POWER*scale, -1, 1));
        isActive = true;
    }
    public void stop() {
        hardware.bigShooter.setPower(0);
        isActive = false;
    }
    public void toggle() {
        if(isActive) stop();
        else start();
    }
}
