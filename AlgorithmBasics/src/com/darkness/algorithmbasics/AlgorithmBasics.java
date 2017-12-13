package com.darkness.algorithmbasics;

/**
 * @author tranguyenvan
 * @email dkdarknessnvt@gmail.com
 * @version 1.0.0
 * @since 1.0.0
 */
public class AlgorithmBasics {
	/**
	 * Tìm số chính phương. Số chính phương hay còn gọi là số hình vuông là số tự nhiên có căn bậc 2 là một số tự nhiên
	 * 
	 * Đặc điểm: 
	 * Số chính phương không bao giờ tận cùng là 2, 3, 7, 8, chỉ có chữ số tận cùng là 0, 1, 4, 5, 6, 9. 
	 * Khi phân tích một số chính phương ra thừa số nguyên tố ta được các thừa số là lũy thừa của số nguyên tố với số mũ chẵn.
	 * Số chính phương chia cho 4 hoặc 3 không bao giờ có số dư là 2; số chính phương lẻ khi chia 8 luôn dư 1.
	 * Công thức để tính hiệu của hai số chính phương: a^2-b^2=(a+b)(a-b).
	 * Số ước nguyên dương của số chính phương là một số lẻ. 
	 * Số chính phương chia hết cho số nguyên tố p thì chia hết cho p^2.
	 * Tất cả các số chính phương có thể viết thành dãy tổng của các số lẻ tăng dần từ 1: 1, 1 + 3, 1 + 3 + 5, 1 + 3 + 5 +7, 1 + 3 + 5 +7 +9 v.v...
	 */
	public boolean IsSquareNumber(int number) {
		int tmp = 0;
		while (tmp * tmp < number) ++tmp;
		return (tmp*tmp == number);
	}
	
	
}
