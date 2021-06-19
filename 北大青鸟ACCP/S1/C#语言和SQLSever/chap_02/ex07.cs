using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace HelloACCP
{
    class Program
    {
        public static void Main(string[] args)
        {
            //输入提示
            Console.WriteLine("请输入一个字符串:");
            //从控制台读入字符串
            string line = Console.ReadLine();
            //循环输出字符串中的字符
            foreach (char c in line)
            {
                Console.WriteLine(c);
            }
            Console.ReadLine();
        }
    }
}