@Controller
@RequestMapping("/rest/andot/createUploadFileController")
public class CreateUploadFileController {

  @RequestMapping("/savePicTask")
    @ResponseBody
    public String saveTask(HttpServletResponse response,HttpServletRequest request) throws SQLException, Exception
    {	
      //对上传的图片进行处理		
      response.setCharacterEncoding("text/html;charset=UTF-8");
      response.setCharacterEncoding("UTF-8");
                  String savePath =  request.getSession().getServletContext().getRealPath("/")+"upload\\";
                  JSONObject json = new JSONObject();
                  String fileNames = "";

            MultipartHttpServletRequest mRequest = (MultipartHttpServletRequest) request;//request强制转换注意
           Iterator<String> fns = mRequest.getFileNames();
           while (fns.hasNext()) {
            String fn = fns.next();
            System.err.println(fn);
            List<MultipartFile> file = mRequest.getFiles(fn);
            for (MultipartFile multipartFile : file) {
            String fileName = multipartFile.getOriginalFilename();
          System.err.println(fileName);
          boolean fileSaveState = SaveAutoFormFile.saveFile(multipartFile.getInputStream(), savePath, fileName);
          if(fileSaveState)
            fileNames += "upload\\"+fileName+",";
        }
          fileNames = fileNames.substring(0, fileNames.length()-1);
      }
  }
}
