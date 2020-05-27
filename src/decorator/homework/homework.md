---
title: Decorator模式课后作业
---

### 习题12-1

请在本章的示例程序中增加一个UpDownBorder类，用于为字符串装饰上下两条边框。UpDownBorder类的使用方法如下所示。

```java
public class Main{
	public static void main(String[] args){
		Display b1 = new StringDisplay("Hello, world.");
		Display b2 = new UpDownBorder(b1, '-');
		Display b3 = new SideBorder(b2, '*');
		b1.show();
		b2.show();
		b3.show();
		Display b4 =
					new FullBorder(
						new UpDownBorder(
							new SideBorder(
								new UpDownBorder(
									new SideBorder(
										new StringDisplay("你好，世界。"),
										'*'
									),
									'='
								),
								'|'
							),
							'/'
						),
					);
			b4.show();			
	}
}
```

- 运行结果

```java
Hello, world.					<-b1.show()的显示结果
-------------					<-b2.show()的显示结果
Hello, world.
-------------
*-------------*					<-b3.show()的显示结果
*Hello, world.*
*-------------*
+----------------+				<-b4.show()的显示结果
|////////////////|
||==============||
||* 你好，世界。 *||
||==============||
|////////////////|
+----------------+
```

#### 答案

见包`decorator.homework.A1`中

---

### 习题12-2

请为示例程序编写一个可以显示多行字符出啊MultiStringDisplay类，它在Decorator模式中扮演ConcreteComponent角色。MultiStringDisplay类的使用方法如下所示。

```java
public class Main{
	public static void main(String[] args){
		MultiStringDisplay md = new MultiStringDisplay();
		md.add("早上好。");
		md.add("下午好。");
		md.add("晚安，明天见。");
		md.show();
		
		Display d1 = new SideBorder(ma, '#');
		d1.show();
		
		Display d2 = new FullBorder(md);
		d2.show();
	}
}
```

- 运行结果

```java
早上好。								<-md.show()的显示结果
下午好。
晚安，明天见。
# 早上好。          #					<-md.show()的显示结果
# 下午好。          #
# 晚安，明天见。     #
+------------------+				   <-md.show()的显示结果		
| 早上好。          |
| 下午好。          |
| 晚安，明天见。     |
+------------------+
```

#### 答案

见包`decorator.homework.A2`中

