package ch06;
/**
 * Fibonacci����ʵ�֣�
 * 	���еĵ�һ��Ϊ0���ڶ���Ϊ1����n��Ϊn-1���n-2��
 * @author liuyu
 *
 */
public class Fibonacci {
	public static int getNumber(int n) {
		if(n == 1) {
			return 0;
		} else if(n == 2){
			return 1;
		} else {
			return getNumber(n - 1) + getNumber(n - 2);
		}
	}
}
