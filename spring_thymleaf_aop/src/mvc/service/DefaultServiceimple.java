package mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import mvc.dao.Defaultdao;
import mvc.vo.UserCommentVO;

@Component
public class DefaultServiceimple implements DefaultService{
	@Autowired
	private Defaultdao defaultdao;
	@Override
	public List<UserCommentVO> getlist() {
		List<UserCommentVO> list = defaultdao.list();
		return list;
	}
	@Override
	public void insert(UserCommentVO vo) {
		defaultdao.insert(vo);
		
	}

}
