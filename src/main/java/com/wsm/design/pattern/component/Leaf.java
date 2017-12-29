package com.wsm.design.pattern.component;

/**
 * Created by wangsm on 2017/12/29.
 * 表示叶节点对象。叶子节点没有子节点。
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("Can not add to a leaf");
    }

    @Override
    public void remove(Component c) {
        System.out.println("Can not remove from a leaf");
    }

    @Override
    public void display(int depth) {
        String temp = "";
        for (int i = 0; i < depth; i++)
            temp += '-';
        System.out.println(temp + name);
    }
}
