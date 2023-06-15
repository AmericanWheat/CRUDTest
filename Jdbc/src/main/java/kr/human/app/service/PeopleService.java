package kr.human.app.service;

import java.util.List;

import kr.human.app.vo.PeopleVO;

public interface PeopleService {
	
//	1.전체 개수 얻기
	int selectCount();
//	2.1개 얻기
	PeopleVO selectByIdx(int idx);
//	3.전체 얻기
	List<PeopleVO> selectList();
//	4.저장
	boolean insert(PeopleVO peopleVO);
//	5.수정
	boolean update(PeopleVO peopleVO);
//	6.삭제
	boolean delete(PeopleVO peopleVO);
}
