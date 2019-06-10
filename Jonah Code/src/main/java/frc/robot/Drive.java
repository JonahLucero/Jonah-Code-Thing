/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5817.robot;
//import org.usfirst.frc.team5817.subsystems.Drive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.Servo;

package frc.robot;

/**
 * Add your docs here.
 */


public class Drive

public static class TalonSRX 
public class Drive {

    public static TalonSRX rightDriveOne;
    
    public static TalonSRX rightDriveTwo;
        
    public static TalonSRX rightDriveThree;
        
    public static TalonSRX leftDriveOne;
        leftDriveOne.configNomnalOutputForward(0, kTimeoutMs);
        leftDriveOne.configPeakOutputForward(1, kTimeoutMs);
        leftDriveOne.configNomnalOutputReverse(0, kTimeoutMs);
        leftDriveOne.configPeakOutputReverse(-1, kTimeoutMs);
    public static TalonSRX leftDriveTwo;
        leftDriveTwo.configNomnalOutputForward(0, kTimeoutMs);
        leftDriveTwo.configPeakOutputForward(1, kTimeoutMs);
        leftDriveTwo.configNomnalOutputReverse(0, kTimeoutMs);
        leftDriveTwo.configPeakOutputReverse(-1, kTimeoutMs);
    public static TalonSRX leftDriveThree;
    leftDriveThree.configNomnalOutputForward(0, kTimeoutMs);
    leftDriveThree.configPeakOutputForward(1, kTimeoutMs);
    leftDriveThree.configNomnalOutputReverse(0, kTimeoutMs);
    leftDriveThree.configPeakOutputReverse(-1, kTimeoutMs);
 private Drive() {
    TalonSRX(0) = rightDriveOne
    TalonSRX(1) = rightDriveTwo;
    TalonSRX(2) = rightDriveThree;
    TalonSRX(3) = leftDriveOne;
    TalonSRX(4) = leftDriveTwo;
    TalonSRX(5) = leftDriveThree;
    }
}

double rightSensitivityX = 0.4;							// Sensitivity Controls 
	double rightSensitivityY = 0.4;							// 1 = High Sensitivity
	double leftSensitivityX = 0.6;								// 0 = Low Sensitivity
	double leftSensitivityY = 0.6;
	
//Attempted crazy acceleration thing

while return driverController.getRawAxis(1);{
    rightSensitivityX = rightSensitivityX++
}

public void MotionMagic(){
    // Peak/Nominal Outputs
    rightDriveOne.configNominalOutputForward(0, kTimeoutMs);
    rightDriveOne.configPeakOutputForward(1, kTimeoutMs);
    rightDriveOne.configNominalOutputReverse(0, kTimeoutMs);
    rightDriveOne.configPeakOutputReverse(-1, kTimeoutMs);

    rightDriveTwo.configNominalOutputForward(0, kTimeoutMs);
    rightDriveTwo.configPeakOutputForward(1, kTimeoutMs);
    rightDriveTwo.configNominalOutputReverse(0, kTimeoutMs);
    rightDriveTwo.configPeakOutputReverse(-1, kTimeoutMs);

    rightDriveThree.configNominalOutputForward(0, kTimeoutMs);
    rightDriveThree.configNominalOutputForward(1, kTimeoutMs);
    rightDriveThree.configPeakOutputReverse(0, kTimeoutMs);
    rightDriveThree.configPeakOutputReverse(-1, kTimeoutMs);

    

}