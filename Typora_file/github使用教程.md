## 一、git概念

- Git是一个运行在你电脑上的版本控制软件，而Github:是基于Git这个版本控制软件打造的网站。
- Git的三个概念：提交commit、仓库repository、分支branch

## 找资源方法

1. 找项目方法

- 找百科大全 awesome XXX
- 找例子 XXX sample
- 找空项目架子 XXX starter / XXX boilerplate
- 找教程 XXX tutorial

2. 找开源项目的一些途径

• https://github.com/trending/
• https://github.com/521xueweihan/HelloGitHub
• https://github.com/ruanyf/weekly
• https://www.zhihu.com/column/mm-fe

3. 特殊的查找资源小技巧-常用前缀后缀

• 找百科大全 awesome xxx
• 找例子 xxx sample
• 找空项目架子 xxx starter / xxx boilerplate
• 找教程 xxx tutorial

Fork(复制克隆项目)

Pull Request  发起请求

## 二、git使用

### 1、拉取项目

#### （1）使用git clone

1、复制某个项目的链接

![image-20251226172816690](assets/github使用教程/image-20251226172816690.png)

2、到想要的文件夹位置，右键->Git Bash Here , 在弹出的命令行中输入代码

```
git clone https://XXX(1中的地址)
```

**注：使用git clone拉取下来的代码，已经包含远程仓库的信息，新增编辑后git push直接推送到原远程仓库**

#### （2）使用download

1、使用命令行git clone下来的文件夹是一个git仓库，而使用download zip下载的文件仅仅是一个文件

```
解压缩下载的zip文件，进入文件中右键->git bash here->命令行输入git init 进行初始化。现在这个文件夹就变成了一个仓库，之后就可以以提交为概念向仓库添加代码
```

**注：download拉取下来的zip，解压后使用git init初始化后，需要配置远程仓库地址，才可以git push推送到远程仓库**

```git
//添加远程仓库
//git remote add <name> <仓库url>   其中<name>是远程仓库的别名，通常就取默认 origin
git remote add origin <仓库url>

//首次执行推送使用 -u 建立关联，后续可直接使用git push
git push -u origin main(或master)
```

### 2.推送项目

```
git add -A   //把所有的文件加入暂存区 等同“git add .”
git add -文件名  //把某文件加入暂存区
git commit -m "这里添加提交的信息"  //把暂存区的文件加到仓库
```

### 3.分支

 多人协作成为可能——分支

```
git branch <分支名>      # 仅创建分支
git checkout <分支名>    # 切换到分支

从当前节点新建分支
git checkout -b <branchname>

列举所有的分支
git branch
单纯地切换到某个分支
git checkout <branchname>
删掉本地特定的分支
git branch -D <branchname>

删除远程分支
git push origin --delete <分支名>
# 或简写
git push origin :<分支名>

合并分支  //注意在主分支main中创建了分支a,在a中新增了内容，需要将a分支合并到主分支，需要先切换回main分支，在使用git merge a 这个命令
git merge <branchname>

合并分支冲突了，放弃合并分支：
git merge --abort

//指定的分支都合并完成之后，删除分支
```

基于main主分支创建了一个分支a，如果需要将a分支上传到github云上，则在VScode中a分支状态下，使用命令

```
git push -u origin a
//推送分支到GitHub首次推送需关联远程分支并上传,后续则直接使用git push
```

一般主分支都是完整的代码，可以运行跑起来的，要写其他功能可以放到其他分支里，等功能实现了在合并到主分支。

![image-20251226174322942](assets/github使用教程/image-20251226174322942.png)

## 三、VScode中的git使用

在VScode中文件加入暂存区

![image-20251226174352991](assets/github使用教程/image-20251226174352991.png)

把暂存区的文件添加到仓库：在源代码管理输入框中输入提交信息如“first commit”，按下Ctrl + enter  即可实现

<img src="assets/github使用教程/image-20251226174448978.png" alt="image-20251226174448978" style="zoom:80%;" />

查看以前的提交

<img src="assets/github使用教程/image-20251226174541380.png" alt="image-20251226174541380" style="zoom:80%;" />

```
//工作区打回去：
git checkout <filename>

//提交后撤回：
git reset HEAD^（等效于git reset HEAD^1）//撤回最近的一次提交
```

如下图：readme文件修改了，正准备提交，老板反悔了，还是用之前的，就可以把在工作区更改的这个撤回去

![image-20251226214825354](assets/github使用教程/image-20251226214825354.png)

或者直接操作如下图

![image-20251226214942985](assets/github使用教程/image-20251226214942985.png)

撤回提交

![image-20251226215035974](assets/github使用教程/image-20251226215035974.png)

![](assets/github使用教程/image-20251226215138036.png)

![image-20251226215312348](assets/github使用教程/image-20251226215312348.png)

![image-20251226215418248](assets/github使用教程/image-20251226215418248.png)

git与github远程仓库

```
推送
git push

拉取
git pull  
```

create a new repository on the command line

```
echo "# Mysql_tutorial_backup" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main   
git remote add origin https://github.com/shusheng21/Mysql_tutorial_backup.git
git push -u origin main
```

push an existing repository from the command line

```
git remote add origin https://github.com/shusheng21/Mysql_tutorial_backup.git
git branch -M main  
git push -u origin main
```

```
git branch -M main    用于将当前所在的本地分支重命名为 main
```



## = = = = 分割线 = = = =

---

Git常用撤销操作

![image-20251226220816510](assets/github使用教程/image-20251226220816510.png)

假设在初始状态下这四个区域是保持同步的，只有一个init commit。

对代码文件进行了一些修改，新增内容“做了修改01”。且未进行任何git操作后用git diff

可以看到你的修改后的和**git里面（暂存区）**目前保存的文件有什么不一样

```
git diff   //查看本地文件和git里面（暂存区）的文件有什么不一样
```

![image-20251226221649890](assets/github使用教程/image-20251226221649890.png)

![image-20251226222425009](assets/github使用教程/image-20251226222425009.png)

也可以使用git status查看具体是哪个文件被修改了。

注：git status不显示具体哪些内容被修改，只显示哪个文件被修改。而git diff可以显示具体内容的修改

![image-20251226223910265](assets/github使用教程/image-20251226223910265.png)

使用git checkout <文件名> 或者  git restore <文件名>把我们硬盘上对这个文件的修改撤销,恢复这个文件之前的状态

注意：如果在本地修改了文件，**未做任何git操作**和**git add 添加到暂存区**，这两种情况都可以使用git checkout <文件名>  进行恢复，如果文件进行了git commit提交操作，使用该命令无法撤销

```
git checkout <文件名>  或者  git restore <文件名>    //效果一样
//在较新版本中推荐使用 git restore
```

![image-20251227004838491](assets/github使用教程/image-20251227004838491.png)

### 2.撤销git add操作

撤销git add操作，把文件从暂存区中删除，同时保留本地的更改

```
git reset <changed_file> 
(  等价于较新版本中的  git restore --staged <changed_file>  )
//该操作相对安全，只会把文件从暂存区移出，它不会对你硬盘上的源代码本身进行修改
```

![image-20251227004913931](assets/github使用教程/image-20251227004913931.png)

撤销掉你所有的修改，包括**暂存区和硬盘上**的修改，使用git checkout HEAD <changed_file>

```
git checkout HEAD <changed_file>
//HEAD 在git里面表示最近的一次commit
//注意这个操作会让你丢失硬盘上的修改
```

![image-20251227004942223](assets/github使用教程/image-20251227004942223.png)

### 3.撤销git commit操作

撤销git commit操作，**把文件从本地的git仓库中删除**，暂存区以及本地磁盘中还存在

```
git reset --soft HEAD~1


//HEAD 在git里面表示最近的一次commit，HEAD~1指向的是当前commit的之前一个提交，同理的HEAD~n指向的是当前commit的之前的n提交
```

![image-20251226233311923](assets/github使用教程/image-20251226233311923.png)

```
git reset HEAD~1
(git reset --mixed HEAD~1)
//同时撤销你的git commit和git add,把文件从本地git和暂存区都拿掉，只保留硬盘上的修改
```

![image-20251226233349799](assets/github使用教程/image-20251226233349799.png)

```
git reset --hard HEAD~1
//同时撤销你的git commit和git add，以及本地硬盘的修改也撤销。
//需要小心使用
```

![image-20251226233701824](assets/github使用教程/image-20251226233701824.png)

```
git revert HEAD
//把之前的一个提交拿过来，作为一个新的提交，把当前的提交状态完美保留下来
```

![image-20251226234241723](assets/github使用教程/image-20251226234241723.png)

reset只能回到之前某一个commit的状态,但是revert可以撤销中间任意一个commit



这里有问题

![image-20251227001240166](assets/github使用教程/image-20251227001240166.png)

公有分支：不止你一个人在使用的分支，几乎所有项目的主分支都是公有分支

对于公有分支来，只可以往前走，不可以往后退（只能增加，不能减少）

**当修改目标是一个公有分支的时**，只能使用git revert命令，在这个公有分支上新加一个commit

然后从结果上撤销我们之前的修改，修改后以直接使用git push命令

![image-20251227001800691](assets/github使用教程/image-20251227001800691.png)

当修改目标是一个个人分支的时，可以用这个git reset把这个commit直接砍掉，想同步到远端的话

你必须使用git push -f 强制同步

![image-20251227002007687](assets/github使用教程/image-20251227002007687.png)

上述两个操作中会出现合并冲突，需要手动在本地文件解决冲突，然后使用命令 git add <刚才有冲突被解决的文件名>，使用命令 git revert --continue  完成撤销操作。此时会

出现这个界面后，如何操作

![image-20251227002848792](assets/github使用教程/image-20251227002848792.png)

![image-20251227002933594](assets/github使用教程/image-20251227002933594.png)

```
:q!   //返回到原上一界面，撤销终止

:wq   //接受信息
```

然后再使用git push 或者 git push -f 即可完成撤销操作

![image-20251227004748526](assets/github使用教程/image-20251227004748526.png)



1. git中的回退

`Disk`: 本地的修改文件 statuss change XX staged

`stage`: 暂存区 status to be commit

`Local`: 本地的 git 仓库 commit to be push

`Remote`: 远端的存储

![img](assets/github使用教程/236191712db7d479b91b511a0bfa5a853b241bdd.png@682w_!web-note.webp)



```
graph TB
    A[Disk-未变更状态]
    B[Disk-文件变更但未保存]
    D[stage-文件变更到缓存区]
    E[local-保存commit到本地]
    G[remote-远端仓库]

    A-->|文件修改|B
    B-->|1. git checkout file|A
    B-->|2. git add file|D
    D-->|3. git restore -- staged |B
    D-->|4. git checkout HEAD|A
    D-->|5. git commit|E
    E-->|6. git reset --soft|D
    E-->|7. git reset --mixed|B
    E-->|8. git reset --hard|A
    E-->|9. git revert|E
    E-->|10. git push|G
```

1. 撤销`Disk`的修改。（这段测试代码以后都不用了）

```
git checkout <change file>
git restore <change file>
```

1. 将Disk的修改放到缓存区(这个工具类还不错，我需要上传，以后别的代码也用)

```
git add <change file>
```

1. 将文件从缓存区移除 (这是我的测试文件，不提交，但是当前开发调试需要)

```
git restore --staged<change file>
```

1. 将文件的更改直接删除（这个文件有以后都不用了）

```
git checkout HEAD <change_file> 丢失硬盘上的修改
```

1. Locl git reset --soft HEAD1 = git reset --mixed HEAD1 回到上一个提交 保留在暂存区
2. mixed hard 从disk staging local上都需要找到
3. 提交缓存数据到本地(写完一个新功能，提交feature1)

```
git commit -m "feature1 optimse date format."
```

1. 回退一个commit状态（少加一个文件，commit 信息不对。但是 add 操作大差不差）

```
git reset --soft HEAD~1
```

1. 回退一个commit，add也是错的（需要提交20个文件 错加了40个，从重新add ）

```
git reset --mixed HEAD~1
```

1. 回退这个commit的提交的文件变动(需求完全推翻，变更不要了，重新开始)

```
git reset --hard HEAD~1
```

1. 回退某个commit的提交。（新上线功能依赖数据库没好，先回退。更改以后会合并）

```
git revert HEAD
```

1. 把本地的修改push到远端 (我代码好了，推到远端 给leader code review)

```
HEAD 增加一个commit  是上次使用的commit的反向操作
```

**tip**：revert 和 reset的差异：1. reset 只能回退上X个提交。而revert 可以回退某个指定的commit 2. reset之后提交信息就没了。revert我这个功能后面还能开回来
