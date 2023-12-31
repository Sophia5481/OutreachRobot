package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.Configurations;

public class ClawBot extends Drivetrain {
    private Telemetry telemetry;
    private ElapsedTime runtime = new ElapsedTime();
    public Configurations names = new Configurations();
    public Servo clawServo, liftServo;

    //Backend
    public void initialize(HardwareMap hardwareMap, Telemetry telemetry_) {
        telemetry = telemetry_;

        // Servos
        clawServo = hardwareMap.get(Servo.class, names.clawServo);
        liftServo = hardwareMap.get(Servo.class, names.liftServo);

        //HardwareMaps
        initializeDriveTrain(hardwareMap, telemetry_);
    }

    // Servos
    public void setLiftServo(double position) {
        liftServo.setPosition(position);
    }
    public void setClawServo(double position) {
        clawServo.setPosition(position);
    }
}
