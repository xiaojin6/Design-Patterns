---
title: Adapter模式课后作业
---

### 习题2-1

在示例程序中生成`PrintBanner`类的实例时，我们采用了如下方法，即使用`Print`类型的变量来保存`PrintBanner`实例。

​		`Print p = new PrintBanner("Hello");`

请问我们为什么不像下面这样使用`PrintBanner`类型的变量来保存`PrintBanner`的实例呢？

​		`PrintBanner p = new PrintBanner("Hello");`

#### 答案

在程序中，`PrintBanner`是`Print`的子类，将子类放在父类中，并不会影响子类的类型，但是又可以表明，我们需要使用的是`Print`类及其子类，而不是使用`PrintBanner`类及其子类。

这样可以极大的增加程序的可读性。

---

### 习题2-2

#### 答案

具体答案见包`Adapter.homework`中