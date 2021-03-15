# manage-parent系统简介(逐步完善中)
manage-parent是一个基础的后台管理系统,主要集成用户管理,角色关键,菜单管理,对用户基于权限进行授权管理基础功能

## 技术选型
系统采用java语言,使用java常用的框架与打包管理工具,具体如下:
* Spring
* SpringMVC
* Mybatis
* Freemarker
* logback
* druid
* Mysql
* Tomcat
* Maven
* Sharding-JDBC


## 工程结构说明

工程采用maven进行打包管理,以maven module进行结构划分,分为manage-common模块,manage-service模块,manage-web模块.每个模块内按照业务纵向分包,下面以订单模块为例说明工程结构

    manage-parent(parent module)
            |----doc(文档)
            |----manage-common(manage-common module)
                    |src/main/java/com/chlsmile/manage
            |----manage-service(manage-service module)
                    |src/main/java/com/chlsmile/manage
            |----manage-web(manage-web module)
                    |src/main/java/com/chlsmile/manage
                    |src/main/resources

* manage-common 基础模块,以jar包的方式提供给manage-service和manage-web引用
* manage-service 业务逻辑模块,包含业务逻辑层和持久层代码逻辑,以jar包的方式提供给manage-web引用
* manage-web web层,主要包括Controller



