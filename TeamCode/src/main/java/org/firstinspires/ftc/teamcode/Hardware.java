package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Hardware {
    public DcMotor bigShooter;
    public Hardware(HardwareMap hw) {
        bigShooter = hw.get(DcMotor.class, "s1");
        bigShooter.setDirection(DcMotorSimple.Direction.REVERSE);
        bigShooter.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        bigShooter.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }
}
