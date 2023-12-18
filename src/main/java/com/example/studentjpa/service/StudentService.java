package com.example.studentjpa.service;

import com.example.studentjpa.dao.ProvinceDao;
import com.example.studentjpa.dao.StudentDao;
import com.example.studentjpa.dao.SubjectDao;
import com.example.studentjpa.entity.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final SubjectDao subjectDao;
    private final ProvinceDao provinceDao;
    private final StudentDao studentDao;
    @Transactional
    public void createDb(){
        Province province1 = new Province();
        province1.setProvinceName("Sule");

        Province province2 = new Province();
        province2.setProvinceName("Hlaing");

        Student student1 = new Student("Mg Mg",20,"ISM", Gender.M);
        Student student2 = new Student("Aung Aung",22,"ISY", Gender.M);
        Student student3 = new Student("Su Su",21,"ISM", Gender.F);
        Student student4 = new Student("Tun Tun",25,"ISU", Gender.M);
        Student student5 = new Student("Nu Nu",20,"ISM", Gender.F);
        Student student6 = new Student("Ko Ko",26,"ISY", Gender.M);

        Subject subject1 = new Subject("Java",200,6);
        Subject subject2 = new Subject("Python",100,6);
        Subject subject3 = new Subject("Ruby",200,3);
        Subject subject4 = new Subject("Groovy",100,6);
        Subject subject5 = new Subject("Grails",200,6);
        Subject subject6 = new Subject("Angular",200,6);
        Subject subject7 = new Subject("React",200,6);




        //mapping

        province1.addStudent(student1);
        province1.addStudent(student2);
        province1.addStudent(student3);

        province2.addStudent(student4);
        province2.addStudent(student5);
        province2.addStudent(student6);

        StudentSubject studentSubject1 = new StudentSubject();
        studentSubject1.setMarks(90);
        student1.addStudentSubject(studentSubject1);
        subject1.addStudentSubject(studentSubject1);

        StudentSubject studentSubject2 = new StudentSubject();
        studentSubject2.setMarks(80);
        student1.addStudentSubject(studentSubject2);
        subject2.addStudentSubject(studentSubject2);

        StudentSubject studentSubject3 = new StudentSubject();
        studentSubject3.setMarks(95);
        student2.addStudentSubject(studentSubject3);
        subject3.addStudentSubject(studentSubject3);


        provinceDao.save(province1);
        provinceDao.save(province2);

        studentDao.save(student1);
        studentDao.save(student2);
        studentDao.save(student3);
        studentDao.save(student4);
        studentDao.save(student5);
        studentDao.save(student6);

        subjectDao.save(subject1);
        subjectDao.save(subject2);
        subjectDao.save(subject3);
        subjectDao.save(subject4);
        subjectDao.save(subject5);
        subjectDao.save(subject6);
        subjectDao.save(subject7);

    }
}
