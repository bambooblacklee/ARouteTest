模块化开发
    ARouter + ButterKnife 应用Test
    
    modulebase作为base library。app、modulea、moduleb 均作为单独的模块
    
    1、根目录下gradle.properties进行全局变量定义(包含引用版本、是否模块化debug开发)
    2、ARouter初始化及应用(https://github.com/alibaba/ARouter)
        1、modulebase 设置;
            a、build.gradle
                android {
                    defaultConfig {
                    ...
                    javaCompileOptions {
                        annotationProcessorOptions {
                        arguments = [ moduleName : project.getName() ]
                        }
                    }
                    }
                }
                dependencies {
                  compile 'com.alibaba:arouter-api:x.x.x'
                  annotationProcessor 'com.alibaba:arouter-compiler:x.x.x'
                }
            b、MyApplication
               进行初始化
        2、App modulea moduleb 设置:  
            javaCompileOptions {
                      annotationProcessorOptions {
                          arguments = [ moduleName : project.getName() ]
                      }
                  }
            annotationProcessor "com.alibaba:arouter-compiler:${arouter_compiler_version}"    
                
    3、ButterKnife 8.8.1应用
        1、根build.gradle设置
           buildscript {
               repositories {
                   jcenter()
               }
               dependencies {
                   //buterknife 版本要求
                   classpath 'com.android.tools.build:gradle:2.3.3'
                   classpath 'com.jakewharton:butterknife-gradle-plugin:8.8.1'
               }
           }
        2、modulebase设置
           apply plugin: 'com.jakewharton.butterknife'
           compile "com.jakewharton:butterknife:${butterknife_version}"
        
        3、app moudlea moduleb设置
           apply plugin: 'com.jakewharton.butterknife'
           annotationProcessor "com.jakewharton:butterknife-compiler:${butterknife_compiler_version}"
        4、注意:在app modulea moduleb 中butterknife注入的,都使用R2 而非R
        
    4、模块化modulea 设置:
    
       1、在modulea的AndroidMainfest.xml中添加如下设置
           android:name="com.bamboolmc.modulebase.MyApplication"
                   android:icon="@mipmap/ic_launcher"
                   android:theme="@style/AppTheme"
           
           //启动的activity下
           <intent-filter>
                   action android:name="android.intent.action.MAIN"/>
                   <category android:name="android.intent.category.LAUNCHER"/>
           </intent-filter>
       2、修改根gradle.properties 下的全局变量
           IsDebugModuleApp = true
            IsDebugModuleA = true
            IsDebugModuleB = true
    
    
    5、注意: 将module合并时,需要在主app的build.gradle 下添加依赖关系
            if (!IsDebugModuleA.toBoolean()) {
                 compile project(':modulea')
             }
             
        