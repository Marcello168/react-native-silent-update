<!--
 * @Author: gongyonghui
 * @Date: 1985-10-26 16:15:00
 * @LastEditors: gongyonghui
 * @LastEditTime: 2019-09-17 19:25:52
 * @Description: file content
 -->

# APK 拥有Root权限的 静默更新 react-native-silent-update

## 开始使用

`$ npm install react-native-silent-update --save`

### 链接原生库

`$ react-native link react-native-silent-update`

### 在`MainApplication`的`onCreate`方法里面增加如下代码
```java
   SilentUpdateManager.getInstance().setUpdateCallback(new UpdateCallBack() {
      @Override
      public void onUpdateAPKCallback(String uri) {
        Log.d(TAG, "App onUpdateAPKCallbackUri: " +uri);

        SilentUpdateUtil.getInstance().downloadAndInstallThroughCache(getApplicationContext(), uri);
      }
    });

    SilentUpdateUtil.getInstance().setSilentUpdateListener(new SilentUpdateListener() {
      @Override
      public void onUpdateSuccess() {
        Log.d("Tag", "App onUpdateSuccess: ");
        Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);
        intent2.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent2);
      }
      @Override
      public void onUpdateFail() {
        Log.d("TAG", "App onUpdateFail: ");
      }
    });
```

### 手动安装


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNSilentUpdatePackage;` to the imports at the top of the file
  - Add `new RNSilentUpdatePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-silent-update'
  	project(':react-native-silent-update').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-silent-update/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-silent-update')
  	```



## 使用方法
```javascript
import RNSilentUpdate from 'react-native-silent-update';

// TODO: What to do with the module?
RNSilentUpdate.updateAPK('https://raw.githubusercontent.com/Marcello168/TestAPK/master/app-release.apk')

```
  