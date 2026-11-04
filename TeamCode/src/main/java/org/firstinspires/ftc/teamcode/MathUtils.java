package org.firstinspires.ftc.teamcode;

public final class MathUtils {
    public static double clamp(double VAL, double MIN, double MAX) {
        return Math.min(MAX, Math.max(VAL, MIN));
    }
}
