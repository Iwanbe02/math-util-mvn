/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.Iwanbe02.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.iwanbe02.mathutil.core.MathUtility;

/**
 *
 * @author caoto
 */
public class MathUtilityTest {
    
    @Test
    public void testFactorialGivenRightArgumentReturnWells() {
        //assertEquals(69, 69);
        assertEquals(1, MathUtility.getFactorial(1));
    }
    
}

//HỌC KĨ THUẬT KIỂ THỬ CHO DÂN DEV - KĨ THUẬT DDE
//DATA DRIVEN TESTING - BỔ TRỢ CHO VIỆC XÀI UNIT TEST
//GIÚP CÁC TEST CASE DỄ ĐỌC HƠN, DỄ BẢO TRÌ HƠN
//PHẦN MỞ RỘNG THÊM CỦA TDD
//LÀ KĨ THUẬT VIẾT CODE KIỂM THỬ MÀ TÁCH BỘ DATA KIỂM THỬ
//RA KHỎI CÂU LỆNH assertEquals() CHO DỄ KIỂM SOÁT TEST CASE
//DDT LÀ PHẦN MỞ RỘNG THÊM CHO TDD TỨC LÀ GIÚP CHO CODE TEST (UNIT TEST)
//TRỞ NÊN DỄ DÀNG ĐỌC, BẢO TRÌ, DẼ DÀNG PHÁT HIỆN THIẾU TEST CASE

//DDT TÁCH DATA KIỂM THỬ RA 1 CHỖ RIÊNG, THƯỜNG LÀ MẢNG 2 CHIỀU
//CÓ NHIỀU CỘT, CÁC CỘT CHÍNH LÀ DATA ĐƯA VÀO EXPECTED
//VÀ TA CẦN CÓ NHIỀU DÒNG NHƯ THẾ, ỨNG VỚI CÁC TEST CASE

//VÀ MẢNG 2 CHIỀU NÀY FILL/ĐỔ TỪ TỪ VÀO TRONG HÀM ASERTEQUALS()
//KĨ THUẬT TÁCH DATA TEST RIÊNG RA 1 CHỖ GỌI LÀ DDT
//DATA DRIVEN TESTING - VIẾT CODE TEST HƯỚNG VỀ VIỆC TÁCH DATA

//DATA ĐC ĐƯA VÀO TRỜ LẠI QUA CÁC HÀM SỐ/BIẾN ĐẠI DIỆN
//NÊN DDT CÒN GỌI LÀ: PARAMETERIZED TESTING
//THAM SỐ HÓA CÁI DATA TEST, BIẾN DATA 


//TDD: TEST DRIVEN DEVELOPMENT

