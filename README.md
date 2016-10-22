<h1 align="center">quick4j</h1>


**quick4j** 是一个通用JavaWeb项目骨架， 
积极在探索使用Java、Web等一系列技术，搭建开发高性能、高可拓展性、高可维护性，高安全性的web项目；
以及Web前端模块化、组件化开发，与后台最佳的交互；以及探索使用NoSQL、与SQL等多数据库共存的解决方案；
提供大量模块参考，比如：权限管理模块。

作为一个 seed(种子) 项目，你可以基于它，快速搭建项目原型，并开发。


## 项目情况
> 此项目本是在3年前，开发新的项目时，采用ssm搭建的一个原型；完成新项目后，本着开源的精神，整理共享出来，帮助后人，这就是现在的quick4j。  
> 但无心插柳柳成荫，超过500多的forks，几百份求助邮件，每天几十Clones，让我倍感欣慰，为开源贡献了微薄的力量。  
> 前段时间，由于该项目中包含有IntelliJ IDEA软件的keygen，被GitHub Ban了。删除相关代码后，由于工作太忙，也没有申诉了。  
> 技术的更替，是值得鼓励的。我是一个喜欢挑战的人，我现在已经转战JavaScript，所以以后也没时间、没精力更新此项目，抱歉大家。  
> 当然，我喜欢开源软件，正是因为开源，集众人的智慧，技术才会快速发展，加快人类的对未知事物探索。让我们做的更好吧。


## 你可以使用 **quick4j**：
> * 快速搭建项目原型，基于Spring + Spring MVC + Mybatis，简单轻便、易于扩展的架构，适用于大多数项目
> * 封装了常用的CURD，配合mybatis-generator 自动生成dao、model、mapper层，减少重复劳动，提高生产力，实现快速、平稳的开发
> * 实现Mybatis的分页查询模块，支持MySQL、PostgreSQL、SQLServer等数据库分页查询
> * 通用的权限管理模块，基于Apache Shiro的 用户-角色-权限(RBAC)的细粒度权限控制
> * 大量配置示例，根据需求，自由优化、调整，达到最佳性能
> * 大量前端模块化开发示例，积极在探索前端最佳的架构，与后台最佳的交互，构建雄心勃勃的Application


## How to get/use it
> 
* 1、git clone https://github.com/Eliteams/quick4j.git
* 2、在MySQL中导入 quick4j/src/test/resources/quick4j.sql 脚本
* 3、更新 quick4j/src/main/resources/application.properties 中 JDBC Global Setting
* 4、cd quick4j
* 5、mvn war:war 
* 6、把 quick4j/target/quick4j.war 发布在App Server(Tomcat、JBOSS) 中


## 在IDE 中查看源码并运行
> #### 1 、在IntelliJ IDEA
* File -> Import Project -> select quick4j folder -> create project form existing sources -> ...

> #### 2、 在Eclipse
* File -> Import -> Existing Maven Projects -> ...


## If you have a better suggestion,Please share out,Let's do better.
> Author ：StarZou  
> Email  ：starzou@126.com


## License
> Copyright (c) 2016 StarZou.  
> Licensed under the MIT license.  

> Welcome to stars, forks, create new pull request.
