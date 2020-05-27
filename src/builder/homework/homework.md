---
title: Builder模式课后作业
---

### 习题7-1

请将示例程序中的`Builder`类修改位接口并相应地修改其他类。

#### 答案

需要修改三个地方。

- `Builder`类

```java
public abstract class Builder
//修改为
public interface Builder
```

- `TextBuilder`类

```java
public class TextBuilder extends Builder
//修改为
public class TextBuilder implements Builder
```

- `HTMLBuilder`类

```java
public class HTMLBuilder extends Builder
//修改为
public class HTMLBuilder implements Builder
```

---

### 习题7-2

在示例程序中的`HTMLBuilder`类中，需要首先调用`makeTitle`方法，但是在`TextBuilder`类中，则对方法调用的顺序没有要求。

请修改`Builder`类，`TextBuilder`类和`HTMLBuilder`类，确保“在调用`makeString`方法，`makeItems`方法和`close`方法之前必须且只能调用一次`makeTitle`方法”。

#### 答案

见`builder.homework.A2`包中

---

### 习题7-3

请为示例程序中的`Builder`类编写一个子类，让其扮演`ConcreteBuilder`的角色，实现也可以编写纯文本文档、HTML文件意外的任意一种文档的功能。

#### 答案

见`builder.homework.A3`包中

---

### 习题7-4

在示例程序中的`TextBuilder`类中，编写的文档被保存在了`buffer`字段中，但`buffer`字段并未是`String`类型的，而是`StringBuffer`类型的，请问是为什么呢？如果使用了`String`类型会有什么问题呢？

#### 答案

可以使用`String`类型的变量作为参数，然后将`append`修改为+=即可。如果这样的话，效率较低，会产生额外的开销。

具体的实现方法可以见`builder.homework.A4`。