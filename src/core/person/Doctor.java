/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.hospital.Appointment;
import core.hospital.Team;
import java.util.ArrayList;

/**
 *
 * @author tilan
 */
public abstract class Doctor {
    protected int id;
    protected Team team;
    protected ArrayList<Appointment> appointments;
    protected ArrayList<Patient> patients;
}
