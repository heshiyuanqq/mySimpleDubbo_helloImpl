package demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *启动服务器并发布服务: 为了加载 Spring 配置文件来发布服务，只需编写一个引导程序即可
 * @author Administrator
 *
 */
public class RpcBootstrap {
		public static void main(String[] args) {
					new ClassPathXmlApplicationContext("spring.xml");
		}
}
