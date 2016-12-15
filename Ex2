/**
 * 实验2：求$10,000,000$内最大的素数
 * 
 */

package priv.prime_number;

public class prime_number {
	public static void main(String[] args) {
		int m, n;// 变量n为要判断的数字
        System.out.println("10000000以内的素数有：");
        A: for (n = 10000000; n >= 2; n--) {//反向寻找素数
            for (m = n/2; m >= 2; m--) {
                if (n % m == 0)
                    continue A;// 如果能被整除则变量n肯定不是素数，跳出内层循环
            }
            break;//一旦找到素数，立即跳出循环
        }
        System.out.print(n);//输出第一个素数
    }

}
