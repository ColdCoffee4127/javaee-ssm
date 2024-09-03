package service.impl;

import service.StudentService;

public class StudentServiceImpl implements StudentService {
    StudentDao stuDao;

    @Override
    public void saveStu() {
        stuDao.saveStu();
    }

    public void setStuDao(StudentDao stuDao) {
        this.stuDao = stuDao;
    }
}
