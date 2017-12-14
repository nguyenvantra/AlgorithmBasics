package com.darkness.algorithmbasics;

import java.util.ArrayList;
import java.util.List;

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
	public boolean isSquareNumber(int number) {
		int tmp = 0;
		while (tmp * tmp < number)
			++tmp;
		return (tmp * tmp == number);
	}

	/**
	 * Số nguyên tố là số tự nhiên chỉ có hai ước số dương phân biệt là 1 và chính
	 * nó
	 */
	public boolean isPrimeNumber(int number) {
		if (number < 2)
			return false;
		for (int i = 2; i <= Math.sqrt((float) number); i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	/**
	 * Liệt kê danh sách số nguyên tố < n cho trước
	 */
	public List<Integer> getListPrimeNumber(int number) {
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < number; i++) {
			if (isPrimeNumber(i))
				result.add(i);
		}

		return result;
	}
	
	/**
	 * Trong toán học, nếu số nguyên a chia hết cho số nguyên b thì số b được gọi là ước của số nguyên a, a được gọi là bội của b
	 */
	public int GCD(int number1, int number2) {
		number1 = Math.abs(number1);
		number2 = Math.abs(number2);
		
		if(number1==0 || number2 ==0) return number1 + number2;
		while(number1 != number2) {
			if(number1 > number2)
				number1 = number1 - number2;
			else 
				number2 = number2 - number1;
		}
		return number1;
	}
	
	/**
	 * Bội chung nhỏ nhất
	 */
	public int LCM(int number1, int number2) {
		if(number1 == 0 || number2 == 0) return -1;
		return (Math.abs(number1 * number2) / GCD(number1, number2) );
	}

}
