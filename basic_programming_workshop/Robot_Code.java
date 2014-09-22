/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj;


public class Robot extends IterativeRobot {

    /** 
     * Run when the robot powers on.  
     */
    public void robotInit() {
        /* Write your code here! */
    }
    
    
    /******** Init Functions ********/
    
    /** Run only when first disabled */
    public void DisabledInit() {
        /* Write your code here! */
    }
    
    /** called each time autonomous mode is entered */
    public void AutonomousInit() {
        /* Write your code here! */
    }
    
    /** called each time teleop mode is entered */
    public void TeleopInit() {
        /* Write your code here! */
    } 
    
    
    /******** Periodic Functions ********
     * These are run repeatedly while the robot is in a given mode.
     * They get run at the same rate at which the robot gets 
     * new info from the joysticks and at which it sends output
     * to the jaguars.
     * approx. 50 times per second (50 Hz)
     */
    
    public void disabledPeriodic() {
        /* Write your code here! */
    } 
    
    public void autonomousPeriodic() {
        /* Write your code here! */
    } 
    
    
    public void teleopPeriodic() {
        /* Write your code here! */
    }
       
} // end class Robot
