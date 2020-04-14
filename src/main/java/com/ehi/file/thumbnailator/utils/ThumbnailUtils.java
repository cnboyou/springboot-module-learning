package com.ehi.file.thumbnailator.utils;

import net.coobird.thumbnailator.Thumbnails;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * ClassName: ThumbnailatorUtils
 *
 * @Author: WangYiHai
 * @Date: 2020/4/14 10:46
 * @Description: 图片压缩工具类
 */
public class ThumbnailUtils {

    /**
     * 指定大小进行缩放
     * @param filePath
     * @param length
     * @param width
     * @param keepAspectRatio   是否按比例缩放，默认true
     * @throws IOException
     */
    public static void thumbnailBySize(String filePath,int length, int width, boolean keepAspectRatio) throws IOException {
        File file = new File(filePath);
        //1）指定大小进行缩放
        Thumbnails.of(filePath)
                .size(200, 300)
                .keepAspectRatio(keepAspectRatio)
                .toFile(file.getAbsolutePath() + "_200x300.jpg");
    }

    /**
     * 按照比例进行缩放
     * @param filePath
     * @param scaleNum
     * @throws IOException
     */
    public static void thumbnailByScale(String filePath,float scaleNum) throws IOException {
        File file = new File(filePath);
        Thumbnails.of(filePath)
                .scale(scaleNum)
                .toFile(file.getAbsolutePath() + "_25%.jpg");
    }

    /**
     * 输出图片到流对象
     * @param filePath
     * @param length
     * @param width
     * @throws IOException
     */
    public static void thumbnailToOutputStream(String filePath,int length, int width) throws IOException {
        File file = new File(filePath);
        OutputStream os = new FileOutputStream(file.getAbsolutePath() + "_OutputStream.png");
        Thumbnails.of(filePath)
                .size(1280, 1024)
                .toOutputStream(os);

    }

    /**
     * 输出图片到BufferedImage
     * @param filePath
     * @param length
     * @param width
     * @throws IOException
     */
    public static void thumbnailAsBufferedImage(String filePath,int length, int width) throws IOException {
        File file = new File(filePath);
        BufferedImage thumbnail = Thumbnails.of(filePath)
                .size(1280, 1024)
                .asBufferedImage();
        ImageIO.write(thumbnail, "jpg", new File(file.getAbsolutePath()+"_BufferedImage.jpg"));

    }
}