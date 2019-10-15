# LogLib
Simple library for logging errors. Pratice project for creation of libraries
## Installation
Add Jitpack to your project build.gralde file
```bash
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Then add this dependency to your app build.gradle file.
```bash
dependencies {
  implementation 'com.github.MikeAde1.LogLib:logerror:1.0'
}
  ```
## Usage
```python
LogDebug.setDebugLog("arrived")
LogError.setErrorLog("Error Arriving")
```
## License
[MIT](https://choosealicense.com/licenses/mit/)
