// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6224.PowerUp2;

import org.usfirst.frc6224.PowerUp2.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc6224.PowerUp2.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Joystick drive;
    public JoystickButton btnClawOpen;
    public JoystickButton btnClawClose;
    public JoystickButton btnElevatorUp;
    public JoystickButton btnElevatorDown;
    public Joystick assist;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        assist = new Joystick(1);
        
        btnElevatorDown = new JoystickButton(assist, 8);
        btnElevatorDown.whileHeld(new ElevatorDown());
        btnElevatorUp = new JoystickButton(assist, 7);
        btnElevatorUp.whileHeld(new ElevatorUp());
        btnClawClose = new JoystickButton(assist, 2);
        btnClawClose.whenPressed(new ClawClose());
        btnClawOpen = new JoystickButton(assist, 1);
        btnClawOpen.whenPressed(new ClawOpen());
        drive = new Joystick(0);
        


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("DriveWithJoystick", new DriveWithJoystick());
        SmartDashboard.putData("ElevatorUp", new ElevatorUp());
        SmartDashboard.putData("ElevatorDown", new ElevatorDown());
        SmartDashboard.putData("ClawOpen", new ClawOpen());
        SmartDashboard.putData("ClawClose", new ClawClose());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getDrive() {
        return drive;
    }

    public Joystick getAssist() {
        return assist;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

