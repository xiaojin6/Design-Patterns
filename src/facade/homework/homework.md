---
title: Facade模式课后习题
---

### 习题15-1

为了能够方便地对程序进行拓展和改善，作为设计者，我们想让`pagemaker`包外部的程序只能使用`PageMaker`类，而不能使用`Database`类和`HtmlWriter`类。那么我们应该如何修改示例程序呢？

#### 答案

将`Database`类和`HtmlWriter`类的定义中，将类的public类型去掉即可。

---

### 习题15-2

请在`PageMaker`类中增加一个`makeLinkPage`方法，使其可以根据`maildata.txt`中的用户的邮件地址制作出邮件地址超链接集合。`makeLinkPage`的调用方法如下所示。

`Main.java`

```java
import pagemaker.PageMaker;

public class Main{
	public static void main(String[] args){
		PageMaker.makeLinkPage("linkpage.html");
	}
}
```

- 运行结果

```
javac Main.java
java Main
linkpage.html is created.
```

#### 答案

具体答案见包`facade.homework`中