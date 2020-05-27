---
title: Abstract Factory模式课后作业
---

### 习题8-1

`Tray`类中的`tray`字段是`protected`，子类也可以访问。请指出如果将其修改为`private`，会有哪些优点和缺点。

 #### 答案

设置为`private`

优点是`Tray`的子类不会依赖于`tray`字段的实现。

缺点是必须重新编写一些方法，让外部可以访问自身。

---

### 习题8-2

请在示例程序的Factory类中定义一个“生成只含有雅虎网站(http://www.yahu.com)超链接的HTML页面的具象方法”。

`public Page createYahooPage();`

请把页面的作业和标题都设置为"Yahoo！"。这时，具体工厂类和具体零件类又需要如何修改呢？

#### 答案

见`abstractFactory.homework`包内。

---

### 习题8-3

`ListLink`类的构造函数如下所示

```java
public ListLink(String caption, String url){
	super(caption, url);
}
```

也就是说，它只调用了父类的构造函数。如果不需要其他处理，为什么还要特意定义`ListLink`类的构造函数呢？

#### 答案

因为Java中无法继承构造函数

---

### 习题8-4

`Page`类的处理与`Tray`类的处理相似，为什么没有让`Page`类继承`Tray`类呢？

#### 答案

因为无法向`Tray`中添加`Page`（不符合HTML规范）。如果将`Page`类定义为`Tray`类的子类，那么`Page`也就变成了`Item`类的子类，导致其可以被添加到`Tray`中。

如果定义一个Java接口`HTMLable`，在其中声明一个`makeHTML`方法，然后让`Item`类和`Page`类都实现这个接口，则更加简洁。

```java
public interface HTMLable(){
	public abstract String makeHTML();
}
```

