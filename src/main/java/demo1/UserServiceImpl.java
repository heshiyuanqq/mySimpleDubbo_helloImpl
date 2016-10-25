package demo1;

import demo.demo1.User;
import demo.demo1.UserService;
@RpcService(UserService.class) 
public class UserServiceImpl implements UserService{

	@Override
	public void addUser(User user) {
		System.out.println("添加用户："+user.toString());
	}

	@Override
	public void deleteUser(User user) {
		System.out.println("删除用户："+user.toString());
	}

}
