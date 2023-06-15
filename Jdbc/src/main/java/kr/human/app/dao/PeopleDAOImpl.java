package kr.human.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.human.app.vo.PeopleVO;

@Repository("peopleDAO")
@SuppressWarnings("deprecation")
public class PeopleDAOImpl implements PeopleDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int selectCount() throws Exception {
		return jdbcTemplate.queryForObject("select count(*) from people", null, int.class);
	}

	@Override
	public PeopleVO selectByIdx(int idx) throws Exception {
		return jdbcTemplate.queryForObject("select * from people where idx=?", new Object[] {idx} , new PeopleVOMapper());
	}

	@Override
	public List<PeopleVO> selectList() throws Exception {
		return jdbcTemplate.query("select * from people", new PeopleVOMapper() );
	}

	@Override
	public boolean insert(PeopleVO peopleVO) throws Exception {
		return jdbcTemplate.update("insert into people values(peo_idx_seq.nextval,?,? )",peopleVO.getName(), peopleVO.getAge())>0;
	}

	@Override
	public boolean update(PeopleVO peopleVO) throws Exception {
		return jdbcTemplate.update("update people set name=? , age=? where idx= ?" , peopleVO.getName(), peopleVO.getAge(), peopleVO.getIdx())>0;
	}

	@Override
	public boolean delete(int idx) throws Exception {
		return jdbcTemplate.update("delete from people where idx =?", idx)>0;
	}

}
