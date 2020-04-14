package com.ehi.excel.poi;

import org.apache.poi.hssf.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: CreateExel
 *
 * @Author: WangYiHai
 * @Date: 2020/4/14 10:39
 * @Description: TODO
 */
public class CreateExcel {
    public static void main(String[] args) throws IOException {
        String sheetName = "test.xls";
        //表头数据
        String[] header = {"ID", "姓名", "性别", "年龄", "地址", "分数"};

        //数据内容
        String[] student1 = {"1", "小红", "女", "23", "成都青羊区", "96"};
        String[] student2 = {"2", "小强", "男", "26", "成都金牛区", "91"};
        String[] student3 = {"3", "小明", "男", "28", "成都武侯区", "90"};
        List<String[]> datas = new ArrayList<>();

        //声明一个工作簿
        HSSFWorkbook workbook = new HSSFWorkbook();
        //生成一个表格
        HSSFSheet sheet = workbook.createSheet(sheetName);
        //设置表格列宽度为10个字节
        sheet.setDefaultColumnWidth(10);
        //创建第一行表头
        HSSFRow headrow = sheet.createRow(0);

        //遍历添加表头(下面模拟遍历学生，也是同样的操作过程)
        for (int i = 0; i < header.length; i++) {
            //创建一个单元格
            HSSFCell cell = headrow.createCell(i);
            //创建一个内容对象
            HSSFRichTextString text = new HSSFRichTextString(header[i]);
            //将内容对象的文字内容写入到单元格中
            cell.setCellValue(text);
        }

        for (int i = 0;i < datas.size(); i++) {
            HSSFRow row = sheet.createRow(i+1);
            datas.forEach(data -> {
                for (int j = 0; j < data.length; j++) {
                    HSSFCell cell = row.createCell(j);
                    HSSFRichTextString text = new HSSFRichTextString(data[j]);
                    cell.setCellValue(text);
                }
            });
        }

        FileOutputStream fos = new FileOutputStream(sheetName);
        workbook.write(fos);
        fos.flush();
        fos.close();

    }
}