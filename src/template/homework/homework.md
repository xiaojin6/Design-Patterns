---
title: Template Method模式课后作业
---

### 习题3-1

#### 答案

子类中需要实现的方法是`java.io.InputStream`的不带参数的`read()`方法。`read()`方法会被`java.io.InputStream`的模板方法`read(byte[] b, int off, int len)`循环调用。

所以，程序中是子类负责实现具体的“读取1字节”的处理，而在`java.io.InputStream`中只定义了“将指定数量的字节读取到数组中的指定位置”这个模板方法。

---

### 习题3-2

#### 答案

表示在子类中无法重写`display`方法

---

### 习题3-3

#### 答案

可以将`AbstractDisplay`类中的`open`，`print`，`close`方法声明为`protected`。这样就可以让其子类调用这些方法，而其他包中的类无法调用这些方法。

---

### 习题3-4

#### 答案

因为`TemplateMethod`模式中的`AbstractClass`角色必须实现处理的流程。在抽象类中可以实现一部分方法，但是在接口中无法实现方法。所以在该模式中，无法用接口替代抽象类。