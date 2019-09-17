
# react-native-silent-update

## Getting started

`$ npm install react-native-silent-update --save`

### Mostly automatic installation

`$ react-native link react-native-silent-update`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-silent-update` and add `RNSilentUpdate.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNSilentUpdate.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

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

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNSilentUpdate.sln` in `node_modules/react-native-silent-update/windows/RNSilentUpdate.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Silent.Update.RNSilentUpdate;` to the usings at the top of the file
  - Add `new RNSilentUpdatePackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNSilentUpdate from 'react-native-silent-update';

// TODO: What to do with the module?
RNSilentUpdate;
```
  