package demo1.reflect;

import java.lang.reflect.Method;

import net.sf.cglib.reflect.FastClass;
import net.sf.cglib.reflect.FastMethod;

public class Test {
	
	
		public static void main(String[] args) throws Exception {
					long t1 = System.currentTimeMillis();
					for(int i=0;i<10000;i++){
						/*Person p = new Person();
						p.setName("脏三");
						p.setAge(23);
						p.sayHello();*///传统方法调用:200毫秒左右
						
					/*	Class<?> p_class = Class.forName("demo1.reflect.Person");
						Person p = (Person) p_class.newInstance();
						Method m_setName  = p_class.getMethod("setName", String.class);
						Method m_setAge  = p_class.getMethod("setAge", int.class);
						Method m_sayHello = p_class.getMethod("sayHello");
						m_setAge.invoke(p, 23);
						m_setName.invoke(p, "脏三");
						m_sayHello.invoke(p);*///java自带反射：250毫秒左右
						
						/*
						Class<?> p_class = Class.forName("demo1.reflect.Person");
						FastClass fastClass = FastClass.create(p_class);
						Person p = (Person) fastClass.newInstance();
						FastMethod m_setAge = fastClass.getMethod("setAge",new Class[]{int.class});
						FastMethod m_setName = fastClass.getMethod("setName",new Class[]{String.class});
						FastMethod m_sayHello = fastClass.getMethod("sayHello",null);
						m_setAge.invoke(p, new Integer[]{23});
						m_setName.invoke(p, new String[]{"脏三"});
						m_sayHello.invoke(p,null);*///cglib高效反射FastClass：400毫秒左右
					}
					long t2 = System.currentTimeMillis();
					System.out.println("用时"+(t2-t1)+"毫秒");
		}
}	
