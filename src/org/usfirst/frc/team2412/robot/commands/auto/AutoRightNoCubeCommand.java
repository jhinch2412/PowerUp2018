package org.usfirst.frc.team2412.robot.commands.auto;

import org.usfirst.frc.team2412.robot.commands.EncoderCommand;
import org.usfirst.frc.team2412.robot.commands.TurnCommand;
import org.usfirst.frc.team2412.robot.commands.WaitCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoRightNoCubeCommand extends CommandGroup {
	public AutoRightNoCubeCommand() {
		addSequential(new EncoderCommand(0.5, 200000)); //TODO check distances.
		addSequential(new WaitCommand(1));
		addSequential(new TurnCommand(90));
		addSequential(new EncoderCommand(0.5, 200000, 90));
	}
}