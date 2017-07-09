# [Ionic 2 Mobile App in Under 60 Minutes](https://www.youtube.com/watch?v=ilM8YorL_jI)
http://ionicframework.com/

## [ionic2 installation](http://ionicframework.com/docs/intro/installation/)

```bash
android sdk
android avd

npm install -g ionic cordova
ionic start ionreddit --v2
cd ionreddit
ionic serve
```

## [ionic component docs](https://ionicframework.com/docs/components/)

## android sdk install
* [install android](https://developer.android.com/studio/install.html)

## run on android
```bash
cordova platform add android
```
* android emulator
```bash
ionic run android
```
* real android device(create .apk file)
```bash
ionic build android
```

* android path
```bash
set ANDROID_HOME=C:\<installation location>\android-sdk-windows
set PATH=%PATH%;%ANDROID_HOME%\tools;%ANDROID_HOME%\platform-tools
```

* Error: Could not find gradle wrapper within Android SDK. Might need to update your Android SDK.?
    * [SDK tools package](https://dl.google.com/android/repository/tools_r25.2.3-windows.zip)
    * [solution](https://forum.ionicframework.com/t/error-could-not-find-gradle-wrapper-within-android-sdk-might-need-to-update-yo-ur-android-sdk/22056/6)

> I have same error: could not find gradle wrapper within android sdk when i build ionic, but i was solve. I just download Android SDK tools package4.2k and copy extract file to C:\Users\CURRENT_USER\AppData\Local\Android\sdk and build ionic/cordova again.
its work for me.


Built the following apk(s):
        D:/dev/Ionic2/ionreddit/platforms/android/build/outputs/apk/android-debug.apk