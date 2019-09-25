package com.quelili.back.util;

public class ExcelUtilTest {

    public static void main(String[] args) {
        ExcelUtil e = new ExcelUtil().newInstance(new String("123"));
        e.setFristRow((short)6, "1234");//第一行表头

        int rowNum=0,totalNum=6;
        e.setRow(rowNum+=1,"");//第二行无值
        e.setRow(rowNum+=1, "A：","1","B：","2","C：","3");
        e.setRow(rowNum+=1, "D：","XXXXX","E：","XXXX","F：","xxx");
        e.setRow(rowNum+=1,"");//第五行无值
        e.setValueRow(rowNum+=1, "A","B","C","D","E","F","G");
        for (int i=1; i <= totalNum; i++) {
            e.setValueRow(rowNum + i, "埃菲尔", "一dsfwefawfew绯闻绯闻啊", "一你说你喜欢的", "一灾在样在关"+i);
        }
        rowNum+= totalNum;
        e.setMergedRow(rowNum+=1, (short)2, "", "D：","","F：","","G：","");

        e.save("表格");
        System.out.println(e.getXlsfile());
    }
}
