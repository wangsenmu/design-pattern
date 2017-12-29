package com.wsm.design.pattern.create.factorymethod;

/**
 * @Description: 工厂接口
 * @author wangsm
 * @date 2017-12-29
 */
public interface IFactory {
	
	/**
	 * 创建产品
	 * @return
	 */
	IProduct createProduct();
	
}
