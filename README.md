*********************************************************************************
*********************************************************************************
依赖使用方法：
Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
 Step 2. Add the dependency
 dependencies {
	        compile 'com.github.Anjovo:mytoolslibrary:2.2'
	}
*********************************************************************************
*********************************************************************************
版本历史：
*********************************************************************************
2.2版本（2017-05-08）：
1.已解决录制视频时按钮变形问题；
2.加入全局标题栏，不用像上个版本使用ActivityTitleBase时布局必须加入common_title_bar布局，可以直接在需要标题栏的界面使用setup...而不用担心空指针问题；
3.修复实际全局标题栏带来的相册预览界面布局错乱问题;
4.已解决7.0以上系统使用框架图片选择图片时异常问题。
*********************************************************************************
 1.4版本：
 1.基础版本实现Android开发工具库所有功能；
 2.解决7.0以及以上系统权限授权问题。
*********************************************************************************
*********************************************************************************
Android开发工具库: 
*********************************************************************************
*********************************************************************************
1.统一的文件夹管理:新建,删除;缓存大小统计,清理缓存;
*********************************************************************************
2.全局向右滑动返回到上一个界面; 
*********************************************************************************
3.引导界面功能实现; 
*********************************************************************************
4.通用的Adapter和公用的ViewHolder; 
*********************************************************************************
5.formEditext表单验证;
*********************************************************************************
6.全局监听错误并主动生成日志报告; 
*********************************************************************************
7.公共类ActivityTitleBase,继承其可实现全局管理所有Activity的标题栏各种按钮(类似ActionBar),状态栏颜色控制;
*********************************************************************************
8.Gif加载功能; 
*********************************************************************************
9.商品详情页面拖动分配功能; 
*********************************************************************************
10.非空判断工具类;
*********************************************************************************
11.全局控制网络请求框架(Mvp思想 使得架构通用化 封装网络请求数据); 
*********************************************************************************
12.通知权限是否开起检查功能; 
*********************************************************************************
13.全局敏感权限检查; 
*********************************************************************************
14.上拉刷新下拉加载更多功能(自定义SwipyRefreshLayout实现); 
*********************************************************************************
15.基于ZBarDecoder.jar实现二维码扫描; 
*********************************************************************************
16.统一图库管理(类似微信UI实现图片选择拍照以及裁剪功能裁剪时可旋转图片); 
*********************************************************************************
17.统一管理录制小视频功能; 
*********************************************************************************
18.正则表达式验证工具类:验证手机号,验证银行卡,验证坚查网址等; 
*********************************************************************************
19.统一的Activity堆栈管理; 
*********************************************************************************
20.随机生成生成漂亮的颜色; 
*********************************************************************************
21.特殊字符管理功能; 
*********************************************************************************
22.统一网络图片显示功能(使用PicassoUtil); 
*********************************************************************************
23.统一管理WebView访问原生和原生访问WebView功能; 
*********************************************************************************
24.自定义弹窗网络加载动画,可拓展; 
*********************************************************************************
25.自定义圆形控件; 
*********************************************************************************
26.自定义GridView和ListView; 
*********************************************************************************
27.仿IOS弹窗样式实现各种弹窗; 
*********************************************************************************
28.全局使用butterknife注解.
