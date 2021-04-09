package p06_TirePressureMonitoringSystem;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class AlarmTest {
    @Test
    public void testSensorON(){
        Sensor sensor = Mockito.mock (Sensor.class);
        Mockito.when (sensor.popNextPressurePsiValue ()).thenReturn (16.0);
        Alarm alarm = new Alarm (sensor);
        Assert.assertFalse (alarm.getAlarmOn ());
        alarm.check ();
        Assert.assertTrue (alarm.getAlarmOn ());
    } @Test
    public void testSensorOFF(){
        Sensor sensor = Mockito.mock (Sensor.class);
        Mockito.when (sensor.popNextPressurePsiValue ()).thenReturn (18.0);
        Alarm alarm = new Alarm (sensor);
        Assert.assertFalse (alarm.getAlarmOn ());
        alarm.check ();
        Assert.assertFalse (alarm.getAlarmOn ());
    }
    @Test
    public void testSensorON1(){
        Sensor sensor = Mockito.mock (Sensor.class);
        Mockito.when (sensor.popNextPressurePsiValue ()).thenReturn (22.0);
        Alarm alarm = new Alarm (sensor);
        Assert.assertFalse (alarm.getAlarmOn ());
        alarm.check ();
        Assert.assertTrue (alarm.getAlarmOn ());
    }

}
