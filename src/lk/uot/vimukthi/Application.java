package lk.uot.vimukthi;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application{
    public static void main(String[] args) {

        /*List<String> students=new ArrayList<>();

        students.add("Ashan");
        students.add("Kasun");
        students.add("Nipun");
        students.add("Chamath");
        students.add("Ashen");
        students.add("Dinith");
        System.out.println(students);

        List<String> filteredata=students.stream()
                .filter(s->s.length()>5)
                .collect(Collectors.toList());
        System.out.println(filteredata);

         */
        List<sensors> Sensors= new ArrayList<>();
        sensors sensor1 = new sensors( "Living room", 28);
        Sensors.add(sensor1);
        sensors sensor2 = new sensors( "Office room", 26);
        Sensors.add(sensor2);
        sensors sensor3 = new sensors( "Bed room", 29);
        Sensors.add(sensor3);
        sensors sensor4 = new sensors( "Kitchen room", 30);
        Sensors.add(sensor4);
        sensors sensor5 = new sensors( "Bath room", 28);
        Sensors.add(sensor5);

List<sensors> hotSensors=Sensors.stream()
        .filter(Sensor -> Sensor.getValue()>28)
        .collect(Collectors.toList());

        System.out.println(hotSensors);
    }
}

