# 类加载

## 加载
查找字节流，并且据此创建类的工程

类加载器(Bootstrap class loader) > 扩展类加载器 > 应用加载器
JDK9 ：类加载器(Bootstrap class loader) > 平台类加载器 > 应用加载器
双亲委派模型

类的唯一标识：类加载器实例+类的全名

## 链接
创建成的类合并至Java虚拟机中，事中能够执行的过程
* 验证：加载类能够满足Java虚拟机的规范
* 准备：被加载类的静态字段分配内存、构造其他跟类层次相关的数据结构，比如说用来实现虚方法的动态绑定的方法表
* 解析：符号引用解析成为实际引用，如果符号引用执行一个未被加载的类、或者未被加载类的字段或方法，那么解析将处罚这个类的加载（但未必处罚这个类的链接以及初始化）

## 初始化
为标记为常量值的字段复制，以及执行<clinit>方法的过程
常量值：直接赋值的静态字段 + final修饰，初始化由Java虚拟机完成
clinit：直接赋值操作、所有静态代码块中的代码，通过加锁确保仅被执行一次

## 何时触发
* 当虚拟机启动时，初始化用户指定的主类
* 当遇到用以新建目标类实例的 new 指令时，初始化new指令的目标类
* 当遇到调用静态方法的指令时，初始化该静态方法所在的类
* 当遇到访问静态字段的指令时，初始化该静态字段所在的类
* 子类的初始化会触发父类的初始化
* 如果一个接口定义了default方法，那么直接实现或者间接实现该接口的类初始化，会触发该接口的初始化
* 使用反射API对某个类进行反射调用时，初始化这个类
* 当初次调用MethodHandle实例时，初始化该MethodHandle指向的方法所在的类