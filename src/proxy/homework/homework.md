---
title: Proxy模式课后习题
---

### 习题21-1

在示例程序中，PrinterProxy类知道Printer类。即在PrinterProxy类中显示地写明了Printer类的类名。

请修改PrinterProxy类，让其不必知道Printer类。

- 有许多不同的实现方法。这里请大家试着将RealSubject角色的类名作为字符串传递给PrinterProxy类的构造函数。

#### 答案

见包`proxy.homework`中

---

#### 习题21-2

在示例程序中，PrinterProxy类的setPrinterName方法和realize方法都是synchronized方法。如果不使用这个方法会有什么问题呢？请举例说明。

#### 答案

如果没有使用，当多个线程分别调用setPrinterName方法和realize方法时，可能会导致PrinterProxy类的name与Printer类的name不同。