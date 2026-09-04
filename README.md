# Pretty JSON

This repository is a fork maintained by [cuixbo](https://github.com/cuixbo/pretty-json).
The original project is [swan-geese/pretty-json](https://github.com/swan-geese/pretty-json).

## 功能

这是一个json格式化插件，实现将选中内容进行json格式化优雅输出，以及压缩输出json数据
并且同时支持快捷键操作和鼠标右键操作

| 操作         | 默认快捷键 |
| ------------ | ---------- |
| 优雅输出json | Ctrl + Meta + J |
| 压缩输出json | Ctrl + Meta + I |

在 macOS 上，Meta 键为 Command。

## 步骤

1. 在编辑器中选中一个 JSON 对象。
2. 右键选择 `Pretty JSON` 格式化，或选择 `Indented JSON` 压缩。
3. 也可以使用上表中的默认快捷键。

## 本地安装

本 fork 可以使用 Gradle 生成 ZIP 后，在 Android Studio 的 **Settings → Plugins → Install Plugin from Disk…** 中选择该 ZIP 安装。

当前 fork 针对 Android Studio 2026.1 完成了构建链升级、IDE 版本上限移除和编辑器 API 更新；插件 ID、功能和快捷键保持兼容。

## 效果图

![Longshot-20240216040037](https://gitee.com/hongyan008/blog-img/raw/img/img/Longshot-20240216040037.png)
