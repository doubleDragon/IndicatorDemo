# IndicatorDemo
Custom tab indicator view

## Attr
```xml
    <declare-styleable name="IndicatorView">

        <attr name="image" format="reference"/>
        <attr name="textSize" format="dimension"/>
        <attr name="android:text" />
        <attr name="android:color"/>

    </declare-styleable>
```
## Usage
```java
IndicatorView indicator = (IndicatorVIew)findViewById(R.id.xxx);
indicatorView.setSelected(true);//selected state
indicatorView.setSelected(false);//unselected state
```

## Version 1.0.0
![image](https://github.com/doubleDragon/IndicatorDemo/raw/master/screenshots/indicator.png)
License
============

        Copyright 2015  Double Gragon

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.

