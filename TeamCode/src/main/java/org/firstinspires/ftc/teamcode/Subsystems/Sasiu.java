package org.firstinspires.ftc.teamcode.Subsystems;

import org.firstinspires.ftc.teamcode.Hardware;

public class Sasiu {
    Hardware hardware;

    public Sasiu(Hardware hw) {
        this.hardware = hw;
    }

    public void drive(double x, double y, double rx) {
        hardware.fl.setPower(y + x + rx);
        hardware.bl.setPower(y - x + rx);
        hardware.fr.setPower(y - x - rx);
        hardware.br.setPower(y + x - rx);
    }
}
