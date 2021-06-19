using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Sort{
    //演示使用二重循环实现数组的冒泡排序算法
    class Program
    {
        public static void Main(string[] args)
        {
            int[] score = new int[5];//成绩数组
            int i, j;//循环变量
            int temp;//临时变量

            //输入成绩
            Console.WriteLine("请输入5个学员的成绩:");
            for (i = 0; i < score.Length; i++)
            {
                Console.WriteLine("请输入第{0}个学员的成绩.",i+1);
                score[i] = int.Parse(Console.ReadLine());
            }

            //开始排序--使用冒泡排序
            for (i = 0; i < score.Length-1; i++)
            {
                //将最大的元素交换到最后
                for (j = 0; j < score.Length-1-i; j++)
                {
                    if (score[j]>score[j+1])
                    {
                        //交换元素
                        temp = score[j];
                        score[j] = score[j + 1];
                        score[j + 1] = temp;
                    }
                }
            }

            //排序后输出
            Console.WriteLine("排序后的成绩为:");
            for (i = 0; i < score.Length; i++)
            {
                Console.WriteLine("{0}\t",score[i]);
            }

            Console.ReadLine();
        }
    }
}