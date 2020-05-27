---
title: Strategy模式课后作业
---

### 习题10-1

请编写一个随机出手势的RandomStrategy类。

#### 答案

见包`strategy.homework.A1`中

---

### 习题10-2

在本章的示例程序中，Hand类的fight方法负责判断平局。在进行判断时，它使用的表达式不是`this.handValue == h.value`，而是`this == h`，请问为什么可以这么写？

#### 答案

因为本来Hand类的实例就只有3个，如果两个实例中的handvalue字段的值相等，那么也就意味着他们是相同的实例。

---

### 习题10-3

某位开发人员在编写WinningStrategy类时，won字段的定义不是`private boolen won = false;`，而是写成了如下这样。

​	`private boolen won;`

但是，从运行结果来看，却与加上“= false”时是完全一样的。请问这是为什么呢？

#### 答案

在Java中，没有被显示地初始化地字段会被自动初始化。boolean类型的字段会被初始化为false；数值类型的字段会被初始化为0；引用类型的字段会被初始化为null；

---

### 习题10-4

下面的代码清单定义了用于排序的类和接口。这里使用的排序算法是选择排序。请编写一个表示其他算法的类，并让它实现Sorter接口。

`Sorter.java`

```java
import java.lang.Comparable;

public interfacce Sorter{
	public abstract void sort(Comparable[] data);
}
```

`SelectionSorter.java`

```java
public class SelectionSorter implements Sorter{
	public void sort(Comparable[] data){
		for(int i = 0; i < data.length - 1;i++){
			int min = i;
			for(int j = i + 1;j < data.length; j++){
				if(data[min].compareTo(data[j]) > 0){
					min = j;
				}
			}
			Comparable passingplace = data[min];
			data[min] = data[i];
			data[i] = passingplace;
		}
	}
}
```

`SortAndPrint.java`

```java
public class SortAndPrint{
	Comparablep[] data;
	Sorter sorterl;
	public SortAndPrint(Comparable[] data, Sorter sorter){
		this.data = data;
		this.sorter = sorter;
	}
	public void execute(){
		print();
		sorter.sort(data);
		print();
	}
	public void print(){
		for(int i = 0; i < data.length; i++){
			System.out.print(data[i] + ", ");
		}
		System.out.println("");
	}
}
```

`Main.java`

```java
public class Main{
	public static void main(String[] args){
		String[] data={
			"Dumpty", "Bowman", "Carroll", "Elfland", "Alice",
		};
		SortAndPrint sap = new SortAndPrint(data, new SelectionSorter());
		sap.execute();
	}
}
```

- 运行结果

```
Dumpty, Bowman, Carroll, Elfland, Alice,			<-排序前
Alice, Bowman, Carroll, Dumpty, Elfland,			<-排序后
```

#### 答案

见包`strategy.homework.A4`中