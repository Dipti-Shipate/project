package com.app.service;

import java.util.List;

import com.app.entity.modal.Appointment;
import com.app.entity.modal.DoctorTimeTable;

public interface AppointmentServiceIntf {
	
	//cancel appointment
	String cancelAppointment(Long userId, Long appointmentId);

	//get list of all current appointments of particular patient
	List<Appointment> getAllPatientCurrentAppoitments(Long patientId);
	
	//get list of appointment history of patient
	List<Appointment> getAllPatientAppoitmentsHistory(Long patientId);

	//get list of all current appointments for doctor
	List<Appointment> getAllCurrentAppoitmentsForDoctor(Long doctorId);
	
	//get appointment history of patient for doctor
	List<Appointment> getPatientAppoitmentsHistoryForDoctor(Long doctorId, Long patientId);
	
	//get list of all appointment history for doctor
	List<Appointment> getAllAppoitmentsHistoryForDoctor(Long doctorId);

	//generate time table for doctor [doctor's time table pojo]
	DoctorTimeTable generateTimeTableForDoctor(DoctorTimeTable timeTable);
}
