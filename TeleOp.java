//package org.firstinspires.ftc.teamcode;
//
//import com.qualcomm.robotcore.eventloop.opmode.Disabled;
//import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.CRServo;
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.DcMotorSimple;
//import com.qualcomm.robotcore.hardware.Servo;
//import com.qualcomm.robotcore.util.ElapsedTime;
//
//
//
//
//
//@TeleOp(name="Reb TeleOP")
//@Disabled
//public class teleop extends OpMode {
//
//    public DcMotor backleft;
//    public DcMotor backright;
//    public DcMotor frontleft;
//    public DcMotor frontright;
//    public DcMotor lift;
//    public DcMotor grabber;
//
//
//
//
//
//    @Override
//    public void init() {
//        backleft = hardwareMap.get(DcMotor.class,"backleft");
//        backright = hardwareMap.get(DcMotor.class, "backright");
//        frontleft = hardwareMap.get(DcMotor.class, "frontleft");
//        frontright = hardwareMap.get(DcMotor.class, "frontright");
//        lift = hardwareMap.get(DcMotor.class, "lift");
//        grabber = hardwareMap.get(DcMotor.class, "grabber");
//
//
//        backright.setDirection(DcMotor.Direction.REVERSE);
//        frontright.setDirection(DcMotor.Direction.REVERSE);
//
//
//        backleft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//        backright.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//        frontleft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//        frontright.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//        lift.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//        grabber.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//
//
//        backleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        backright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        frontleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        frontright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        lift.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        grabber.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//
//        backleft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        backright.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        frontleft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        frontright.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        lift.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        grabber.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//
//        backleft.setPower(0);
//        backright.setPower(0);
//        frontleft.setPower(0);
//        frontright.setPower(0);
//        lift.setPower(0);
//        grabber.setPower(0);
//
//
//
//    }
//
//
//    @Override
//    public void loop() {
//
//
//        //Drive Train Code
//        double forward = speedMode * Math.pow(gamepad1.left_stick_y, 3);
//        double right = -speedMode * Math.pow(gamepad1.left_stick_x, 3);
//        double turn = -speedMode * Math.pow(gamepad1.right_stick_x,3);
//
//        double leftFrontPower = forward + right + turn;
//        double leftBackPower = forward - right + turn;
//        double rightFrontPower = forward - right - turn;
//        double rightBackPower = forward + right - turn;
//        double[] powers = {leftFrontPower, leftBackPower, rightFrontPower, rightBackPower};
//
//        boolean needToScale = false;
//        for (double power : powers){
//            if(Math.abs(power) > 1){
//                needToScale = true;
//                break;
//            }
//        }
//        if (needToScale){
//            double greatest = 0;
//            for (double power : powers){
//                if (Math.abs(power) > greatest){
//                    greatest = Math.abs(power);
//                }
//            }
//            leftFrontPower /= greatest;
//            leftBackPower /= greatest;
//            rightFrontPower /= greatest;
//            rightBackPower /= greatest;
//        }
//
//        boolean stop = true;
//        for (double power : powers){
//            if (Math.abs(power) > stopBuffer){
//                stop = false;
//                break;
//            }
//        }
//        if (stop){
//            leftFrontPower = 0;
//            leftBackPower = 0;
//            rightFrontPower = 0;
//            rightBackPower = 0;
//        }
//
//        frontleft.setPower(leftFrontPower);
//        backleft.setPower(leftBackPower);
//        frontright.setPower(rightFrontPower);
//        backright.setPower(rightBackPower);
//        //Drive Train Code
//
//        //Lift Code
//        if (gamepad2.right_stick_y >= .3) {
//            lift.setPower(1);
//        }else if (gamepad2.right_stick_y <= -.3) {
//            lift.setPower(-1);
//        }else {
//         lift.setPower(0);}
//
//        //Grabber Code in code
//        if (gamepad2.a = true) {
//            grabber.setPower(1);
//        } else (gamepad2.a = false) {
//            grabber.setPower(0);
//        }
//
//        //Grabber Code out code
//        if (gamepad2.b = true) {
//            grabber.setPower(-1);
//        } else (gamepad2.b = false) {
//        grabber.setPower(0);
//        }
//
//    }
//
//

 //   }