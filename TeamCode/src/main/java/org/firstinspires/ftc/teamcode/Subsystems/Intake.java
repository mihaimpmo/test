package org.firstinspires.ftc.teamcode.Subsystems;

import org.firstinspires.ftc.teamcode.Hardware;

public class Intake {
    Hardware hardware;
    private boolean isActive;

    public Intake(Hardware hardware) {
        isActive = false;
        this.hardware = hardware;
    }

    public void start() {
        hardware.inTake.setPower(1);
        isActive = true;
    }
    public void stop() {
        hardware.inTake.setPower(0);
        isActive = false;
    }
    public void toggle(){
        if (isActive)stop();
        else start();

    }
}
