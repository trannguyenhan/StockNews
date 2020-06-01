/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl;

import hotro.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author admin
 */
//String value0String, String value1String, String value2String
public class BTL {
    public void BaiTapLon(/*String valueString*/) throws IOException {
        ReadFile rfVNINDEX = new ReadFile();
        ReadFile rfUPCOMINDEX = new ReadFile();
        ReadFile rfHNXINDEX = new ReadFile();
        ReadFile topInc = new ReadFile();
        ReadFile topDec = new ReadFile();
        ReadFile topKLGD = new ReadFile();
        ReadFile stock = new ReadFile();
        
        topInc.readShortFileExcel("E:\\[JAVA]NetBeans\\BTL\\src\\btl\\top10.xlsx",0);
        topDec.readShortFileExcel("E:\\[JAVA]NetBeans\\BTL\\src\\btl\\top10.xlsx",1);
        topKLGD.readShortFileExcel("E:\\[JAVA]NetBeans\\BTL\\src\\btl\\top10.xlsx",2);
        stock.readColumnsExcel("E:\\[JAVA]NetBeans\\BTL\\src\\btl\\HOSE.xlsx");
        
        rfVNINDEX.readFileExcel("E:\\[JAVA]NetBeans\\BTL\\src\\btl\\3-STOCK-INDEX.xlsx",0);
        rfUPCOMINDEX.readFileExcel("E:\\[JAVA]NetBeans\\BTL\\src\\btl\\3-STOCK-INDEX.xlsx",1);
        rfHNXINDEX.readFileExcel("E:\\[JAVA]NetBeans\\BTL\\src\\btl\\3-STOCK-INDEX.xlsx",2);
        
//        rfVNINDEX.readFileExcel(value0String);
//        rfUPCOMINDEX.readFileExcel(value1String);
//        rfHNXINDEX.readFileExcel(value2String);
        
        
        // File dau ra 
        PrintWriter printWriter = new PrintWriter("ketqua.txt");
        
        // Nhom 5-0
        for(int i=0; i<rfVNINDEX.totalRow; i++)
        {
            Nhom5_0 nhom5_0 = new Nhom5_0(rfVNINDEX.list[i],rfUPCOMINDEX.list[i],rfHNXINDEX.list[i]);
            nhom5_0.printResult(printWriter);
        }
        
        // Nhom 5-1
        for(int i=0; i<rfUPCOMINDEX.totalRow; i++)
        {
            Nhom5_1 nhom5_1 = new Nhom5_1(rfVNINDEX.list[i], rfUPCOMINDEX.list[i], rfHNXINDEX.list[i]);
            nhom5_1.printResult(printWriter);
        }
        
        // Nhom 5-2
        for(int i=0; i<rfUPCOMINDEX.totalRow; i++)
        {
            Nhom5_2 nhom5_2 = new Nhom5_2(rfVNINDEX.list[i], rfUPCOMINDEX.list[i], rfHNXINDEX.list[i]);
            nhom5_2.printResult(printWriter);
        }
        
        // Nhom 5-3
        for(int i=0; i<rfHNXINDEX.totalRow; i++)
        {
            Nhom5_3 nhom5_3 = new Nhom5_3(rfVNINDEX.list[i], rfUPCOMINDEX.list[i], rfHNXINDEX.list[i]);
            nhom5_3.printResult(printWriter);
        }
        
        // Nhom 5-4
        for(int i=0; i<rfHNXINDEX.totalRow; i++)
        {
            Nhom5_4 nhom5_4 = new Nhom5_4(rfVNINDEX.list[i], rfUPCOMINDEX.list[i], rfHNXINDEX.list[i]);
            nhom5_4.printResult(printWriter);
        }
        
        // Nhom 5-5
        for(int i=0; i<rfHNXINDEX.totalRow; i++)
        {
            Nhom5_5 nhom5_5 = new Nhom5_5(rfVNINDEX.list[i], rfUPCOMINDEX.list[i], rfHNXINDEX.list[i]);
            nhom5_5.printResult(printWriter);
        }
        
        // Nhom 5-6
        Nhom5_6 nhom5_6 = new Nhom5_6(rfVNINDEX.list, rfUPCOMINDEX.list, rfHNXINDEX.list, rfVNINDEX.totalRow);
        nhom5_6.printResult(printWriter);
        
        // Nhom 5-7
        Nhom5_7 nhom5_7 = new Nhom5_7(rfVNINDEX.list, rfUPCOMINDEX.list, rfHNXINDEX.list, rfVNINDEX.totalRow);
        nhom5_7.printResult(printWriter);
        
        // Nhom5-8
        for(int i=0; i<rfHNXINDEX.totalRow; i++)
        {
            Nhom5_8 nhom5_8 = new Nhom5_8(rfVNINDEX.list[i], rfUPCOMINDEX.list[i], rfHNXINDEX.list[i]);
            nhom5_8.printResult(printWriter);
        }
        
        // Nhom6-0
        Nhom6_0 nhom6_0 = new Nhom6_0(stock.list[0]);
        nhom6_0.printResult(printWriter);
        
        // Nhom6-1
        Nhom6_1 nhom6_1 = new Nhom6_1(topInc.list[0], topDec.list[0], topKLGD.list[0]);
        nhom6_1.printResult(printWriter);
        
        // Dong file sau khi ket thuc in tat ca cac nhom
        printWriter.close();
        
    }
    
//    public void thunghiem() throws FileNotFoundException, IOException {
//        ReadFile topInc = new ReadFile();
//        ReadFile topDec = new ReadFile();
//        ReadFile topKLGD = new ReadFile();
//        ReadFile stock = new ReadFile();
//        PrintWriter printWriter = new PrintWriter("test.txt");
//        
//        topInc.readShortFileExcel("E:\\[JAVA]NetBeans\\BTL\\src\\btl\\top10.xlsx",0);
//        topDec.readShortFileExcel("E:\\[JAVA]NetBeans\\BTL\\src\\btl\\top10.xlsx",1);
//        topKLGD.readShortFileExcel("E:\\[JAVA]NetBeans\\BTL\\src\\btl\\top10.xlsx",2);
//        stock.readColumnsExcel("E:\\[JAVA]NetBeans\\BTL\\src\\btl\\HOSE.xlsx");
//        
//        Nhom6_1 nhom6_1 = new Nhom6_1(topInc.list[0], topDec.list[0], topKLGD.list[0]);
//        nhom6_1.printResult(printWriter);
//        
//        printWriter.close();
//    }
}
