package com.sxt.service;

import com.sxt.pojo.Studentexam;

import java.util.List;

/**
 * exams   com.sxt.service
 * 2022-07-31  16:22
 *
 * @author sxt  Administrator
 * description : 不可描述
 * @date 2022/7/31  16:22
 */

public interface StudentExamService {
    Integer addStudentExam(Studentexam studentexam);

// 根据用户id获取学生考试列表
    List<Studentexam> getstuExamList(Integer userid);

    List<Studentexam> getIsPaper(Integer userid,Integer eid);

    List<Studentexam> getAllStuScore(Integer classid);
}
