package com.ehi.thumbnailator;

import net.coobird.thumbnailator.Thumbnails;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * ClassName: ThumTest
 *
 * @Author: WangYiHai
 * @Date: 2020/4/14 10:28
 * @Description: TODO
 */
public class ThumbnailImage {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\图片测试\\ada.png";
        File file = new File(filePath);

        //1）指定大小进行缩放
        Thumbnails.of(filePath)
                .size(200, 300)
                .toFile(file.getAbsolutePath() + "_200x300.jpg");

        //2）按照比例进行缩放
        Thumbnails.of(filePath)
                .scale(0.25f)
                .toFile(file.getAbsolutePath() + "_25%.jpg");

        //3）不按比例，指定大小进行缩放
        Thumbnails.of(filePath)
                .size(200, 200)
                .keepAspectRatio(false)
                .toFile(file.getAbsolutePath() + "_200x200.jpg");

        //4）输出图片到流对象
        OutputStream os = new FileOutputStream(file.getAbsolutePath() + "_OutputStream.png");
        Thumbnails.of(filePath)
                .size(1280, 1024)
                .toOutputStream(os);

        //5）输出图片到BufferedImage
        BufferedImage thumbnail = Thumbnails.of(filePath)
                .size(1280, 1024)
                .asBufferedImage();
        ImageIO.write(thumbnail, "jpg", new File(file.getAbsolutePath()+"_BufferedImage.jpg"));
    }

}