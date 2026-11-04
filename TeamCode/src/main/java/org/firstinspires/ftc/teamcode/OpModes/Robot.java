package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Hardware;
import org.firstinspires.ftc.teamcode.Subsystems.Outtake;

@TeleOp(name = "Robot")
public class Robot extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        Hardware hardware = new Hardware(hardwareMap);
        Outtake outtake = new Outtake(hardware);

        outtake.stop();
        waitForStart();
        while (opModeIsActive()) {
            if(gamepad1.aWasPressed()) outtake.toggle();

        }
    }
}
