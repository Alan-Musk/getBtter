using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace HelloACCP{
    //本实例用二重循环打印三角形
    class Program
    {
        public static void Main(string[] args)
        {
            //外层打印循环层数
            for (int i = 1; i <=6; i++)
            {
                //内层打印具体个数
                for (int j = 1; j <i; j++)
                {
                    Console.Write(j);
                }
                Console.WriteLine("");//换号
            }
        }
    }
}