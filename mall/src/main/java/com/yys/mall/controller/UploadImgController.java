package com.yys.mall.controller;

import com.yys.mall.utils.ImgCutUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("sys/uploadImg")
public class UploadImgController {


    @Value("${pathDir}")
    private String pathDir;



    @RequestMapping(value = "banner",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public Map uploadImg(@RequestParam(value="file",required=false) MultipartFile file, HttpServletRequest request, HttpServletResponse response){
        String prefix="";
        String dateStr="";
        String monthStr=String.valueOf((int)((Math.random()*9+1)*100000));
        //保存上传
        OutputStream out = null;
        InputStream fileInput=null;
        try{
            if(file!=null){
                String originalName = file.getOriginalFilename();
                prefix=originalName.substring(originalName.lastIndexOf(".")+1);
                dateStr = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
                String filepath = pathDir +File.separator +dateStr+"_"+monthStr + "." + prefix;
                File files=new File(filepath);
                //打印查看上传路径
                System.out.println(filepath);
                if(!files.getParentFile().exists()){
                    files.getParentFile().mkdirs();
                }
                file.transferTo(files);
            }
        }catch (Exception e){
        }finally{
            try {
                if(out!=null){
                    out.close();
                }
                if(fileInput!=null){
                    fileInput.close();
                }
            } catch (IOException e) {
            }
        }
        Map<String,Object> map2=new HashMap<>();
        Map<String,Object> map=new HashMap<>();
        System.out.println(request.getRequestURI());
        System.out.println(request.getRequestURL());
        map.put("code",0);
        map.put("msg","");
        map.put("data",map2);
        map2.put("src",(File.separator+"sys"+File.separator+"uploadImg"+File.separator +"downLoadBanner"+File.separator + dateStr+"_"+monthStr + "." + prefix).replace("\\", "/"));
        return map;
    }


    @RequestMapping(value = "bannerCut",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public Map uploadImgCut(@RequestParam(value="file",required=false) MultipartFile file, HttpServletRequest request, HttpServletResponse response){
        String prefix="";
        String dateStr="";
        String monthStr=String.valueOf((int)((Math.random()*9+1)*100000));
        //保存上传
        OutputStream out = null;
        InputStream fileInput=null;
        try{
            if(file!=null){
                String originalName = file.getOriginalFilename();
                prefix=originalName.substring(originalName.lastIndexOf(".")+1);
                dateStr = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
                String filepath = pathDir +File.separator +dateStr+"_"+monthStr + "." + prefix;
                File files=new File(filepath);
                //打印查看上传路径
                System.out.println(filepath);
                if(!files.getParentFile().exists()){
                    files.getParentFile().mkdirs();
                }
                file.transferTo(files);

                String filePathOld=filepath;
                dateStr = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
                String filepathNew = pathDir +File.separator +dateStr+"_"+monthStr + "." + prefix;

                ImgCutUtil.cut(filePathOld,filepathNew,0 ,0 , 677,451 );
            }
        }catch (Exception e){
        }finally{
            try {
                if(out!=null){
                    out.close();
                }
                if(fileInput!=null){
                    fileInput.close();
                }
            } catch (IOException e) {
            }
        }
        Map<String,Object> map2=new HashMap<>();
        Map<String,Object> map=new HashMap<>();
        System.out.println(request.getRequestURI());
        System.out.println(request.getRequestURL());
        map.put("code",0);
        map.put("msg","");
        map.put("data",map2);
        map2.put("src",(File.separator+"sys"+File.separator+"uploadImg"+File.separator +"downLoadBanner"+File.separator + dateStr+"_"+monthStr + "." + prefix).replace("\\", "/"));
        return map;
    }

    @RequestMapping(value = "downLoadBanner/{img}",method = {RequestMethod.GET,RequestMethod.POST})
    public void downLoadBanner(@PathVariable("img") String img, HttpServletRequest request, HttpServletResponse response){
        OutputStream os = null;
        try {
            BufferedImage image = ImageIO.read(new FileInputStream(new File(pathDir +File.separator +img)));
            response.setContentType("image/png");
            os = response.getOutputStream();

            if (image != null) {
                ImageIO.write(image, img.substring(img.lastIndexOf(".")+1), os);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    @RequestMapping(value = "bannerVideo",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public Map bannerVideo(@RequestParam(value="file",required=false) MultipartFile file, HttpServletRequest request, HttpServletResponse response){
        String prefix="";
        String dateStr="";
        String monthStr=String.valueOf((int)((Math.random()*9+1)*100000));
        //保存上传
        OutputStream out = null;
        InputStream fileInput=null;
        try{
            if(file!=null){
                String originalName = file.getOriginalFilename();
                prefix=originalName.substring(originalName.lastIndexOf(".")+1);
                dateStr = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
                String filepath = pathDir +File.separator +dateStr+"_"+monthStr + "." + prefix;
                File files=new File(filepath);
                //打印查看上传路径
                System.out.println(filepath);
                if(!files.getParentFile().exists()){
                    files.getParentFile().mkdirs();
                }
                file.transferTo(files);
            }
        }catch (Exception e){
        }finally{
            try {
                if(out!=null){
                    out.close();
                }
                if(fileInput!=null){
                    fileInput.close();
                }
            } catch (IOException e) {
            }
        }
        Map<String,Object> map2=new HashMap<>();
        Map<String,Object> map=new HashMap<>();
        System.out.println(request.getRequestURI());
        System.out.println(request.getRequestURL());
        map.put("code",0);
        map.put("msg","");
        map.put("data",map2);
        map2.put("src",(File.separator+"sys"+File.separator+"uploadImg"+File.separator +"downLoadBannerVideo"+File.separator + dateStr+"_"+monthStr + "." + prefix).replace("\\", "/"));
        return map;
    }


    @RequestMapping(value = "downLoadBannerVideo/{img}",method = {RequestMethod.GET,RequestMethod.POST})
    public void downLoadBannerVideo(@PathVariable("img") String img, HttpServletRequest request, HttpServletResponse response) throws Exception{

        // 配置文件下载
        response.setHeader("content-type", "application/octet-stream");
        response.setContentType("application/octet-stream");
        // 下载文件能正常显示中文
        response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode("video.mp4", "UTF-8"));
        // 实现文件下载
        byte[] buffer = new byte[1024];
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        try {
            fis = new FileInputStream(new File(pathDir +File.separator +img));
            bis = new BufferedInputStream(fis);
            OutputStream os = response.getOutputStream();
            int i = bis.read(buffer);
            while (i != -1) {
                os.write(buffer, 0, i);
                i = bis.read(buffer);
            }
            System.out.println("Download  successfully!");
//            return "successfully";

        } catch (Exception e) {
            System.out.println("Download  failed!");
//            return "failed";

        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
