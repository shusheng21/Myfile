- Git是一个运行在你电脑上的版本控制软件，而Github:是基于Git这个版本控制软件打造的网站。
- Git的三个概念：提交commit、仓库repository、分支branch

## 拉取项目

- 在文件夹中右键，git bash，进入命令行输入代码

- ```
  git clone 仓库地址
  ```

  ### 找项目
  
  - 找百科大全 awesome XXX
  - 找例子 XXX sample
  - 找空项目架子 XXX starter / XXX boilerplate
  - 找教程 XXX tutorial
  
  

### 找开源项目的一些途径

• https://github.com/trending/
• https://github.com/521xueweihan/HelloGitHub
• https://github.com/ruanyf/weekly
• https://www.zhihu.com/column/mm-fe

### 特殊的查找资源小技巧-常用前缀后缀

• 找百科大全 awesome xxx
• 找例子 xxx sample
• 找空项目架子 xxx starter / xxx boilerplate
• 找教程 xxx tutorial



Fork(复制克隆项目)

Pull Request  发起请求



### 通过链接拉取项目

1、复制某个项目的

![image-20250813160255659](D:\APP_data\Typora文档\assets\image-20250813160255659.png)

2、到想要的文件夹位置，右键->Git Bash Here , 在弹出的命令行中输入代码

```
git clone https://XXX(1中的地址)
```

3、下载好后，打开文件夹，在空白的位置点击右键->通过Code打开

License

如果是MIT,表示可以随意使用，只需要保持作者的版权信息

4、使用命令行git clone下来的文件夹是一个git仓库，而使用download zip下载的文件仅仅是一个文件

```
解压缩下载的zip文件，进入文件中右键->git bash here->命令行输入git init 进行初始化。现在这个文件夹就变成了一个仓库，之后就可以以提交为概念向仓库添加代码
```

![image-20250814085116014](D:\APP_data\Typora文档\assets\image-20250814085116014.png)

```
git add -A   //把所有的文件加入暂存区
git add -文件名  //把某文件加入暂存区
git commit -m "这里添加提交的信息"  //把暂存区的文件加到仓库
```

在VScode中文件加入暂存区

<img src="D:\APP_data\Typora文档\assets\image-20250814085853506.png" alt="image-20250814085853506" style="zoom:69%;" />

把暂存区的文件添加到仓库：在源代码管理输入框中输入提交信息如“first commit”，按下Ctrl + enter  即可实现

![image-20250814090100352](D:\APP_data\Typora文档\assets\image-20250814090100352.png)

查看以前的提交

![image-20250814090422672](D:\APP_data\Typora文档\assets\image-20250814090422672.png)

```
//工作区打回去：
git checkout <filename>

//提交后撤回：
git reset HEAD^（等效于git reset HEAD^1）//撤回最近的一次提交
```

如下图：readme文件修改了，正准备提交，老板反悔了，还是用之前的，就可以把在工作区更改的这个撤回去

![image-20250814090919525](D:\APP_data\Typora文档\assets\image-20250814090919525.png)

或者直接操作如下图



![image-20250814091013295](D:\APP_data\Typora文档\assets\image-20250814091013295.png)

撤回提交

![image-20250814091311698](D:\APP_data\Typora文档\assets\image-20250814091311698.png)

![image-20250814091401195](D:\APP_data\Typora文档\assets\image-20250814091401195.png)

![image-20250814091434116](D:\APP_data\Typora文档\assets\image-20250814091434116.png)

## 多人协作成为可能——分支

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

![image-20250814092319638](D:\APP_data\Typora文档\assets\image-20250814092319638.png)

git与github远程仓库

```
推送
git push

拉取
git pull  
```

### create a new repository on the command line

```
echo "# Mysql_tutorial_backup" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/shusheng21/Mysql_tutorial_backup.git
git push -u origin main
```

###  push an existing repository from the command line

```
git remote add origin https://github.com/shusheng21/Mysql_tutorial_backup.git
git branch -M main
git push -u origin main
```

