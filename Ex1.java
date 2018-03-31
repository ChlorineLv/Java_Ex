/**
 * 二分法求函数零点
 * 
 * 函数
 * $$ f(x) = x^3 -10 x + 23 $$
 * 初始值
 * $x_{low} = -10.0$
 * $x_{high} = 5.0$
 * $\delta = 0.001$
 * 
 */

package priv.Dichotomie;

public class Dichotomie {
	public static void main (String[] args) {
		double a = -10.0;
		double b = 5.0;
		double c = 0.0;
		c = (a+b)/2;
		while(Math.abs(c*c*c-10*c+23 - 0) > 0.0005){  //判断是否零点
			if((c*c*c-10*c+23 - 0) > 0) {             //在零点右边
				b = c;
				c = (a+b)/2;
			}
			else if((c*c*c-10*c+23 - 0) < 0){         //在零点左边
				a = c;
				c = (a+b)/2;
			}
		}
		System.out.println(c);
	}
}
