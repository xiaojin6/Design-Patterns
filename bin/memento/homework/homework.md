---
title: Memento模式课后习题
---

### 习题18-1

Caretaker角色只能通过窄接口（API）来操作Memento角色。如果Caretaker角色可以随意的操作Memento角色，会出现什么问题呢？

#### 答案

会导致Caretaker角色失去与Originator角色和Memento角色之间的独立性。

---

### 习题18-2

在示例程序中，游戏的状态仅由所持金钱呵水果这两个项目来决定。如果在必须保存大量信息才能保存对象的状态时，为了能够保存Memento的实例，需要花费大量的内存空间或者时磁盘空间。请思考一下有没有好的解决办法。

#### 答案

如果计算一下与上次保存的Memento之间的差值，可能就可以以较少的内存空间保存数据。

---

### 习题18-3

假设在Memento类中加入了一个新的字段。

​	`int number;`

限制我们需要加上如下可见性，应该怎么做呢？

- Memento类可以获取和改变number的值
- Gamer类可以获取number的值，但是不能改变它
- Main类既不能获取也不能改变number的值

#### 答案

可以将number设置为private，然后使用get方法获取。

---

### 习题18-4

使用序列化功能可以将Memento类的实例保存为文件。请修改示例程序以实现下列功能。

- 在应用程序启动时，如果发现不存在game.dat文件时，所持金钱数目为100开始游戏
- 当所持金钱大量增加后，将Memento类的实例保存为文件game.dat
- 在应用程序启动时，如果发现game.dat文件已经存在，则以未见中所保存的状态开始游戏

在修改示例程序时，可以参考一下提示信息。

- 要保存的Memento类需要实现`java.io.Serializable`接口
- 在保存对象状态时，需要调用`ObjectOutputStream`的`writeObject`方法
- 在恢复对象状态时，需要调用`ObjectInputStream`的`readObject`方法
- 详细信息请参考Java的API文档中以上相关内容。

#### 答案

见包`memento.homework`中