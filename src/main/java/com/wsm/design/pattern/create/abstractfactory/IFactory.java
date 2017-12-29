package com.wsm.design.pattern.create.abstractfactory;

/**
 * @Description: 工厂接口
 * @author wangsm
 * @date 2017-12-29
 */
public interface IFactory {
	
	IProductA createProductA();
	
	IProductB createProductB();
	
}
