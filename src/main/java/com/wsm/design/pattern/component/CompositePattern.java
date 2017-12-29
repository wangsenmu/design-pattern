package com.wsm.design.pattern.component;

/**
 * Created by wangsm on 2017/12/29.
 * 1、想要表示对象的部分-整体层次结构。
 * 2、想要客户端忽略组合对象与单个对象的差异，客户端将统一地使用组合结构中的所有对象。
 *  关于分级数据结构的一个普遍性的例子是你每次使用电脑时所遇到的:文件系统。
 *  文件系统由目录和文件组成。每个目录都可以装内容。目录的内容可以是文件，也 可以是目录。
 *  按照这种方式，计算机的文件系统就是以递归结构来组织的。如果你想要描述这样的数据结构，那么你可以使用组合模式。
 *
 *  组合模式定义由 Leaf 对象和 Composite 对象组成的类结构；
 *  它使得客户端变得简单；
 *  它使得添加或删除子部件变得很容易。
 */
public class CompositePattern {

    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite compX = new Composite("Composite X");
        compX.add(new Leaf("Leaf XA"));
        compX.add(new Leaf("Leaf XB"));
        root.add(compX);

        Composite compXY = new Composite("Composite XY");
        compXY.add(new Leaf("Leaf XYA"));
        compXY.add(new Leaf("Leaf XYB"));
        compX.add(compXY);

        root.display(1);


    }
}
