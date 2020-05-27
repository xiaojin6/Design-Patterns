---
title: Prototype模式课后作业
---

### 习题6-1

在示例程序中，`MessageBox`类和`UnderlinePen`类中的`createClone`方法的处理完全相同。从管理的角度来讲，在一个程序的多个地方出现相同的方法不太好，因此我们想让这两个类共用该方法，请问如何做呢？

#### 答案

- 将`Product`接口修改为`Product`类，在`Product`类中实现`createClone`方法。
- 定义一个`ConcreteProduct`类作为`UnderlinePen`类和`MessagePen`类的父类，让`ConcreteProduct`类实现`Product`接口，并实现`createClone`方法。

### 习题6-2

在`java.lang.Object`中定义了`clone`方法，那么请问`java.lang.Object`类实现了`java.lang.Cloneable`接口了嘛？

#### 答案

没有，`java.lang.Object`类并没有实现`java.lang.Cloneable`接口。