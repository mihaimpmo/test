package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Hardware {
    public DcMotor bigShooter , smallShooter ,sideTake , inTake , fr , fl , br , bl;
    public Hardware(HardwareMap hw) {
        bigShooter = hw.get(DcMotor.class, "s1");
        bigShooter.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        smallShooter = hw.get(DcMotor.class, "s2");
        smallShooter.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        sideTake = hw.get(DcMotor.class, "s3");
        sideTake.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        inTake = hw.get(DcMotor.class, "s3");
        inTake.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        fr = hardwareMap.get(DcMotor.class, "fr");
        fl = hardwareMap.get(DcMotor.class, "fl");
        br = hardwareMap.get(DcMotor.class, "bl");
        bl = hardwareMap.get(DcMotor.class, "br");
        fr.setDirection(DcMotorSimple.Direction.REVERSE);
        br.setDirection(DcMotorSimple.Direction.REVERSE);



    }
}
