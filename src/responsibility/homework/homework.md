---
title: Chain of Responsibility模式课后习题
---

### 习题14-1

在视窗系统中经常会使用到Chain of Responsibility模式。

在视窗系统的窗口中，有按钮和文本输入框、勾选框等组件。当点击鼠标时，鼠标点击事件的处理时如何传播的呢？Chain of Responsibility模式中的net是哪个组件呢？

#### 答案

next字段中保存的多是控件父窗口。当空间自身无法处理接收到的请求时，会将请求转交给它的父窗口。

---

### 习题14-2

我们再看看另外一个在视窗系统的窗口中使用Chain of Responsibility模式的问题。

例如，当焦点移动至“字体”列表框上时，按下键盘上的上下键可以看到选择相应的字体。但是当焦点移动至“显示均衡字体”勾选框上时，如果按下上键，焦点会移动至“字体”列表框，即使按下下键，焦点也不会返回到勾选框上。请运用Chain of Responsibility模式的思考方法来说明这个问题。

#### 答案



---

### 习题14-3

在示例程序中的Support类中，support方法的可见性时public的，而resolve方法的可见性时protected的。请问设计者为什么要这样区别开来呢？

#### 答案

设计者希望Support类接收到“解决问题”的请求后，不要使用resolve方法，而是使用support方法。

---

### 习题14-4

请将示例程序中的Support类修改位不适用递归调用，而是循环。

#### 答案

见包`responsibility.homework`中