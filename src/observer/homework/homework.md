---
title: Observer模式课后习题
---

### 习题17-1

请编写一个继承`NumberGenerator`类，并具有数值递增功能的子类`IncrementalNumberGenerator`。它的构造函数有一下3个int型参数。

- 初始数值
- 结束数值（不包含该数值自身）
- 递增步长

接着，请编写程序让`DigitObserver`类和`GraphObserver`类观察`IncermentalNumberGenerator`类的变化。

`IncermentalNumberGenerator`类的使用方法如下所示。

```java
public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new IncrementalNumberGenerator(10, 50, 5);  
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}
```

- 运行结果（初始数值为10，结束数值为50，递增步长为5时的运行结果）

  ```
  DigitObserver:10
  GraphObserver:**********
  DigitObserver:15
  GraphObserver:***************
  DigitObserver:20
  GraphObserver:********************
  DigitObserver:25
  GraphObserver:*************************
  DigitObserver:30
  GraphObserver:******************************
  DigitObserver:35
  GraphObserver:***********************************
  DigitObserver:40
  GraphObserver:****************************************
  DigitObserver:45
  GraphObserver:*********************************************
  ```

#### 答案

见包`observer.homework.A1`中。

---

### 习题17-2

请在示例程序中增加一个新的`ConcreteObserver`角色，并修改Main类，在其中使用这个新的`ConcreteObserver`角色接受通知。

#### 答案

见包`observer.homework.A2`中。