package edu.icet.service.impl;

import edu.icet.dto.Student;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service // Get support for Autowired 6
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository repository;

    @Override // TO make Override method
    public List<Student> getStudent(){
        return repository.findAll();
    }

    @Override
    public void addStudent(@RequestBody Student student) {
        repository.save(student);
    }

    @Override
    public void deleteStudentById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void updateStudent(Student student) {
        repository.save(student);
    }

    @Override
    public List<Student> findByName(String name) {
        return repository.findByName(name);
    }
}
