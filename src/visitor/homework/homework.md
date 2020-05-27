---
title: Visitor模式课后作业
---

### 习题13-1

请在本章的示例程序中增加一个FileFindVisitor类，用于将带有指定后缀名的文件汇集起来。FileFindVisitor类的使用方法如下所示。在本例中，它将所有后缀名为.html的文件都汇集起来了。

```java
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        try {
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi", 10000));
            bindir.add(new File("latex", 20000));

            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomura = new Directory("tomura");
            usrdir.add(yuki);
            usrdir.add(hanako);
            usrdir.add(tomura);
            yuki.add(new File("diary.html", 100));
            yuki.add(new File("Composite.java", 200));
            hanako.add(new File("memo.tex", 300));
            hanako.add(new File("index.html", 350));
            tomura.add(new File("game.doc", 400));
            tomura.add(new File("junk.mail", 500));

            FileFindVisitor ffv = new FileFindVisitor(".html");     
            rootdir.accept(ffv);                                    

            System.out.println("HTML files are:");
            Iterator it = ffv.getFoundFiles();                      
            while (it.hasNext()) {                                  
                File file = (File)it.next();                        
                System.out.println(file.toString());
            }                                                       
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
```

- 运行结果

```
HTML files are:
diary.html (100)
index.html (350)
```

#### 答案

见包`package visitor.homework.A1`中

---

### 习题13-2

在示例程序中，Directory类的getSize方法的作用是获取文件夹大小。请编写一个获取大小的SizeVisitor类，用它替换掉Directory类的getSize方法。

#### 答案

见包`package visitor.homework.A2`中

---

### 习题13-3

请基于java.util.ArrayList类编写一个具有Element接口的ElementArrayList中，而且它还可以接受（accept）ListVisitor的实例访问它。ElementArrayList类的使用方法如下：

```java
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        try {
            Directory root1 = new Directory("root1");
            root1.add(new File("diary.html", 10));
            root1.add(new File("index.html", 20));

            Directory root2 = new Directory("root2");
            root2.add(new File("diary.html", 1000));
            root2.add(new File("index.html", 2000));

            ElementArrayList list = new ElementArrayList();
            list.add(root1);
            list.add(root2);
            list.add(new File("etc.html", 1234));

            list.accept(new ListVisitor());
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
```

- 运行结果

```java
/root1 (30)						<-显示文件夹root1的相关信息
/root1/diary.html (10)
/root1/index.html (20)
/root2 (3000)					<-显示文件夹root2的相关信息
/root2/diary.html (1000)
/root2/index.html (2000)
/etc.html (1234)				<-显示文件etc.html的相关信息
```

#### 答案

见包`package visitor.homework.A3`中

---

### 习题13-4

使用final关键字定义的类是无法被继承的。例如，java.lang.String类是final类，因此我们无法像下面这样定义MyString类。

```
X 编译错误
class MyString extends String{
	···
}
```

这么看，String类似乎违背了开闭原则，但实际上这是有正当理由的。请问是什么理由呢？

#### 答案

效率原因。String类是java语言中用于处理字符串的基本类，扮演十分重要的角色。因此，Java编译器以“不能继承String类”为前提对String类的处理速度和内存消耗都做了优化。