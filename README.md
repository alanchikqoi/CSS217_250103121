# CSS217_250103121

# Lab 4: Adapter Pattern (Object Adapter)

## Overview
This repository contains the implementation of the Object Adapter pattern, bridging legacy hardware (`LegacyBulb`, `LegacyThermostat`) with a modern system interface (`SmartDevice` and `ModernHub`).

## AI Disclosure (AI-Assisted Development)
In accordance with the instructor's guidelines, this section outlines the extent of AI usage in this project. An AI assistant was utilized to generate the majority of the implementation, including:
1.  **Core Architecture**: Generating the complete boilerplate for `BulbAdapter.java`, `ThermostatAdapter.java`, and `Main.java` based on the provided specifications.
2.  **Mathematical Calibration**: Implementing the formula `floor((raw * 100) / 255) + K` specifically calibrated for my Student ID ($K=1$).
3.  **Fault Tolerance (Edge Cases)**: Writing the defensive logic for broken filaments (Scenario A) and corrupted dial states (Scenario B).
4.  **Refactoring**: Condensing heavily commented instructor code into clean, readable classes.

The AI provided the structural and logical heavy lifting, while I orchestrated the integration, reviewed the logic, and managed the Git workflow.