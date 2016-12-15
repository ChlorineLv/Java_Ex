package priv.LinearRegression;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class LinearRegression {
	public static double Aaverage(double A[]){
		int temp_length = A.length;
		double temp = 0.0;
		for(int i = 0; i < temp_length; i++){
			temp += A[i];
		}
		return temp/temp_length;
	}
	
	public static double sumMulti(double A[], double B[]){
		double temp = 0;
		for(int i = 0; i < A.length; i++){
			temp += A[i]*B[i];
		}
		return temp;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		int n = 2;
		while((n--) > 0){		
			switch(n){
				case 1:{
					double x[] = new double [300];
					double y[] = new double [300];
					int j = 0, k = 0; 
					try{
						File file = new File("D:\\JavaDev\\workspace\\Java_tutorial-master\\Experiments\\LR_ex0.txt");
						FileReader fr = new FileReader(file);
						BufferedReader br = new BufferedReader(fr);
						String Line;
						while((Line = br.readLine()) != null){
							String[]arrs = Line.split("\t");
							double[]arr = new double[arrs.length];
							for(int i = 0; i < arrs.length; i++) {
								arr[i] = Double.parseDouble(arrs[i]);
							}
							x[j++] = arr[1];
							y[k++] = arr[2];
						}br.close();
					
						double a = 0, b = 0;
						b = ((sumMulti(x, y) - x.length*x.length*Aaverage(x)*Aaverage(y)) 
								/ (sumMulti(x,x) - x.length*x.length*Aaverage(x)*Aaverage(x)));
						a = Aaverage(y) - b*Aaverage(x);
						System.out.println("LR_ex0.txt的线性回归函数特征 b = " + b + "\t" + "a = " + a);
					}catch(FileNotFoundException e){
						e.printStackTrace();
					}
				}
				
				case 2:{
					double x[] = new double [300];
					double y[] = new double [300];
					int j = 0, k = 0; 
					try{
						File file = new File("D:\\JavaDev\\workspace\\Java_tutorial-master\\Experiments\\LR_ex1.txt");
						FileReader fr = new FileReader(file);
						BufferedReader br = new BufferedReader(fr);
						String Line;
						while((Line = br.readLine()) != null){
							String[]arrs = Line.split("\t");
							double[]arr = new double[arrs.length];
							for(int i = 0; i < arrs.length; i++) {
								arr[i] = Double.parseDouble(arrs[i]);
							}
							x[j++] = arr[1];
							y[k++] = arr[2];
						}br.close();
					
						double a = 0, b = 0;
						b = ((sumMulti(x, y) - x.length*x.length*Aaverage(x)*Aaverage(y)) 
								/ (sumMulti(x,x) - x.length*x.length*Aaverage(x)*Aaverage(x)));
						a = Aaverage(y) - b*Aaverage(x);
						System.out.println("LR_ex1.txt的线性回归函数特征 b = " + b + "\t" + "a = " + a);
					}catch(FileNotFoundException e){
						e.printStackTrace();
					}
				}
			}
		}
	}
}




