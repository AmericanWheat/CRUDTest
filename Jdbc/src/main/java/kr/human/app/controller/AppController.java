package kr.human.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kr.human.app.service.PeopleService;
import kr.human.app.vo.PeopleVO;

@Controller("appController")
public class AppController {

	@Autowired
	private PeopleService peopleService;

//	1.전체 개수 얻기
	public int selectCount() {
		return peopleService.selectCount();
	}

//	2.1개 얻기
	public PeopleVO selectByIdx(int idx) {
		return peopleService.selectByIdx(idx);
	}

//	3.전체 얻기
	public List<PeopleVO> selectList() {
		return peopleService.selectList();
	}

//	4.저장
	public boolean insert(PeopleVO peopleVO) {
		return peopleService.insert(peopleVO);
	}

//	5.수정
	public boolean update(PeopleVO peopleVO) {
		return peopleService.update(peopleVO);
	}

//	6.삭제
	public boolean delete(PeopleVO peopleVO) {
		return peopleService.delete(peopleVO);
	}
}
