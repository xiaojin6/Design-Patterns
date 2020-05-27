---
title: Factory Method模式课后作业
---

### 习题4-1

在示例程序中，`IDCard`类的构造函数并不是public，请问这是想表达什么意思呢？

#### 答案

这是因为想让`idcard`包外的类无法new出`IDCard`类的实例。这样就可以使外部必须通过`IDCardFactory`来生成`IDCard`的实例。

---

###  习题4-2

请修改示例程序，为`IDCard`类添加卡的编号，并在`IDCardFactory`类中保存编号与所有者之间的对应表。

#### 答案

具体答案见包`factory.homework`中

---

### 习题4-3

为了强调调用方向Product类的子类的构造函数中传入“产品名字”作为参数，我们采用了如下的定义方式。但是在编译代码时却出现了编译错误，请问这是为什么呢？

```java
public abstract class Product{
	public abstract Product(Stirng name);
	public abstract void use();
}
```

#### 答案

因为Java中无法定义abstract的构造函数。

