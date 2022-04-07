package com.jforce.tr.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.jforce.tr.modal.Student;
import com.jforce.tr.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> getList() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentByIdStudent(Integer id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public void deleteStudentByIdStudent(Integer id) {
		studentRepository.deleteById(id);
	}

	public void addStudentByIdStudent(Student student) {
		studentRepository.save(student);
	}

	public void updateStudentByIdStudent(Student student) {
		studentRepository.save(student);
	}

	@Override
	public void updateStudentById(Integer id, String Name) {
		Student tempstudent = studentRepository.findById(id).get();
		tempstudent.setFirstName(Name);
		studentRepository.save(tempstudent);
	}
}
