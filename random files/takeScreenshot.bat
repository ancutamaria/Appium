adb shell uiautomator dump

adb pull /sdcard/window_dump.xml ui.uix

adb shell screencap -p /sdcard/ui.png

adb pull /sdcard/ui.png