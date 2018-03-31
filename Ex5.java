package priv.CountStudentsScore;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class CountScore {
	public static void main(String[] args) throws IOException{
		try{
			int[] score = new int[100];
			int temp = 0, stu60 = 0, stu70 = 0, stu80 = 0, stu90 = 0;
			File file = new File(".\\score.csv");
			FileReader fr = new FileReader (file);
			BufferedReader br = new BufferedReader(fr);
			String Line = null;
			while((Line = br.readLine()) != null){
				String[]arrs = Line.split(";");
				int[]arr = new int[arrs.length];
				for(int i = 1; i < arrs.length; i++){
					arr[i] = Integer.parseInt(arrs[i]);
				}
				score[temp++] = arr[1];
			}br.close();
			
			int[] scoreSorted = new int[temp];
			for(int i = 0; i < temp; i++){
				scoreSorted[i] = score[i];
				if(score[i] <= 69) stu60++;
				else {
					if(score[i] <= 79) stu70++;
					else {
						if(score[i] <= 89) stu80++;
						else stu90++;
					}
				}		
			}
			Arrays.sort(scoreSorted);
			
			for(int i = 0; i < temp; i++){
				System.out.println((i+1) + ";" + scoreSorted[i]);
			}
			System.out.println("学生成绩分布情况：" + "\n" + "60~69分数段学生人数：" + stu60);
			System.out.println("70~79分数段学生人数：" + stu70);
			System.out.println("80~89分数段学生人数：" + stu80);
			System.out.println("90~100分数段学生人数：" + stu90);
			
			FileWriter fw = new FileWriter(".\\scoreSorted.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("学生成绩分布情况：");bw.newLine();
			bw.write("60~69分数段学生人数：" + stu60 + "\n\r");bw.newLine();
			bw.write("70~79分数段学生人数：" + stu70 + "\n\r");bw.newLine();
			bw.write("80~89分数段学生人数：" + stu80 + "\n\r");bw.newLine();
			bw.write("90~100分数段学生人数：" + stu90 + "\n\r");bw.newLine();
			bw.close();
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}

	
}
