---
title: Singleton模式课后作业
---

### 习题5-1

在 下面的`TicketMaker`类中，每次调用`getNextTicketNumber`方法都会返回1000，1001，1002……的数列。我们可以用它生成票的编号或是其他序列号。在现在该类的实现方法下，我们可以生成多个该类的实例。请修改代码，运用`Singleton`模式，确保之恶能生成一个该类的实例。

```java
public class TicketMaker{
	private int tikect =  1000;
	public int getNextTicketNumer(){
		teturn ticket++;
	}
}
```

#### 答案

具体答案在包`singleton.homework.A1`中

### 习题5-2

请编写`Triple`类，实现最多只能生成3个`Triple`类的实例，实例编号分别为0，1，2且可以通过`getInstance(int id)`来获取该编号对应的实例。

#### 答案

具体答案在包`singleton.homework.A2`中

### 习题5-3

某位开发人员编写了如下的`Singleton`类，但者并非严格的`Singleton`模式，请问是为什么呢?

```java
public class Singleton{
	private static Singleton singleton = null;
	private Singleton(){
		System.out.println("生成了一个实例。");
	}
	public static Singleton getInstance(){
		if(singleton == null){
			singleton = new Singleton();
		}
		return singleton;
	}
}
```

#### 答案

将`getInstance`类的声明中增加`synchronized`字段即可。当时间片恰好用完的时候，可能导致出现问题。

具体解决方法可参考包`singleton.homework.A3_1`和`singleton.homework.A3_2`

