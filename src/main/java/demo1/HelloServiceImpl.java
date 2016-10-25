package demo1;

import demo.demo1.HelloService;

/**指定远程接口：使用RpcService注解定义在服务接口的实现类上，
 * 需要对该实现类指定远程接口，因为实现类可能会实现多个接口，
 * 一定要告诉框架哪个才是远程接口。
 * @author Administrator
 *
 */
@RpcService(HelloService.class) 
public class HelloServiceImpl implements HelloService{

	public String hello(String name) {
		return "hello! "+name;
	}

}
