package kr.human.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import kr.human.app.dao.PeopleDAO;
import kr.human.app.vo.PeopleVO;

@Service("peopleService")
public class PeopleServiceImpl implements PeopleService {

	@Autowired
	private PeopleDAO peopleDAO;

	@Override
	public int selectCount() {
		int count = 0;
		try {
			count = peopleDAO.selectCount();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public PeopleVO selectByIdx(int idx) {
		PeopleVO peopleVO = null;
		try {
			peopleVO = peopleDAO.selectByIdx(idx);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return peopleVO;
	}

	@Override
	public List<PeopleVO> selectList() {
		List<PeopleVO> list = null;
		try {
			list = peopleDAO.selectList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean insert(PeopleVO peopleVO) {
		boolean result = false;
		try {
			result = peopleDAO.insert(peopleVO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean update(PeopleVO peopleVO) {
		boolean result = false;
		try {
			result = peopleDAO.update(peopleVO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean delete(PeopleVO peopleVO) {
		boolean result = false;
		try {
			result = peopleDAO.delete(peopleVO.getIdx());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return result;
	}

}
