package com.wsm.design.pattern.create.factorymethod;
/**
 * @Description: 玩具工厂
 * @author wangsm
 * @date 2017-12-29
 */
public class ToyFactory implements IFactory {

	public IProduct createProduct() {
		return new Toy();
	}

}
