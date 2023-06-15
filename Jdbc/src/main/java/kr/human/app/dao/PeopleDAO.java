package kr.human.app.dao;

import java.util.List;

import kr.human.app.vo.PeopleVO;

public interface PeopleDAO {

//	1.전체 개수 얻기
	int selectCount() throws Exception;

//	2.1개 얻기
	PeopleVO selectByIdx(int idx) throws Exception;

//	3.전체 얻기
	List<PeopleVO> selectList() throws Exception;

//	4.저장
	boolean insert(PeopleVO peopleVO) throws Exception;

//	5.수정
	boolean update(PeopleVO peopleVO) throws Exception;

//	6.삭제
	boolean delete(int idx) throws Exception;
}
