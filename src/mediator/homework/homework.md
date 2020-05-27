---
title: Mediator模式课后习题
---

### 习题16-1

请修改示例程序，实现“仅当用户名与密码的长度都大于4个字符（包含4个字符）的时候，OK按钮才有效”的需求。请仔细思考究竟需要修改哪个类。

#### 答案

见包`mediator.homework`中

---

### 习题16-2

请仔细阅读示例程序中的`ColleagueButton`类、`ColleagueTextField`类和`ColleagueCheckbox`类，在他们内部都定义了`mediator`字段。而且，它们的`setMediator`方法的实现也是完全一样的。那么请问，为了简化程序，我们可以在`Colleague`接口中定义`mediator`字段和实现`setMediator`方法吗？

#### 答案

无法实现。因为在接口中是无法定义实例变量，也无法实现非抽象的具体方法的。