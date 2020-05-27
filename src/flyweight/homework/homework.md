---
title: Flyweight模式课后习题
---

### 习题20-1

请为示例程序中的BigString类增加如下构造函数。

​	`BigString(String string, boolean shared)`

当shared为true时，程序中会共享BigChar类的实例；当shared为false时，则不会共享。

#### 答案

见包`flyweight.homework.A1`中。

---

### 习题20-2

请使用习题20-1中修改后的BigString类，来比较共享BigChar类的实例时呵不共享BigChar类的实例时内存的使用量。

- 可以通过以下方法大致知道程序当前的内存使用量。为了能过够获取比较准确的内存使用量。我们会先使用gc方法进行垃圾回收后再进行计算。

  ```java
  Runtime.getRuntime().gc();
  long used = Runtime.getRuntime().totalMemory() - runtime.getRuntime();
  freeMemory();
  System.out.println("使用内存 = " + used);
  ```

#### 答案

见包`flyweight.homework.A2`中。

---

### 习题20-3

在示例程序的BigCharFactory类中，getBigChar方法是synchronized方法。如果不使用synchronized修饰符，会有什么问题呢？

#### 答案

当多个线程几乎同时调用该方法时，在判断是否已经生成实例时可能会出错，导致new出多个实例。

---

### tips

- 首先需要修改BigChar类中的txt文件的相对路径。
- 然后在运行之前，需要传入args。