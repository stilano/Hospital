/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.hospital.Appointment;
import core.hospital.Team;
import core.hospital.Ward;
import java.util.ArrayList;

/**
 *
 * @author tilan
 */
public class Patient {
    private int id;
    private Team team;
    private Ward ward;
    private ArrayList<Appointment> appointments;
    private ArrayList<Doctor> doctors;
}
