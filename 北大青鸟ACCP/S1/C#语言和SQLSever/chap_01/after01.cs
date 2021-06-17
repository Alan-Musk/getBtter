using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

//编写你最喜欢的笔记本式计算机的三项信息
namespace Library{
    class Program
    {
        public static void Main(string[] args)
        {
            string name = "Macbook Pro";//名称
            double size = 16.0;//尺寸
            string heavy = "1kg";//重量

            Console.WriteLine("加号");
            Console.WriteLine("最喜欢的笔记本电脑的名称:"+name+"尺寸:"+size+"重量:"+heavy);
            Console.WriteLine("字符串");
            Console.WriteLine("最喜欢的笔记本电脑的名称:{0},尺寸:{1},重量:{2}",name,size,heavy);
        }
    }
}