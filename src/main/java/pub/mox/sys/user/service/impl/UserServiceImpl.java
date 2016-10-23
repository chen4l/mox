package pub.mox.sys.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pub.mox.sys.user.dao.UserMapper;
import pub.mox.sys.user.pojo.User;
import pub.mox.sys.user.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userMapper;
	
	public User getUserById(int userId) {
		return userMapper.selectByPrimaryKey(userId);
	}
	
	
}
