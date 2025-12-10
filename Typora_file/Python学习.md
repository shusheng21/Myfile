# 数据类型

![image-20250804160813964](D:\APP_data\Typora文档\assets\image-20250804160813964.png)



Python中有三种注释，分别是单行注释、多行注释和字符串注释

声明变量命名规则:只能包含字母、下划线和数字，不能以数字开头

基本数据类型:整型 浮点型 字符型 布尔值

复合数据类型:列表 集合 元组 字典

```python
print中使用单双引号均可

print("hello world") 输出一段话

a=12

print(a)  输出一个变量值

print(f"hello{a}")  字符串中包含变量值 注意f不能省略
```

```python
另一种方式

print("hello %d" % a) 字符串中包含变量值

# 注意：%d仅用于整数
f = 3.5415
print("f = %d" % f) # 3
# 如果是字符串后者是列表，则使用%s
e = "你好 world"
print("这句话是： %s" % e) # 这句话是： 你好 world
c=[3,2,5,1,0]
print("c等于：%s" % c)


print("我是人\t 你是狗") \t代表长空格

print("我是人\n 你是狗") \n代表换行

print("我是人你是狗",end="") 末尾不换行

a=input() 程序运行时停在此处等待输入

a=input("请输入:")  等待输入时的提示

输入的类型默认是字符串形式

a=int(input("请输入:")) 转换为int

类型转换

a=15

b=str(a)

c=float(b)

随机数

import random

a=random.randint(1,100) 范围在1-100的一个随机数整数,包括1和100

b=random.uniform(1,100) 范围在1-100的一个随机数浮点数,包括1和100

c=random.random()  0-1之间的一个浮点数

布尔类型

a=False

b = not a

c= a or b

d= a and c

字符串

s1="O"

s2="H"

oh=s1+s2

hh=s2*2  在字符串中 *乘以就是复制的操作

ohh =s1+s2*3

python中有加减乘除取余(%)开方(**)等
```

**条件和循环**

缩进使用一个tab键或者4个空格 IDE会将tab转换为4个空格

```python
# 判断

a=11

b=a%2

c=b==0

if c:

 print("偶数")

else:

 print("不是偶数")
```

  

```python
#多分支

a=int(input("请输入一个数值:"))

if a<0 or a>100:

 print("分数不合法")

elif a<60:

 print("不合格")

elif a<80:

 print("合格")

else:

 print("优秀")
```



```python
python中有while循环和for循环

a=0

while a<10:

 a+=1

 print(a)

 if a==5:

  break



print("end")



\#死循环

while True:

 print()



for循环

\# range代表他后面括号中一个左闭右开的整数区间

for i in range(10):

 print(i)

print("end")



\#如果写两个数就是指明开始位置从-1到9

for i in range(-1,10):

 print(i)

print("end")



for i in [0,1,2,3,4,5,6,7,8,9]:

 print(i)



\#int后面需要是一个列表 字符串 元素 集合都可以

string ="ABCDEFGHIJKLMNO"

for i in string:

 print(i)

  

\#对于python中的循环而言 可以在循环后写一个else: 代表循环正常结束

for i in range(10):

 print(i)

else:

 print("循环执行完了")
```

**字符串**

```Python
a ="my name is xxx"
    012345678    

\#切片从字符串下标1到下标5 不包括5 [1,5)

a=a[1:5]

print(a) #结果为y na



\#不写开始的数字默认从0开始

b ="my name is xxx"

b=b[:5]

print(b) #结果为my na



\#不写结束的数字默认截取到末尾

c ="my name is xxx"

c=c[3:]

print(c) #结果为name is xxx



\#可以写3个数 前两个数表示开始和结束，第3个数代表步长 间隔几个截取 1为不间隔,连续的 2为间隔1个 3为间隔两个

...

d ="my name is xxx"

d=d[1:5:3]

print(d) #结果为ya



\#前面两个什么都不写,后面写-1 代表翻转字符串

e="my name is xxx"

e=e[::-1]

print(e) # 结果为xxx si eman ym



\#从倒数第5截取到倒数第1 不包括倒数第1 不包括倒数第一 不翻转字符串

f="my name is xxx"

f=f[-5:-1]

print(f) #结果为s xx
```





```python
g="you are a xxx"

\#替换字符串内容

g=g.replace("xxx","pig")

print(g) #you are a pig



\#使用split根据参数中的内容分割字符串,参数可以是字符串符号空格等，最终得到一个列表

h="my name is nendie"

arr =h.split(" ") #获得一个列表 ['my', 'name', 'is', 'xxx']

for i in arr:

 print(i)

else:

 print("循环结束")



\#把字符串列表在拼接为一个字符串，以双引号中的内容拼接，不需要内容则直接"",以空格拼接" "

string ="-".join(arr)

print(string) #结果为my-name-is-nendie



\#转换大小写

a="hello".capitalize() #将字符串第一个字符转换为大写

print(a) #Hello

a="hello_world".title() #将字符串每个单词首字符转换为大写(其余的部分为小写) 空格下划线等作为分隔  
print(a) #Hello_World

a="heLLO".lower() #将字符串中大写转换为小写

print(a) #hello

a="heLLO".upper() #将字符串中小写转换为大写

print(a) #HELLO



\#删除空白字符串

b=" hello".lstrip() #删除左边空格

print(b)

b="hello ".rstrip() #删除右边空格

print(b)

b=" hello ".strip() #删除两侧空格

print(b)



\#字符串和列表都可以通过下标来获取指定元素

string="app"

s=string[0]

print(s) #a



arr=[1,2,3,4]

a=arr[0]

print(a) #1
```





**列表**

```py
\#列表可以嵌套，可以多层嵌套

\#二维列表的定义与获取元素

array =[[1,2,3],[4,5,6],[7,8,9]]

a=array[1][2]

print(a) # 6



\#三维列表的定义与获取

array=[

 [[1,2,3],[4,5,6],[7,8,9]],

 [[3,2,5],[4,5,8],[7,8,9]],

 [[1,2,3],[4,5,8],[7,0,9]]

]

a=array[2][1][0]

print(a) #4



\#遍历多维列表

print("开始遍历")

for a in array:

 for b in a:

  for c in b:

   print(c)

else:

 print("遍历完成")
```



```python
\#python的列表中可以同时定义多种数据类型

b=12

a =[1,False,"happy",b,[1,2,3]]

\#判断列表中是否存在 可以用 in 或者 not in

if 1 not in a:

 print("不在")

else:

 print("在呢")



\#列表是有顺序的

\#在列表的末尾添加一个元素

a.append("abc")



\#在指定位置插入一个元素

a.insert(1,"t") #在下标1元素前插入一个元素

\#列表可以直接输出

print(a) #[1, 't', False, 'happy', 12, [1, 2, 3], 'abc']



\#删除指定元素的两种方式 

a.pop(0) #根据下标删除指定元素

a.remove("happy") #根据内容删除指定元素



\#清空整个列表

a.clear()

print(f"删除列表{a}") #输出结果为 删除列表[]

# 直接删除整个列表
del a   #此时就不存在列表a了，执行print(a)将报错


\#通过下标修改列表中指定元素的值

\#列表可以这样,字符串不可以,字符串是不可变类型

arr=[1,2,3,4,6]

arr[0]=666

print(arr) #[666, 2, 3, 4, 6]



\#复制列表 这种拷贝是完全的拷贝 会在内存中复制一份 修改b不会影响arr

b=arr.copy()

b[0]=123

print(arr)

print(b)



\# 下面这种直接赋值的方式 一方改变另一方也会改变 不要使用

b=a



\#列表排序的两种方式

\#sort 直接修改原列表


a = [4, 2, 1, 3, 5]
a.sort()              # 原地排序，修改原列表
print(a)              # 输出: [1, 2, 3, 4, 5]

\#sorted内置函数,修改结果返回成一个新列表
# sorted 返回新列表，不修改原列表
b = [3, 2, 5, 1, 0]
c = sorted(b)         # c 是排序后的新列表 [0, 1, 2, 3, 5]

print(f"b等于：{b}")   # b 未被修改，输出: [3, 2, 5, 1, 0]
print(f"c等于：{c}")   # 修复：使用 f-string 输出列表 c
```



**元组**

```python
小括号定义的就是元组 元组不同于列表,元组中的元素不能被修改

a=(1,2) #定义一个元组

print(a[0]) #可以使用下标获取元组中的元素

a[0]=1 #运行会报错 TypeError: 'tuple' object does not support item assignment 元组（tuple）是一种不可变的序列类型，意味着你不能更改元组中的元素



字符串 元组 列表  都可以使用for循环遍历

a='123456123' #定义字符串

b= [1,2,3,"123",68] #定义列表

c=(1,2,"333") #定义元组

\#遍历字符串

for i in a:

 print(i)

else:

 print("字符串遍历完成")

\#遍历列表

for i in b:

 print(i)

else:

 print("列表遍历完成")

\#遍历元组

for i in c:

 print(i)

else:

 print("元组遍历完成")

# 也可以用下标来进行遍历
a='123456123' #定义字符串

b= [1,2,3,"123",68] #定义列表

c=(1,2,"333") #定义元组

也可以用下标来进行遍历
for j in range(len(a)):
    print(a[j])
else:
    print("字符串遍历完成，len(a)= %d" % len(a))

for k in range(len(b)):
    print(b[k])
else:
    print(f"列表遍历完成,len(b) = {len(b)}") #列表遍历完成,len(b) = 5

for m in range(len(c)):
    print(c[m])
else:
    print(f"元组已遍历完成，len(c)= {len(c)}") # 元组已遍历完成，len(c)= 3

  

\#字符串 列表 元组 也可以使用下面这种方式遍历range

for i in range(len(c)):

 print(c[i])
```



**集合**

```python
大括号定义  无序 不重复

\#集合使用大括号定义

s={5,3,3,4}

print(s) #输出 {3, 4, 5} 重复的被去掉了 顺序改变了

\#集合的两个特性: 无序 不重复



\#集合有一系列增删改查的方法
```



**字典**

```python
\#字典

\# 字典也是用大括号 内部用:定义键值对

\#键和值都可以是任意的数据类型
d = {"键1":"值1", "键2":"值2", "键3":"值3"}

d={'name':'pig','age':18}

ks = d.keys() # 获取字典中所有的键

print(ks) #dict_keys(['name', 'age'])



vs=d.values() #获取字典中所有的值

print(vs) #dict_values(['pig', 18])



kv=d.items() #获取键值对组成的元组 的列表 ,键值对是元组 包含键值对的是列表

print(kv) #dict_items([('name', 'pig'), ('age', 18)])



\#遍历字典

for K,V in d.items():

 print(K)

 print(V)





# 由于字典和集合都是用大括号来表示 一个空的{}表示的是一个空字典

d={} #空字典

f=set() #空集合





m={"name":"pig","age":18}

print(m["name"]) #pig 获取键对应的值



m["name"]="小明" #修改字典指定键的值

print(m["name"]) #小明



del m["age"] #删除字典指定的键值对

print(m) #{'name': '小明'}



m.clear() #清空字典

print(m) #{}



del m #删除字典
```



**函数**

```python
\#方法的定义

def day():

 print("方法被调用了")



\#方法的调用

for i in range(4):

 day()





\#带参数和返回值的函数定义

def is_double(n):

 if n%2==0:

  return True

 else:

  return False



\#测试带参函数

num=15

if is_double(num):

 print(f"{num}是偶数")

else:

 print(f"{num}不是偶数") #15不是偶数



\# 如果一个方法调用了一个全局变量,就需要在函数内部最开始的地方使用global修饰 这是将全局变量引入到方法中 否则报错如下

\# UnboundLocalError: local variable 'DAY' referenced before assignment

DAY=0



def day():

 global DAY #说明DAY是一个外部变量 是一个全局变量

 DAY+=1





day()





\#定义函数时 可以指定形参的类型,起到提示的作用 语法 形参后冒号后写类型

\#方法注释写在方法内,调用方法时鼠标放上去会有提示

def color(color:tuple,x:int,y:int,w:int,h:int):

 '''



 :param color:

 :param x: 参数x

 :param y: 参数y

 :param w:

 :param h:

 :return:

 '''

 return "test"



\#调用

[#color() #](https://search.bilibili.com/all?keyword=color() )鼠标放到调用这里的()中能看到提示







\#函数有多个返回值

def g():

 return 1,2



p=g()

print(p) #返回一个元组 (1, 2)



\#也可以对元组拆包 两个变量接收一个返回两个参数的方法

\#字典 集合 元组 列表 都可以拆包

a,b=g()

print(a,b) # 1 2
```



**不定长参数**

*号代表可以有无穷多参数

普通参数要写在不定长参数的前面

不定长参数可以用*星号 或者**两个星号

一个星号叫包裹位置参数

两个型号叫包裹关键字参数

如果是两个星号则需要在调用方法传参时 写参数名等于值

可以写无穷多个

如果一个方法的形参有 普通参数 默认参数 包裹位置参数 包裹关键字参数  那么这四种需要按照以下顺序书写





补充

isinstance 和 type 的区别在于：

type()不会认为子类是一种父类类型。
isinstance()会认为子类是一种父类类型

```python
class A:
    pass
class B(A):
    pass

print(isinstance(A(), A))  # True
print(type(A()) == A)  # True  
print(isinstance(B(), A))  # True
print(type(B()) == A)  # False
print(type(B()) == B)  # True
```

