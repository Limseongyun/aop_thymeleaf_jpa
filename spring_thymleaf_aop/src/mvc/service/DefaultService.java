package mvc.service;

import java.util.List;

import mvc.vo.UserCommentVO;

public interface DefaultService {

	public List<UserCommentVO> getlist();
	public void insert(UserCommentVO vo);
}
