package src.exercises.exercise_66;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Scheduling {

    List<Appointment> appointments = new ArrayList<>();

    public void addAppointment(Appointment appointment) throws Exception {
        if (this.validateDate(appointment)) {
            throw new Exception("ALREADY APPOINTMENT AT THIS DATE");
        }
        appointments.add(appointment);
        System.out.println(appointment);
    }

    public void cancelAppointment(Appointment appointment) throws Exception {
        if (!this.validateDate(appointment)) {
            throw new Exception("THERE IS NO APPOINTMENT AT THIS DATE");
        }
        appointments.remove(appointment);
    }

    public Boolean validateDate(Appointment appointment) {
        return appointments.contains(appointment);
    }

    public String getAllAppointments() {
        return Arrays.toString(this.appointments.toArray());
    }
}
