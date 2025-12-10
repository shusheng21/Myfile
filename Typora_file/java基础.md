# java基础

```java
xxxxxxxxxx package com.shusheng.mytest;
public class test01 {    private int a; // 私有成员变量a    
                       public static String b = "Hello"; // 公有静态成员变量b
                       public static void main(String[] args) {        test01 obj = new test01(); // 创建对象
                                                                        obj.a = 10; // 访问成员变量a，并设置其值为10
                                                                        System.out.println("a = " + obj.a);
                                                                        test01.b = "World"; // 通过类名访问成员变量b，并设置其值为"World"
                                                                        System.out.println("b = " + test01.b);    }
                    }java
```

变量在同一作用域下不可以重名，在不同的class里可以定义同名的变量

成员变量可以通过对象访问，如果是静态成员变量（有static修饰），那么也可以通过类访问

```java
```



# 第一章 Java概述

## 1、java重要特点

- java语言是面向对象的（oop）
- java语言是健壮的。Java 的强类型机制、异常处理、垃圾的自动收集等是 Java 程序健壮性的重要保证
- Java 语言是**跨平台性的**。[即: 一个编译好的.class 文件可以在多个系统下运行，这种特性称为跨平台]
- Java 语言是解释型的

![image-20230511150842977](./java%E5%9F%BA%E7%A1%80.assets/image-20230511150842977.png)

## 2、什么是 JDK，JRE

- ### **JDK 基本介绍** 

  - JDK 的全称(Java Development Kit    Java 开发工具包)
  - JDK = JRE + java 的开发工具 [java, javac,javadoc,javap 等] 

- ### **JRE 基本介绍**

  - JRE(Java Runtime Environment  Java 运行环境) 

  - JRE = JVM + Java 的核心类库[类]

  - 包括 Java 虚拟机(JVM Java Virtual Machine)和 Java 程序所需的核心类库等，如果想要运行一个开发好的 Java 程序， 

    计算机中只需要安装 JRE 即可。

- ### **JDK、JRE 和 JVM 的包含关系** 

  - **JDK = JRE +** **开发工具集**（例如 Javac,java 编译工具等) 
  - JRE = JVM + Java SE**标准类库**（java 核心类库） 
  - 如果只想运行开发好的 .class 文件 只需要 JRE 



## 3、java快速入门

### 运行步骤/注意事项

1. 编写Hello.java文件 => 编译 **javac** Hello.java => 生成Hello.class => 运行**java** Hello => 输入结果

2. 一个源文件中**最多只能有一个 public 类**。其它类的个数不限。编译后，每一个类，都对于一个.class 。也可以将 main 方法写在非 public 类中。然后指定运行非public类，这样入口方法就是非public的main方法。也就是说，public 类和其他非public类中都可以同时放main方法

   ![image-20230511154038426](./java%E5%9F%BA%E7%A1%80.assets/image-20230511154038426.png)

3. 一个源文件中**最多只能有一个 public 类**，并且源文件命名必须按照该类命名。

### java转义字符

​	在控制台，输入 tab 键，可以实现命令补全 		

​	\t ：一个制表位，实现对齐的功能 

​	\n ：换行符 

​	\\\ ：一个\ 

​	\\" :一个" 

​	\\' ：一个' 

​	\r :一个回车 System.out.println("韩顺平教育\r 北京"); => 北京平教育

### 注释

```java
单行注释：
    //注释文字
多行注释
    /*注释
    文字*/
文档注释
/**
	* @author 小美
	* @version 1.0
*/
```

  ![image-20250815154844224](D:\APP_data\Typora文档\assets\image-20250815154844224.png)

### 相对路径和绝对路径

相对路径：从当前目录开始定位，形成的一个路径
绝对路径：从顶级目录d,开始定位，形成的路径 

![image-20250815160010721](D:\APP_data\Typora文档\assets\image-20250815160010721.png)

###  Java编写的7个规范

![image-20250815161756712](D:\APP_data\Typora文档\assets\image-20250815161756712.png)

### 容易犯的错误

![image-20250815161941651](D:\APP_data\Typora文档\assets\image-20250815161941651.png)



# 第二章变量

## 1、基本概念

![image-20230511154952043](./java%E5%9F%BA%E7%A1%80.assets/image-20230511154952043.png)

1. 加号 + 的使用
   1. 左右两边数值型则做加法
   2. 左右两边又一方是字符串，则作拼接运算

### Java 数据类型（重点）背！！

![image-20230511155442442](./java%E5%9F%BA%E7%A1%80.assets/image-20230511155442442.png)

1. **声明long型常量须在后面加“l”或“L”;**

2. bit是计算机中最小存储单位，byte是计算机中的基本存储单元，1byte = 8bit；

3. 浮点数 double、float
   1. 关于浮点数在机器中存放形式的简单说明,**浮点数=符号位+指数位+尾数位** 
   
   2. 尾数部分可能丢失，造成精度损失(小数都是近似值)。
   
   3. java浮点数类型默认值均为double形
   
   4. **Java的浮点型常量默认是double类型申明float类型常量，须后加“f”或“F”**
   
   5. ```java
      float n1 = 1.1;  //错误
      float n2 = 1.1F; //正确
      double n3 = 1.1  //正确
      ```
   
      
   
   6. 申明double类型常量，可以不加直接写如2.50；也可以后加“d”或“D”
   
   7. **通常情况均使用double类型，比float精度更高**
   
   8. **浮点数陷阱**   15/2结果为整数 15.0/2以及15/2.0结果为小数
   
   ```java
   double n1 = 2.7;
   double n2 = 8.1 / 3; //桉树学理论计算n2 = 2.7,实际计算机计算n2 = 2.699999999...;
   if(n1 == n2 ){
       System.out.println("n1和n2相等")//该方法比较大小不行
   if(Math.sbs(n1-n2)<0.00001){
       System.out.println("n1和n2相等")
   }  
   }
       
   ```
   
   
   
4. char 单引号‘ ’   String 双引号“ ”

### 基本数据类型转换（重点）

1. #### 自动类型转换

![image-20230511161140514](./java%E5%9F%BA%E7%A1%80.assets/image-20230511161140514.png)

![image-20230511161331068](./java%E5%9F%BA%E7%A1%80.assets/image-20230511161331068.png)

1. 强制类型转换，可能造成精度丢失，溢出

2. String 类型转换

   1. 基本类型转String类：**基本类型的值+“ ”**

   2. String类型转换为基本数据类型：通过基本数据类型的包装类调用parseXX方法

      ```java
      int n = 100;
      String st = n + " ";//100由整形转变为String
      
      int a = Integer.parseInt("123");
      double a1 = Double.parseDouble("123.1");
      float a2 = Float.parseFloat("12.3");
      ...
      ```

​			3.**把字符串String转成字符** **char**  含义是把字符串的第一个字符转成char

```java
        String ss = "abcd";
        char cc = ss.charAt(0);//'a'
        char cc1 = ss.charAt(1);//'b'
        System.out.println(cc);
        System.out.println(cc1);
```



### Boolean类型

只有True、False两个值，不可以为Null。

使用细节：不可用0或者非0的整数替代false和true，这点和C语言不同

#  第三章 运算符

### 关系运算符

![image-20250819162016592](D:\APP_data\Typora文档\assets\image-20250819162016592.png)

### 逻辑运算符

![image-20250819162550462](D:\APP_data\Typora文档\assets\image-20250819162550462.png)

![image-20250819162657938](D:\APP_data\Typora文档\assets\image-20250819162657938.png)

![image-20250819163631016](D:\APP_data\Typora文档\assets\image-20250819163631016.png)

![image-20250819163653659](D:\APP_data\Typora文档\assets\image-20250819163653659.png)

 ![image-20250819164446436](D:\APP_data\Typora文档\assets\image-20250819164446436.png)

![image-20250819164458764](D:\APP_data\Typora文档\assets\image-20250819164458764.png)

### 赋值运算符

![image-20250819171839215](D:\APP_data\Typora文档\assets\image-20250819171839215.png)

![image-20250819171742975](D:\APP_data\Typora文档\assets\image-20250819171742975.png)

```java
//复合赋值运算符回进行类型转化
byte a = 2;
a += 3;  //等价 a = (byte)(a + 3);
System.out.println(a); //5
a++;  ////等价 a = (byte)(a + 1);
System.out.println(a); //6
```

### 三元表达式

![image-20250819173617114](D:\APP_data\Typora文档\assets\image-20250819173617114.png)

```java
//三元运算符
//条件表达式 ？表达式1 : 表达式2
int a = 10;
int b = 99;
int result = a < b ? a++ : b--;
System.out.println("result= " + result);//a<b为真，只执行表达式1，a赋值给result->a++   10
System.out.println("a= " + a);//11
System.out.println("b= " + b);//a<b为真，只执行表达式1,不执行表达式2，  b = 99
```

### 运算符优先级

![image-20250820085507962](D:\APP_data\Typora文档\assets\image-20250820085507962.png)



## 标识符命名规则

标识符概念  ArithmeticOperator

1. Java对各种变量、方法和类等命名时使用的字符序列称为标识符
2. 凡是自己可以起名字的地方都叫标识符int num1 = 90;

标识符的命名规则(必须遵守)

​	1．由26个英文字母大小写，0-9，或$组成

​	2.数字不可以开头。int 3ab = 1;//错误

​	3.不可以使用关键字和保留字，但能包含关键字和保留字。

	4. Java中严格区分大小写，长度无限制。int totalNum = 10; int n = 90;
	4. 标识符不能包含空格。int a b = 90;

![image-20250820090154000](D:\APP_data\Typora文档\assets\image-20250820090154000.png)







## 键盘输入语句

```java
//Input键盘输入
import java.util.Scanner;//导入Scanner所在的包
public class Input{
	public static void main(String []args){
		Scanner myScanner = new Scanner(System.in);//创建Scanner对象
		System.out.println("请输入姓名");
		String name = myScanner.next();  //.next()接受String
        
        System.out.println("请输入性别");
		char gender = myScanner.next().charAt(0);  //.next().charAt(0)接受char
        
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();   //.nextInt()接收int
		System.out.println("请输入薪水");
		double sal = myScanner.nextDouble();  //.nextDouble()接收double
		System.out.println("姓名：" + name + " 年龄：" + age + " 薪水" + sal);
	} 
}


```

## 进制

### 进制种类

对于整数，有四种表示方式： 

二进制：0,1 ，满 2 进 1.以 0b 或 0B 开头。 

十进制：0-9 ，满 10 进 1。 

八进制：0-7 ，满 8 进 1. 以数字 0 开头表示。 

十六进制：0-9 及 A(10)-F(15)，满 16 进 1. 以 **0x** **或** **0X** 开头表示。此处的 A-F 不区分大小写。

### 进制装换

第一组： 二进制/八进制/十六进制  转  十进制 

​	规则:从最低位(右边)开始，将每个位上的数提取出来，乘以2（8、16）的(位数-1)次方，然后求和。

第二组： 十进制 转  二进制/八进制/十六进制  

​	规则:将该数不断除以2（8、16），直到商为0为止，然后将每步得到的余数倒过来，就是对应的二进制/八进制/十六进制  。

第三组   二进制  转  八进制 /十六进制

​	规则:从低位开始,将二进制数**每三位**（每四位）一组，转成对应的**八进制**（十六进制）数即可。

第四组   八进制 /十六进制  转 二进制

​	规则:将八进制数每1位，转成对应的一个3位的二进制数即可。

​	规则:将十六进制数每1位，转成对应的4位的一个二进制数即可。

### 原码、反码、补码(重点难点) （背下来）

- 二进制的最高位是符号位:**0表示正数,1表示负数**(老韩口诀:0->0  1->-)
- **正数**的原码，反码，补码都一样(**三码合一**)
- 负数的反码=它的原码符号位不变，其它位取反**(0->1,1->0**)
- 负数的补码=它的反码+1，负数的反码=负数的补码-1
- 0的反码，补码都是0
- java没有无符号数，换言之，java中的数都是有符号的
- 在计算机运算的时候，都是以**补码的方式来运算**的.
- 当我们**看运算结果**的时候,要看他的**原码**(重点)

### 位运算

![image-20250820111952426](D:\APP_data\Typora文档\assets\image-20250820111952426.png)

![image-20250820114729765](D:\APP_data\Typora文档\assets\image-20250820114729765.png)

![image-20250820114619646](D:\APP_data\Typora文档\assets\image-20250820114619646.png)

![image-20250820114555774](D:\APP_data\Typora文档\assets\image-20250820114555774.png)

![image-20250820172920947](D:\APP_data\Typora文档\assets\image-20250820172920947.png)

 

# 第四章 程序控制结构

## 顺序控制

## 分支控制 

```java
  //单分支
  if (条件表达式){
      需要执行的语句，如果只有一条执行语句则可以不用括号，建议都写上括号
  }
  //双分支
  if(age > 18){
  			System.out.println("年龄超过18");
  		}
  		else{
  			System.out.println("年龄没有超过18");
  		}
  //多分支
  if(条件表达式1){ 
  			代码块1...
  		}
  		else if(条件表达式2){
  			代码块2...
  		}
  		else if(条件表达式3){
  			代码块3...
  		}
  		.....
          else{
              代码块n...
          }
  //注意：只要找到一个执行入口，则多分支就不会执行其余部分；
  //多分支可以没有else,此时如果前面的条件都不符合，则就什么也不执行
  
  //嵌套分支 最好不超过3层，可读性不好
  
  //switch分支结构
  swith(表达式){
      case 常量1：
          代码块1...
      break;//如果此处没有break，会直接执行代码块2 不需要判断case2
      case 常量2：
          代码块2...
      break;
       .....
      case 常量n：
          代码块n...
      break;
      default:
      	default语句块;
      break;     
  }
  //注意：表达式对应一个值
  //break：退出switch 而不是退出整个程序
  //1．表达式数据类型，应和case后的常量类型一致，或者是可以自动转成可以相互比较的
  类型，比如输入的是字符，而常量是int
  2. switch(表达式)中表达式的返回值必须是:(byte,short,int,char,enum[枚举].String)
  
```


## 循环语句 

### for循环

```java
for(循环变量初始化;循环条件;循环变量迭代){
	循环操作;
}
```

1.循环条件是返回一个布尔值的表达式

2.**for( ; 循环判断条件 ; )**中的**初始化和变量迭代**可以写到其它地方，但是两边的分号不能省略。
3.循环初始值可以有多条初始化语句，但要求类型一样，并且中间用逗号隔开，循环变量迭代也可以有多条变量迭代
语句，中间用逗号隔开。

学习方法：**化繁为简，先死后活**

### while循环

```java
循环变量初始化;
while(循环条件){
    循环体（语句）;
    循环迭代变量;
}
```

1.循环条件是返回一个布尔值的表达式

2.while循环是先判断再执行语句

### do while 循环

```java
循环变量初始化；
do{
     循环体（语句）;
     循环迭代变量;
}while(循环条件);

//先执行在判断，至少会执行一次
//最后有个分号;
```

### 多重循环控制（重难点）

1. 将一个循环放在另一个循环体内，就形成了嵌套循环。其中，for ,while ,do…while 均可以作为外层循环和内层循环。 
2. 实质上，嵌套循环就是把内层循环当成外层循环的循环体。当只有内层循环的循环条件为 false 时，才会完全跳出内 层循环，才可结束外层的当次循环，开始下一次的循环
3. 设外层循环次数为 m 次，内层为 n 次，则内层循环体实际上需要执行 m*n 次

### 跳转控制语句

- **break**
  - ​	**break** **语句用于终止某个语句块的执行**，一般使用在 switch 或者循环[for , while , do-while]中

- **跳转控制语句-continue** 
  - ​	**continue** **语句用于结束本次循环**，**继续执行下一次循环**
  
  - ​	continue 语句出现在多层嵌套的循环语句体中时，可以通过标签指明要跳过的是哪一层循环 , 这个和前面的标签的使用的规则一样
  
- **跳转控制语句-return**
  - return 使用在方法，表示跳出所在的方法，return 写在 main 方法，退出程序xxx.java

# 第五章数组、排序和查找

## **介绍**

数组可以存放多个同一类型的数据。数组也是一种数据类型，是引用类型。 

## 数组的使用

### 数组的定义

#### 一维数组 ：

数组类型 数组名 [ ] = new 数组类型 [ 大小]；

 数组的引用：数组名【下标/index/索引】

```java
//申明数组
int a[]; or int[] a;
//创建数组
a = new int[10];

int[]a = new int[10];
```

#### 数组使用注意事项和细节 

- 数组是多个相同类型数据的组合，实现对这些数据的统一管理
- 数组中的元素可以是任何数据类型，包括基本类型和引用类型，但是不能混用。
- 数组创建后，如果没有赋值，有默认值 int 0，short 0, byte 0, long 0, float 0.0,double 0.0，char \u0000，boolean false，String null
- 数组的**下标是从** **0** **开始的**。
- 数组属引用类型，数组型数据是对象(object)

#### 数组赋值机制

- 基本数据类型赋值，这个值就是具体的数据，而且相互不影响。 int n1 = 2; int n2 = n1;

- 数组在默认情况下是引用传递，赋的值是地址

- ```java
  int[] arr1 = {1,2,3};
  int arr2 = arr1;//这里arr1和arr2是指向同一个地方
  arr2[0] = 10;	
  //则arr1和arr2都变为{10,2,3}
  ```

- 数组拷贝

  - ```java
    //将 int[] arr1 = {10,20,30}; 拷贝到 arr2 数组, 要求数据空间是独立的.
    public class ArrayCopy {
        public static void main(String[] args){
            int[] arr1 = {10,20,30};
            int[] arr2 = new int[arr1.length];
            for(int i = 0; i < arr1.length; i++){ 
                arr2[i] = arr1[i]; 
            }
        }   
    }
    ```
  
- 数组反转

  - ```java
    //要求：把数组的元素内容反转。arr {11,22,33,44,55,66} 变为 {66, 55,44,33,22,11}
    //方式一：找规律，每次交换对应的下标 是 arr[i] 和 arr[arr.length - 1 -i]  一共交换arr.length / 2次
    int[]arry = {11, 22, 33, 44, 55, 66};
    int temp = 0;
    int len = arry.length;
    for(int i = 0;i < len / 2;i ++){
        temp = arry[i];
        arry[i] = arry[len - 1 - i];
        arry[len - 1 - i] = temp;
    }
    for(int i;i < len; i ++){
        System.out.print(arry[i]+" ");
    }
    
    //方式二：使用逆序赋值方式
    int[] arr = {11, 22, 33, 44, 55, 66};
    int[] arr2 = new int[arr.length];
    for(int i = arr.length - 1, j = 0; i >= 0; i--, j++) { 
        arr2[j] = arr[i]; 
    }
    arr = arr2;
    //让 arr 指向 arr2 数据空间, 此时 arr 原来的数据空间就没有变量引用,会被当做垃圾，销毁
    ```

- 数组添加/扩容

  - ```java
    Scanner myScanner = new Scanner(System.in);
            int[]arry = {1,2,3};
            int pand;
            do{
                System.out.println("请输入你要添加的元素");
                int[] newarry = new int[arry.length + 1];
                for(int i = 0; i < arry.length; i ++){
                    newarry[i] = arry[i];
                }
                newarry[newarry.length - 1] = myScanner.nextInt();
                arry = newarry;
                for(int i = 0; i < arry.length; i ++){
                    System.out.print(arry[i]+ " ");
                }
                System.out.println("添加成功，是否继续 y/n");
                 pand = myScanner.next().charAt(0);
            }while(pand == 'y');
    ```


#### 排序

- 内部排序：指将需要处理的所有数据都加载到内部存储器中进行排序。包括(交换式排序法、选择 式排序法和插入式排序法)；
- 外部排序法：数据量过大，无法全部加载到内存中，需要借助外部存储进行排序。包括(合并排序法和直接合并排序法)。

##### 冒泡排序法

基本思想：通过对待排序序列从后向前（从下标较大的元素开始），依次比较相邻元素的值，若发现逆序则交换，使值较大的元素逐渐从前移向后部，就象水底下的气泡一样逐渐向上冒。

![image-20230517100849446](./java%E5%9F%BA%E7%A1%80.assets/image-20230517100849446.png)

```java
int arry[] = {24, 69, 80, 57, 13};
		int temp = 0;
		for(int i = 0; i < arry.length-1; i++){  //5个数一共需要比较4轮
			for(int j = 0; j < arry.length - 1 - i;j ++){//第一轮比较4次，第二轮3次，..
				if(arry[j] > arry[j+1]){  //arry[j] > arry[j+1]为升序，arry[j] < arry[j+1]为降序
					temp = arry[j];
					arry [j] = arry [j + 1];
					arry [j + 1] = temp;
				}
			}
		}
		for(int k = 0; k < arry.length; k++){
			System.out.print(arry[k] + "\t");d
		}
```

#### 二维数组：

```java
//定义：类型[][] 数组名=new 类型[大小][大小]
int a[][] = new int[2][3];
int [][]a = new int[2][3];
a.length表示有多少个一维数组，（多少行）
a[i].length表示第i+1行数组长度
    
//注意：数组的申明方式处理 int a[][] int [][]a
```

# 第六章 面向对象编程（基础）

## 类与对象区别和联系

- 类就是数据类型，对象就是一个具体实例。
- 类是抽象的，概念的，代表一类事物,比如人类,猫类.., 即它是数据类型
- 对象是具体的，实际的，代表一个具体事物, 即 是实例
- 类是对象的模板，对象是类的一个个体，对应一个实例 

### 对象在内存中的存在形式（重要）

![image-20230519160920251](./java%E5%9F%BA%E7%A1%80.assets/image-20230519160920251.png)

### 属性/成员变量/字段

- **从概念或叫法上看： 成员变量 = 属性 = field(字段)**

  - 即 成员变量是用来表示属性的
  - 属性是类的一个组成部分，一般是基本数据类型,也可是引用类型(对象，数组)

- 属性的定义语法同变量，示例：访问修饰符 属性类型 属性名;

  - 有四种访问修饰符 public, proctected, 默认, private

  - 属性的定义类型可以为任意类型，包含基本类型或引用类型

  - 属性如果不赋值，有默认值，规则和数组一致。具体为: 

  - ```java
    int 0  short 0  byte 0  long 0   float 0.0   double 0.0 
    
    char \u0000， boolean false，String null
    ```

### 如何创建对象

- 先声明再创建

  - ```
    Cat cat ; //声明对象
    cat cat = new Cat(); //创建
    ```

- 直接创建

  - ```
    cat = new Cat();
    ```

### 如何访问属性

- 基本语法

  - ```
    对象名.属性名;
    eg:
    cat.name ; 
    cat.age; 
    ```

### 类和对象的内存分配机制(重要)

![image-20230519162347945](./java%E5%9F%BA%E7%A1%80.assets/image-20230519162347945.png)

![image-20230519162400050](./java%E5%9F%BA%E7%A1%80.assets/image-20230519162400050.png)

#### Java 内存的结构分析

1. 栈： 一般存放基本数据类型(局部变量) 
2. 堆： 存放对象(Cat cat , 数组等)
3. 方法区：常量池(常量，比如字符串)， 类加载信息

#### Java 创建对象的流程简单分析

```java
Person p = new Person(); 
p.name = “jack”;
p.age = 10;

1) 先加载 Person 类信息(属性和方法信息, 只会加载一次) 
2) 在堆中分配空间, 进行默认初始化(看规则) 
3) 把地址赋给 p , p 就指向对象
4) 进行指定初始化， 比如 p.name =”jack” p.age = 10
```

## 成员方法

#### 成员方法的定义

```java
访问修饰符 返回数据类型 方法名（形参列表..） {//
	方法体 语句；
    return 返回值; 
}
//return 语句不是必须的
```

```java
//成员方法定义在类里面
public class Method01{
    public static void main(String[] args) {
        //方法使用 
        //1. 方法写好后，如果不去调用(使用)，不会输出 
        //2. 先创建对象 ,然后调用方法即可
        Person p1 = new Person();
        p1.outputage();
    }
}

class Person{
    String name;
    int age;
    //定义一个成员方法，输出年龄
    //一个方法的定义：  访问修饰符 返回数据类型 方法名（形参列表）{。。。}
    public void outputage(){
        System.out.println(age);
    }
}
```



### 方法的调用机制原理：(重要!-示意图!!!)

![image-20230519163850210](./java%E5%9F%BA%E7%A1%80.assets/image-20230519163850210.png)

### 成员方法的好处

- 提高代码的复用性
- 可以将实现的细节封装起来，然后供其他用户来调用即可 

### 注意事项

调用带参数的方法时，一定对应着参数列表传入相同类型或兼容类型的参数；

实参和形参的类型要一致或兼容、个数、顺序必须一致；

成员方法不能嵌套定义；

```java
class AA { 
//细节: 方法不能嵌套定义
	public void f4() {
    //错误 
    // public void f5() {
    
    	}    
	}
}
```

一个方法最多有一个返回值，可以使用数组返回

```java
public int[] getSumAndSub(int n1,int n2){
	int[]res = new int[2];
	res[0] = n1 + n2;
	res[1] = n1 - n2;
	return res;
}
```

返回类型可以为任意类型，包含基本类型或引用类型(数组，对象)

如果方法要求有返回数据类型，则方法体中最后的执行语句必须为 return 值; 而且要求返回值类型必须和 return 的值类型一致或兼容 .

方法定义时的参数成为形式参数（形参），方法调用时的传入参数成为实际参数（实参）

### 方法调用细节

- 同一个类中的方法调用:直接调用即可。

```java
public class test{
	pbulic Static void main(String[] args){
        
	}
}

class A(){
	public void myprint(int n){
		System.out.println(n);
	}
	
	public void sayOK(){
		myprint(10);//同一个类直接调用 print
	}

}
```

跨类中的方法 A 类调用 B 类方法：需要先在A类中创建B对象，再通过对象名调用

### 成员方法传参机制(重要) 

- **基本数据类型的传参机制**
  - **基本数据类型，传递的是值(值拷贝)，形参的任何改变不影响实参!**

- **引用数据类型的传参机制**
  - **引用类型传递的是地址（传递也是值，但值是地址），可以通过形参影响实参!**

### 方法递归调用

1．执行一个方法时，就创建一个新的受保护的独立空间(栈空间)

2.方法的局部变量是独立的，不会相互影响,比如n变量
3．如果方法中使用的是引用类型变量(比如数组，对象),就会共享该引用类型的数据
4.递归必须向退出递归的条件逼近，否则就是无限递归,出现StackOverflowError，死龟了:)
5.当一个方法执行完毕，或者遇到return，就会返回，遵守谁调用，就将结果返回给谁,同时当方法执行完毕或者返回时，该方法也就执行完毕。

### 方法重载(OverLoad)

- #### 基本介绍

  - java 中允许同一个类中，多个同名方法的存在，但要求 形参列表不一致！(类型不一致、数量不一致、或者都不一致)  返回类型无要求，可以不同；

重载的好处：减轻了起名、记名的麻烦

```java
public void calculate(int n1, int n2) { 
    
} 
public int calculate(double a1, double a2) { 
    
}
```

### 可变参数

```java
基本概念：java允许将同一个类中多个同名同功能但参数个数不同的方法，封装成一个方法。 就可以通过可变参数实现
   
基本语法：
    访问修饰符 返回类型 方法名(数据类型... 形参名) { }

public int sum(int... nums) { 
    //System.out.println("接收的参数个数=" + nums.length); 
    int res = 0;
    for(int i = 0; i < nums.length; i++) { 
        res += nums[i];
    }
    return res; 
}

//1. int... 表示接受的是可变参数，类型是 int ,即可以接收多个 int(0-多)
//2. 使用可变参数时，可以当做数组来使用 即 nums 可以当做数组
//3. 遍历 nums 求和即可
//4.可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后
//5.一个形参列表中只能出现一个可变参数

```

### 作用域（重要）

1.在java编程中，主要的变量就是**属性(成员变量)和局部变量**。
2.我们说的**局部变量**一般是指在**成员方法中定义的变量**。局部变量没有默认值，所以局部变量被声明后，必须经过初始化，才可以使用。

3.java中作用域的分类
全局变量:也就是属性，作用域为整个类体Cat类。
局部变量:也就是除了属性之外的其他变量，作用域为定义它的代码块中!

4.**全局变量(属性)可以不赋值**，直接使用，因为有默认值，**局部变量必须赋值后**，**才能使用**，因为没有默认值。

5.属性和局部变量可以重名,访问时遵循就近原则。

6．在同一个作用域中，比如在同一个成员方法中，两个局部变量，不能重名。[举例]

7．属性生命周期较长，伴随着对象的创建而创建，伴随着对象的销毁而销毁。局部变量，生命周期较短，伴随着它的代码块的执行而创建，伴随着代码块的结束而销毁。即在一次方法调用过程中。

- 作用域范围不同
  - 全局变量/属性:可以被本类使用，或其他类使用(通过对象调用)
  - 局部变量:只能在本类中对应的方法中使用
- 修饰符不同
  - 全局变量/属性可以加修饰符
  - 局部变量不可以加修饰符

### 构造方法/构造器

#### 基本语法

```java
[修饰符] 方法名(形参列表){ 
方法体; 
}

注意：构造器修饰符可以是 默认、public、protected、private
    构造器没有返回值
    方法名必须和类名一样
    没有返回值
    在创建对象时，系统会自动的调用该类的构造器完成对象的初始化。
    
    public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.age + " " + person.name);
        Person person1 = new Person("marry" , 566);
        System.out.println(person1.age + " " + person1.name);
    }
}

class Person{
    String name;
    int age;
    public Person(){
        this("zhangsan",99);
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
}

```

### 对象创建的流程分析

![image-20230520111305320](./java%E5%9F%BA%E7%A1%80.assets/image-20230520111305320.png)

### this关键字

```java
class Person{
    String name;
    int age;
    public Person(){
        this("zhangsan",99);
    }
    public Person(String name,int age){
        this.name = name;  //this.name指的是Person中的属性name
        this.age = age;
    }
}

//this 关键字可以用来访问本类的属性、方法、构造器
//this 用于区分当前类的属性和局部变量
//访问成员方法的语法：this.方法名(参数列表);
//访问构造器语法：this(参数列表); 注意只能在构造器中使用(即只能在构造器中访问另外一个构造器, 必须放在第一 条语句)
//this 不能在类定义的外部使用，只能在类定义的方法中使用。
```

**this小结：哪个对象调用，this就代表哪个对象**

```java
class T{
    //访问成员方法的语法：this.方法名(参数列表);
    public void f1(){
        System.out.println("f1()method");
    }
    public void f2(){
        //方式1：直接调用
        f1();
        //方式2：this
        this.f1();
        //二者区别，在继承里讲
    }
```











# 第七章 面向对象编程（中级）

**IDE(集成开发环境)：主要有IDEA和Eclipse**

- **IDEA快捷方式**
  - **ctrl + D 删除当前当前行**
  - **ctrl + alt + 向下光标 复制当前行**
  - **ctrl + /  添加/取消注释**
  - **alt + /  补全代码**
  - **ctrl + alt + L 格式化**
  - **alt + R 运行**
  - ctrl + B 查看源码
  - alt + enter 导入改行需要配置的类
  - alt + 小键盘0  生成构造器等
  - ctrl + H  查看类的层级关系（学习继承后有用）
  - ctrl+ B  将光标放在一个方法上，输入 ctrl+B，可以定位到方法「学继承后，非常有用]
  - 自动的分配变量名,通过在后面加.var  如：new Person().var 再回车即可
  
- **模板**/**自定义模板**
  - file->settings -> deitor -> Live templates
  - 常用：main、sout  fori

## 包package

- ### 作用

  - 区分相同名字的类
  - 方便管理类2
  - 控制访问范围

- ### 基本语法

  - ```
    package com.hspdeu;
    //package 关键字，表示打包
    //com.hspdeu:表示包名
    ```

- ### **包的本质**

  - 创建不同的文件夹/目录来保存类文件

- ### 包的命名

  -  只能包含数字、字母、下划线、小圆点..但不能用数字开头，不能是关键字或保留字
  - 一般是小写字母+小圆点
  - 例如com.公司名.项目名.业务模块名

- ### 包的导入

  - ```
    import java.util.Scanner;//只导入Scanner类
    import java.util.*;//导入java.util下所有的
    
    //一般使用那个就导入哪个，不建议全部导入
    ```

- ### 注意事项

  - package 的作用是声明当前类所在的包，需要放在类的最上面，一个类中最多只有一句package
  - import指令位置放在package的下面，在类定义前面,可以有多句且没有顺序要求。

## 访问修饰符

| 访问级别 | 访问修饰符 | 同类 | 同包 | 子类 | 不同包 |
| :------: | :--------: | :--: | :--: | :--: | :----: |
|   公开   |   public   |  可  |  可  |  可  |   可   |
|  受保护  | protected  |  可  |  可  |  可  |  不可  |
|   默认   | 没有修饰符 |  可  |  可  | 不可 |  不可  |
|   私有   |  private   |  可  | 不可 | 不可 |  不可  |

- **注意**
  - 修饰符可以用来修饰类中的属性，成员方法以及类
  - 只有默认的和public才能修饰类!，并且遵循上述访问权限的特点
  - 成员方法的访问规则和属性完全一样

## 面向对象编程的三大特征

- ### **封装、继承和多态**

### 封装

- 把抽象出来的属性和方法封装在一起，数据被保护在内部，程序的其他部分只能通过被授权的方法才能对数据进行操作。

**封装的理解和好处**

- 隐藏实现细节
- 对数据进行验证，保证安全合理

**封装的实现步骤 (三步)**

- 将属性进行私有化private
- 提供一个公共的（public）set方法，对属性判断并赋值
- 提供一个公共的（public）get方法，获取属性的值

```java
public class test {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("zhangsan");
        p1.setAge(59);
        p1.setSalary(50000);
        p1.myprint();
        
        Person raw = new Person("rawraw让位", 2222, 25000);
        System.out.println(raw.getName());
        System.out.println(raw.getAge());
        System.out.println(raw.getSalary());
    }
}
class Person{
    public String name;
    private int age;
    private double salary;

        public Person(String name, int age, double salary) {
        //通过这样的构造方法，输入的就不可以判断是否符合要求
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        //可以在构造方法里直接放set方法
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() > 1 && name.length() < 6){
            this.name = name;
        }
        else {
            System.out.println("name error");
            this.name = "xiaoming";
        }
    }

    //public int getAge() {
        //return age;
    //}
    //===================获取年龄需要输入密码才可以，保证数据安全=======
    public int getAge() {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("please input password");
        int mm = myscanner.nextInt();
        if(mm == 1972){
            return age;
        }
        else {
            System.out.println("password error,please try again");
            return -1;
        }
    }

    public void setAge(int age) {
        if(age > 1 && age < 120)
            this.age = age;
        else {
            System.out.println("age error");
            this.age = 18;
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void myprint(){
        System.out.println("name: " + this.getName() + " age: " +
                this.getAge() + " salary " + this.getSalary());
    }
}
```

### 继承-extends

**基本介绍**

- 继承可以解决代码复用,让我们的编程更加靠近人类思维.当多个类存在相同的属性(变量)和方法时,可以从这些类中抽象出父类,在父类中定义这些相同的属性和方法，所有的子类不需要重新定义这些属性和方法，只需要通过extends来声明继承父类即可。

- ![image-20230520171209292](./java%E5%9F%BA%E7%A1%80.assets/image-20230520171209292.png)

- 基本语法

  - ```java
    class 子类 extends 父类{
        
    }
    子类就会自动拥有父类定义的属性和方法
    父类又叫超类，基类。
    子类又叫派生类。
    ```

- 继承给编程带来的便利
  - 提高代码复用性
  - 代码扩展性和维护性提高了

#### 注意细节

- 子类**继承了所有的属性和方法**，非私有的属性和方法可以在子类直接访问, 但是私有属性和方法不能在子类直接访问，**要通过父类提供公共的方法去访问** 

  - ```
    
    ```


- 子类必须调用父类的构造器， 完成父类的初始化 

- 当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器，如果父类没有提供无 参构造器，则必须在子类的构造器中用 super 去指定使用父类的哪个构造器完成对父类的初始化工作，否则，编译不会通过

- 如果希望指定去调用父类的某个构造器，则显式的调用一下 : super(参数列表) 

-  super 在使用时，必须放在构造器第一行(super 只能在构造器中使用)

- super() 和 this() 都只能放在构造器第一行，因此这两个方法不能共存在一个构造器

- java 所有类都是 Object 类的子类, Object 是所有类的基类. 

- 父类构造器的调用不限于直接父类！将一直往上追溯直到 Object 类(顶级父类) 

- 子类最多只能继承一个父类(指直接继承)，即 java 中是单继承机制。 

  思考：如何让 A 类继承 B 类和 C 类？ 【答案：A 继承 B， B 继承 C】 

#### 继承的本质分析

![image-20230526115613534](./java%E5%9F%BA%E7%A1%80.assets/image-20230526115613534.png)

当子类创建好后，建立查找关系；

//（1）首先看子类是否有该属性 

//(2) 如果子类有这个属性，并且可以访问，则返回信息 

//(3) 如果子类没有这个属性，就看父类有没有这个属性(如果父类有该属性，并且可以访问，就返回信息..) 

//(4) 如果父类没有就按照(3)的规则，继续找上级父类，直到 Object...

#### super关键字

- super 代表父类的引用，用于**访问父类的属性、方法、构造**器 
- 访问父类的属性，当不能访问父类的private属性----super.属性名
- 访问父类的方法，当不能访问父类的private方法----super.方法名（参数列表）
- 访问父类的构造器，super（参数列表），只能放在构造器中的第一句

```java
class A{
    String name;
    public void cal(){
        System.out.println("A类的cal（）方法...");
    }
}

class B extends A{
    int age;
    public void sum(){
        System.out.println("B类的sum（）方法...");
        cal();
        this.cal();
        //找 cal 方法时(cal() 和 this.cal()等价)，顺序是: 
        // (1)先找本类，如果有，则调用 
        // (2)如果没有，则找父类(如果有，并可以调用，则调用) 
        // (3)如果父类没有，则继续找父类的父类,整个规则，就是一样的,直到 Object 类 
        // 提示：如果查找方法的过程中，找到了，但是不能访问， 则报错, cannot access 
        // 如果查找方法的过程中，没有找到，则提示方法不存在 
        super.cal();//跳过本类，直接查找父类，其他的规则一样
        
        //访问父类属性也同上面一样
         System.out.println(name);
         System.out.println(this.name);
        
         System.out.println(super.name);
    }
}

super 的访问不限于直接父类，如果爷爷类和本类中有同名的成员，也可以使用 super 去访问爷爷类的成员;如果多个基类(上级类)中都有同名的成员，使用 super 访问遵循就近原则。
```

![image-20230526203954594](./java%E5%9F%BA%E7%A1%80.assets/image-20230526203954594.png)

#### 方法重写/覆盖（override）

方法重写就是 子类有一个方法和父类的某个方法名称、返回类型、参数一样，则说子类的这个方法重写（覆盖）了父类的方法

- **注意细节** 方法重写需要满足下面的条件

  - 子类的参数列表，方法名称，要和父类方法的形参列表，方法名称完全一样

  - 子类方法的返回类型和父类的返回类型一样，或者是父类返回类型的子类

    - ```java
      //父类如下
      public Object getinfo(){}
      //子类如下
      public String getinfo(){}
      
      //因为String 是 Object的子类
      ```

  - 子类方法不能缩小父类方法的访问权限 

    - 访问权限：public > protected > 默认 > private

      ```java
      //父类
      protected void sayok(){
      
      }
      //子类
      public void sayok(){
      
      }//可以
      void sayok(){
      
      }//不可以
      ```

      ![image-20230526210641329](./java%E5%9F%BA%E7%A1%80.assets/image-20230526210641329.png)

### 多态

#### 基本介绍

- 方法或对象具有多种形态。是面向对象的第三大特征，多态是建立在封装和继承基础之上的

#### **多态的具体体现** 

- （1）方法的多态

  - 重写和重载就体现多态

- （2）**对象的多态**（核心，重点，难点）

  - 一个对象的编译类型和运行类型可以不一致

  - 编译类型在定义对象时就确定了，不能改变，运行类型可以变化

  - 编译类型看定义时 =号 的左边，运行类型看=号 的右边；

  - ```
    Animal animal = new Dog();//animal编译类型是Animal，运行类型是Dog
    animal = new Cat();//animal运行类型变为Cat，animal编译类型是Animal
    ```

#### **多态的注意事项和细节**

多态的前提是：两个对象（类）存在继承关系 

多态的向上转型：

- 本质：父类的引用指向子类的对象
- 语法：父类类型 引用名 = new 子类类型（）；
- 特点：编译类型看左边，运行类型看右边。
- 可以调用父类中的所有成员（需遵守访问权限）**不能调用子类的特有成员；**
- 最终运行效果看子类的具体实现

多态的向下转型

- 语法：子类类型 引用名 =（子类类型）父类引用;
- 只能强转父类的引用，不能强转父类的对象
- 要求父类的引用必须指向的是当前目标类型的对象
- 向下转型后，**可以调用子类类型中所有的成员**

```java
package com.hspedu.poly_.detail_;
public class PolyDetail {
    public static void main(String[] args) {

        //向上转型: 父类的引用指向了子类的对象
        //语法：父类类型 引用名 = new 子类类型();
        Animal animal = new Cat();
        Object obj = new Cat();//可以吗? 可以 Object 也是 Cat的父类

        //向上转型调用方法的规则如下:
        //(1)可以调用父类中的所有成员(需遵守访问权限)
        //(2)但是不能调用子类的特有的成员
        //(#)因为在编译阶段，能调用哪些成员,是由编译类型来决定的
        //animal.catchMouse();错误
        //(4)最终运行效果看子类(运行类型)的具体实现, 即调用方法时，按照从子类(运行类型)开始查找方法
        //，然后调用，规则我前面我们讲的方法调用规则一致。
        animal.eat();//猫吃鱼..
        animal.run();//跑
        animal.show();//hello,你好
        animal.sleep();//睡

        //老师希望，可以调用Cat的 catchMouse方法
        //多态的向下转型
        //(1)语法：子类类型 引用名 =（子类类型）父类引用;
        //问一个问题? cat 的编译类型 Cat,运行类型是 Cat
        Cat cat = (Cat) animal;
        cat.catchMouse();//猫抓老鼠
        //(2)要求父类的引用必须指向的是当前目标类型的对象，
        Dog dog = (Dog) animal; //可以吗？--不可以，因为

        System.out.println("ok~~");
    }
}
//===========================
package com.hspedu.poly_.detail_;
public class Animal {
    String name = "动物";
    int age = 10;
    public void sleep(){
        System.out.println("睡");
    }
    public void run(){
        System.out.println("跑");
    }
    public void eat(){
        System.out.println("吃");
    }
    public void show(){
        System.out.println("hello,你好");
    }
}
//==============================
package com.hspedu.poly_.detail_;
public class Cat extends Animal {
    public void eat(){//方法重写
        System.out.println("猫吃鱼");
    }
    public void catchMouse(){//Cat特有方法
        System.out.println("猫抓老鼠");
    }
}
//=====================
package com.hspedu.poly_.detail_;
public class Dog extends Animal {//Dog是Animal的子类
}
```

属性没有重写之说！属性的值看编译类型   方法需要看运行类型

```java
package com.hspedu.poly_.detail_;

public class PolyDetail02 {
    public static void main(String[] args) {
        //属性没有重写之说！属性的值看编译类型
        Base base = new Sub();//向上转型 base的编译类型是Base，运行类型是Sub
        System.out.println(base.count);// ？ 看编译类型 10
        Sub sub = new Sub();
        System.out.println(sub.count);//?  20
    }
}

class Base { //父类
    int count = 10;//属性
}
class Sub extends Base {//子类
    int count = 20;//属性
}

```

**instanceOf** 比较操作 符，用于判断对象的运行类型是否为 XX 类型或 XX 类型的子类型

```java
package com.hspedu.poly_.detail_;

public class PolyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof  BB);// true
        System.out.println(bb instanceof  AA);// true

        //aa 编译类型 AA, 运行类型是BB
        //BB是AA子类
        AA aa = new BB();
        System.out.println(aa instanceof AA);//true 判断BB类型是不是AA类型或AA类型的子类型
        System.out.println(aa instanceof BB);//true 

        Object obj = new Object();
        System.out.println(obj instanceof AA);//false
        String str = "hello";
        //System.out.println(str instanceof AA);
        System.out.println(str instanceof Object);//true
    }
}

class AA {} //父类
class BB extends AA {}//子类
```

#### java的动态绑定机制（重要）

- 调用对象方法时候，该方法会和该对象的内存地址/运行类型绑定

- 当调用对象属性时，没有动态绑定机制，哪里申明哪里使用

- 一般情况下方法调用需要看运行类型（从子类开始找），属性的调用看编译类型；但下面的 System.out.println(a.sum());//30 这个，先在子类B中找有没有sum( ),发现没有，再到父类A中找

  - ```java
      public int sum() {//父类sum()
            return getI() + 10;
        }
        //getI()需要到子类B中找，发现有该方法
         public int getI() {//子类getI()
            return i;
        }
        //这里return i;返回的就是子类B中的i  （当调用对象属性时，没有动态绑定机制，哪里申明哪里使用）
    ```

    

  - ```java
    package com.shusheng.dynamic;
    
    public class DynamicBinding {
        public static void main(String[] args) {
            //a 的编译类型 A, 运行类型 B
            A a = new B();//向上转型
            System.out.println(a.sum());//30
            System.out.println(a.sum1());//20
        }
    }
    class A {//父类
        public int i = 10;
        //动态绑定机制:
           public int sum() {//父类sum()
            return getI() + 10;
        }
        public int sum1() {//父类sum1()
            return i + 10;
        }
        public int getI() {//父类getI
            return i;
        }
    }
    
    class B extends A {//子类
        public int i = 20;
    //    public int sum() {
    //        return i + 20;
    //    }
        public int getI() {//子类getI()
            return i;
        }
    //    public int sum1() {
    //        return i + 10;
    //    }
    }
    ```

### 多态的应用

#### 多态数组

- 数组的定义类型为父类类型，里面保存的实际元素类型为子类类型

  - ```java
    package com.shusheng.polyarr_;
    
    public class PloyArray {
        public static void main(String[] args) {
            Person[] persons = new Person[5];
            //persons[i]编译类型是Person，但是运行类型具体看
            persons[0] = new Person("jake", 55);
            persons[1] = new Student("petter", 21, 100);
            persons[2] = new Student("mary", 20, 97.5);
            persons[3] = new Teacher("stifen", 56, 20000);
            persons[4] = new Teacher("mike", 61, 25000);
            for (int i = 0; i < persons.length; i++) {
                System.out.println(persons[i].say());
            }
            System.out.println("==============");
        //persons[1].study();//这里会报错，persons[1]编译类型是Person，运行类型是Student
        // 需要将persons[1]转化成Student，才可以调用Student中特有的方法study，
           // ((Student)persons[1]).study();//向下转型
            for (int i = 0; i < persons.length; i++) {
                if(persons[i] instanceof Student){
                    ((Student)persons[i]).study();//向下转型
                }
                else if(persons[i] instanceof Teacher){
                    ((Teacher)persons[i]).teach();//向下转型
                }
                else{
                    System.out.println("not student and teacher");
                }
            }
        }
    }
    //=========================
    package com.shusheng.polyarr_;
    
    public class Person {
        private String name;
        private int age;
    
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public int getAge() {
            return age;
        }
    
        public void setAge(int age) {
            this.age = age;
        }
    
        public String say(){
            return name + age;
        }
    }
    //==================================
    package com.shusheng.polyarr_;
    
    public class Student extends Person{
        private double Score;
    
        public Student(String name, int age, double score) {
            super(name, age);
            Score = score;
        }
    
        public double getScore() {
            return Score;
        }
        public void setScore(double score) {
            Score = score;
        }
        public String say(){
            return super.say() + " Score= " + Score;
        }
        public void study(){
            System.out.println("this is student " + getName() + " study");
        }
    }
    //================================
    package com.shusheng.polyarr_;
    
    public class Teacher extends Person {
        private double salary;
    
        public Teacher(String name, int age, double salary) {
            super(name, age);
            this.salary = salary;
        }
    
        public double getSalary() {
            return salary;
        }
    
        public void setSalary(double salary) {
            this.salary = salary;
        }
        public String say(){
            return super.say() + " salary= " + getSalary();
        }
        public void teach(){
            System.out.println("this is teach " + getName() + " method");
        }
    }
    ```

    


#### 多态参数:方法中定义的形参类型为父类类型，实参类型允许为子类类型

### Object类

#### 1、equals方法和==

- ==是一个比较运算符
  - 既可以判断基本类型，也可以判断引用类型
  - 判断基本类型：值是否相等
  - 判断引用类型: 地址是否相等（是否是同一个对象）
- equals 是object类中的方法，只能判断引用类型
  - 默认判断是地址是否相等，子类往往重写该方法，用于判断内容是否相等，如Integer、String

# 第九章 内部类

- 内部类的分类

![image-20251111084934792](D:\APP_data\Typora文档\assets\image-20251111084934792.png)

















































```c#
using(var db = OracleDbHelper.GetDb())
{
	String strcmd = db.Queryable<CG_FILE_INFO>()
        			.WhereIF(!string.IsNullOrEmpty(fileTextBox.Text), f=> f.ANNEX_NAME.Contains(fileTextBox.Text))
        			.Where(f => f.DELETE_FLAG == 0)
        			.Select(f=> new
                           {
                               ANNEX_NAME = f.ANNEX_NAME,
                               Download = "",
                               ANNEX_TYPE = f.ANNEX_TYPE,
                               CREATE_BY = f.CREATE_BY,
                           })
        				.ToSqlString();
    PL_DBOP_Oracle qCmd = new PL_DBOP_Oracle();
    qCmd.P00_Strcmd = strcmd;
    qCmd.P00_DispName = "Download,下载";
    qCmd.P00_TableNameS = "lean.CG_FILE_INFO";
    qCmd.P00_StrcnnDb = this.p90_strcnn;
    qCmd.P00_CanVisible_ColNames = "1@DELETE_FLAG;DELETE_TIME;STATE1;ANNEX_RELATIVE_PATE;CG_FILE_INFO_NID;ANNEX_TYPE";
    qCmd.P00_CanEdit_ColNames = "0@ggg";
    qCmd.P00_SquenceS = "ANNEX_NAME:1;Download:2";
    
    qCmd.P00_AllowAdd = false;
    qCmd.p00_AllowDel = false;
    
    DateTable dt1;
    dt1 = this.P00_Pt1_ole0P.OpenDataTable_oledb(this.p90_strcnn, qCmd.P00_Strcmd);
    this.mainData.M10_BandData_Oracle(dt1, qCmd, true);
    this.mainData.M00_Set_ButtonCol("Download","点击查看");
    
    this.mainData.CellContentClick -= mainData_CellContentClick;
    this.mainData.CellContentClick += mainData_CellContentClick;
    
}
```







