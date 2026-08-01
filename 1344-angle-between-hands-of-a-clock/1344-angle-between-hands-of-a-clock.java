class Solution {
    public double angleClock(int hour, int minutes) {
        double min=minutes * 6;                 // 360 / 60 = 6 degrees  &&  360 / 12 = 30 degrees
        double hr=(hour *  30) + (minutes * 0.5);                      //30 / 60 = 0.5 degrees effect of min on hour

        double diff = Math.abs(hr - min);

        return Math.min(diff,360-diff);
    }
}