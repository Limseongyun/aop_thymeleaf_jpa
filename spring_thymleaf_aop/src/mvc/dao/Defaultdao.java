package mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mvc.vo.UserCommentVO;

@Repository
public class Defaultdao {
	@Autowired
	private SqlSessionTemplate ss;
	
	public List<UserCommentVO> list(){
		return ss.selectList("test.list");
	}
	public void insert(UserCommentVO vo) {
		ss.insert("test.insert", vo);
	}
}
