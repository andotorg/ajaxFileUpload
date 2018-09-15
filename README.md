# ajaxFileUpload
ajaxFileUpload.js 多文件上传插件bug修改后的，感谢原作者提供这么好的js插件

# js多文件异步上传是一个开源插件，修改bug之后准备重新共享
## 还有java 后端代码编写的，基于spring 4 spring mvc 

### 修改的Bug
> 当文件上传的时候，你的文件id有几个字母，他就会同一个文件，提交几次，例如你的id叫myfile， 那么他会提交6次，在chrome f12 的network中可以看到，目前这里修改的bug就是同样的文件只会上传一次， 也不影响多个文件上传
