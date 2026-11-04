package org.firstinspires.ftc.teamcode.Subsystems;

import org.firstinspires.ftc.teamcode.Hardware;

public class Sidetake {
    Hardware hardware;
    private boolean isActive;

    public Sidetake(Hardware hardware) {
        isActive = false;
        this.hardware = hardware;
    }
    public void start() {
        hardware.sideTake.setPower(1);
        isActive = true;
    }
    public void stop() {
        hardware.sideTake.setPower(0);
        isActive = false;
    }
    public void toggle(){
        if (isActive)stop();
        else start();

    }
}
