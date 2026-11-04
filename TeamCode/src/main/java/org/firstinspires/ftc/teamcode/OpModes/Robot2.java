package org.firstinspires.ftc.teamcode.OpModes;

import android.view.WindowInsets;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Hardware;
import org.firstinspires.ftc.teamcode.Subsystems.Intake;
import org.firstinspires.ftc.teamcode.Subsystems.Outtake;
import org.firstinspires.ftc.teamcode.Subsystems.Sasiu;
import org.firstinspires.ftc.teamcode.Subsystems.Sidetake;

@TeleOp(name = "Robot2")
public class Robot2 extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {

        Hardware hardware = new Hardware(hardwareMap);

        Outtake outtake = new Outtake(hardware);

        Sasiu sasiu = new Sasiu(hardware);

        Intake intake = new Intake(hardware);

        Sidetake sidetake = new Sidetake(hardware);

        outtake.stop();

        waitForStart();

        while (opModeIsActive()) {

            double x = gamepad1.left_stick_x;

            double y = gamepad1.left_stick_y;

            double rx = gamepad1.right_stick_x;

            sasiu.drive(x,y,rx);

            if(gamepad1.aWasPressed()) {outtake.toggle(); sidetake.toggle();}

            if(gamepad1.xWasPressed()) intake.toggle();



        }
    }
}
