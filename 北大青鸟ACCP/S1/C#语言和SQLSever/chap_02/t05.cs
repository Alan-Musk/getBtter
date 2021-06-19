using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace text_05{
    class Program
    {
        public static void Main(string[] args)
        {
            int num;//交换
            int[] number= new int[6];
            Console.WriteLine("请输入6个整数");
            //向数组填充数据
            for (int i = 0; i <number.Length; i++)
            {
                Console.WriteLine("请输入第{0}个数字:",i+1);
                number[i] = int.Parse(Console.ReadLine());
            }
            //排序
            for (int i = 0; i < number.Length-1; i++)
            {
                for (int j = 0; j < number.Length-1-i; j++)
                {
                    if (number[j]<number[j+1])
                    {
                        num = number[j];
                        number[j] = number[j + 1];
                        number[j + 1] = num;
                    }
                }
            }
            //输出
            for (int i = 0; i < number.Length; i++)
            {
                Console.Write("{0}\t",number[i]);
            }
        }
    }
}