using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace OutputName
{
    class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("请输入名字");
            string name = Console.ReadLine();
            Console.WriteLine(name+",您好!");
            Console.WriteLine("请输入年龄:");
            int age = int.Parse(Console.ReadLine());
            Console.WriteLine("学员姓名:{0},年龄:{1}",name,age);
            Console.ReadLine();
        }
    }
}