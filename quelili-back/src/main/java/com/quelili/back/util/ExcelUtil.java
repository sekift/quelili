package com.quelili.back.util;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 * sekift
 * 2019-09-10
 */
public class ExcelUtil {
	// 固定高度
	private static final short SET_HEIGHT = 350;

	// 字体高度
	private static final short FONT_HEIGHT = 11;

	// 字体
	private static final String FONT_NAME = "宋体";

	// 第一步，创建一个webbook，对应一个Excel文件
	private HSSFWorkbook wb;

	private String newxls = "";

	private String xlsfile = "";

	private HSSFSheet sheet;

	private HSSFRow fristRow;

	private HSSFCellStyle style;

	public ExcelUtil() {
	}

	public ExcelUtil newInstance(String xlsname) {
		ExcelUtil ExcelUtil = new ExcelUtil();
		ExcelUtil.setWb(new HSSFWorkbook());
		ExcelUtil.setXlsfile(xlsname);
		ExcelUtil.setSheet(ExcelUtil.getWb()
				.createSheet(ExcelUtil.getXlsfile()));
		ExcelUtil.setFristRow(ExcelUtil.getSheet().createRow((int) 0));

		// 设置字体
		HSSFFont font = ExcelUtil.getWb().createFont();
		font.setFontHeightInPoints((short) FONT_HEIGHT); // 字体高度
		// font.setColor(HSSFFont.COLOR_RED); // 字体颜色
		font.setFontName(FONT_NAME); // 字体
		font.setBoldweight(HSSFFont.BOLDWEIGHT_NORMAL); // 宽度
		// font.setItalic(true); // 是否使用斜体
		// font.setStrikeout(true); // 是否使用划线

		ExcelUtil.setStyle(ExcelUtil.getWb().createCellStyle());
		ExcelUtil.getStyle().setAlignment(HSSFCellStyle.ALIGN_LEFT);
		ExcelUtil.getStyle().setFont(font);
		ExcelUtil.getStyle().setWrapText(true);

		return ExcelUtil;
	}

	public HSSFSheet getSheet() {
		return sheet;
	}

	public void setSheet(HSSFSheet sheet) {
		this.sheet = sheet;
	}

	public HSSFRow getFristRow() {
		return fristRow;
	}

	public HSSFWorkbook getWb() {
		return wb;
	}

	public void setWb(HSSFWorkbook wb) {
		this.wb = wb;
	}

	public String getNewxls() {
		return newxls;
	}

	public void setNewxls(String newxls) {
		this.newxls = newxls;
	}

	public String getXlsfile() {
		return xlsfile;
	}

	public void setXlsfile(String xlsfile) {
		this.xlsfile = xlsfile;
	}

	public void getSheet(HSSFSheet sheet) {
		this.sheet = sheet;
	}

	public HSSFRow getFristRow(HSSFRow fristRow) {
		return fristRow;
	}

	/**
	 * 第一行
	 * @param mergedValue
	 * @param value
	 */
	public void setFristRow(short mergedValue, String... value) {

		HSSFCellStyle style = getWb().createCellStyle();

		// 设置Excel中的边框(表头的边框)
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);

		// 设置字体
		HSSFFont font = getWb().createFont();
		font.setFontHeightInPoints((short) FONT_HEIGHT); // 字体高度
		font.setFontName(FONT_NAME); // 字体
		style.setFont(font);

		// 设置Excel中的背景
//		style.setFillForegroundColor(HSSFColor.BLUE.index);

		CellRangeAddress region1 = new CellRangeAddress(0,0,(short)0,(short)mergedValue);
		getSheet().addMergedRegion(region1);

		for (int i = 0; i < value.length; i++) {
			HSSFCell cell = getFristRow().createCell((short) i);
			getFristRow().setHeight((short) SET_HEIGHT);//目的是想把行高设置成25px
			getSheet().autoSizeColumn((short)i); //自动调整列宽
//			getSheet().setColumnWidth((short) i,
//					(short) (value[i].length() * 1524));
			//cell.setEncoding(HSSFCell.ENCODING_UTF_16);
			cell.setCellValue(value[i]);
			cell.setCellStyle(style);
		}
	}

	/**
	 * 普通的行
	 * @param row
	 * @param value
	 */
	public void setRow(int row, String... value) {
		HSSFRow createRow = getSheet().createRow((int) row);
		for (int i = 0; i < value.length; i++) {
			HSSFCell cell = createRow.createCell((short) i);
			createRow.setHeight((short) SET_HEIGHT);//目的是想把行高设置成25px
			getSheet().autoSizeColumn((short)i); //自动调整列宽
//			 getSheet().setColumnWidth((short) i,
//			 (short) (value[i].length() * 1024));
			//cell.setEncoding(HSSFCell.ENCODING_UTF_16);
			try {
				cell.setCellValue(Double.valueOf(value[i]));
			} catch (Exception e) {
				cell.setCellValue(value[i]);
			}
			cell.setCellValue(value[i]);
			cell.setCellStyle(getStyle());
		}
	}

	/**
	 * 数值的行
	 * @param row
	 * @param value
	 */
	public void setValueRow(int row, String... value) {
		HSSFRow createRow = getSheet().createRow((int) row);

		HSSFCellStyle style = getWb().createCellStyle();

		// 设置Excel中的边框
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN); //下边框
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);//左边框
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);//上边框
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);//右边框

		// 设置字体
		HSSFFont font = getWb().createFont();
		font.setFontHeightInPoints((short) FONT_HEIGHT); // 字体高度
		font.setFontName(FONT_NAME); // 字体
		style.setFont(font);

		for (int i = 0; i < value.length; i++) {
			HSSFCell cell = createRow.createCell((short) i);
			createRow.setHeight((short) SET_HEIGHT);//目的是想把行高设置成25px
			getSheet().autoSizeColumn((short)i); //自动调整列宽
//			getSheet().setColumnWidth((short) i,
//					(short) (value[i].length() * 1024));
			//cell.setEncoding(HSSFCell.ENCODING_UTF_16);
			try {
				cell.setCellValue(Double.valueOf(value[i]));
			} catch (Exception e) {
				cell.setCellValue(value[i]);
			}
			cell.setCellValue(value[i]);
			cell.setCellStyle(style);
		}
	}

	/**
	 * 合并的行
	 * @param mergedValue
	 * @param value
	 */
	public void setMergedRow(int row, short mergedValue, String... value) {
		HSSFRow createRow = getSheet().createRow((int) row);
		HSSFCellStyle style = getWb().createCellStyle();

		// 设置字体
		HSSFFont font = getWb().createFont();
		font.setFontHeightInPoints((short) FONT_HEIGHT); // 字体高度
		font.setFontName(FONT_NAME); // 字体
		style.setFont(font);

		// 设置Excel中的边框
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN); //下边框
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);//左边框
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);//上边框
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);//右边框

		// 设置Excel中的背景
		//style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		//style.setFillForegroundColor(HSSFColor.SKY_BLUE.index);

		CellRangeAddress region1 = new CellRangeAddress(row,row,(short)0, (short)mergedValue);
		getSheet().addMergedRegion(region1);

		for (int i = 0; i < value.length; i++) {
			HSSFCell cell = createRow.createCell((short) i);
			createRow.setHeight((short) SET_HEIGHT);//目的是想把行高
			getSheet().autoSizeColumn((short)i); //自动调整列宽
			cell.setCellValue(value[i]);
			cell.setCellStyle(style);
		}
	}

	/**
	 * @param list
	 */
	public void setRow(ArrayList<ArrayList<String>> list) {

		for (int i = 0; i < list.size(); i++) {
			HSSFRow createRow = getSheet().createRow((int) i + 1);
			for (int o = 0; o < list.get(i).size(); o++) {
				HSSFCell cell = createRow.createCell((short) i);
				getSheet().autoSizeColumn((short)i); //自动调整列宽
				//cell.setEncoding(HSSFCell.ENCODING_UTF_16);
				cell.setCellValue(list.get(i).get(o));
				cell.setCellStyle(getStyle());
			}
		}

	}

	public HSSFCellStyle getStyle() {
		return style;
	}

	public void setStyle(HSSFCellStyle style) {
		this.style = style;
	}

	public void setFristRow(HSSFRow fristRow) {
		this.fristRow = fristRow;
	}

	public void save(String fileName) {
		String path = "/www/app/"+fileName+".xls";
		try {
			File file = new File(path);
			if (file.isFile()) {
				file.delete();
			}
			FileOutputStream fout = new FileOutputStream(path);
			wb.write(fout);
			fout.close();
		} catch (Exception e) {
		}
	}
}
