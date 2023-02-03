SSM-单体架构项目注意事项：
1) 不允许将SpringMVC和Spring-Web依赖升级到6.x以上：
   2017年8月，Oracle（甲骨文）决议将Java EE（Java Enterprise EdITion）移交Eclipse基金会接手。
   2018年3月，Eclipse基金会宣布，Java EE（Enterprise Edition）被更名为Jakarta EE. Java EE规范接口发生改变。
2) 不允许将Jackson依赖升级到2.10.x以上：
   SpringMVC 5.x不兼容2.10.x及其以上的Jackson版本。
3) 提交代码时，严禁将.idea和target目录提交到代码库。
4) 数据库SQL语句保存在dev.sql文件中。