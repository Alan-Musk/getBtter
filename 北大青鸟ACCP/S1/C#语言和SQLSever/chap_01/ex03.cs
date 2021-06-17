using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CircleAccout{
    class Program
    {
        public static void Main(string[] args)
        {
            const double PI = 3.1415926;//定义一个常量PI
            int r = 5;
            //计算圆的周长
            double grith = 2 * PI * r;
            //计算圆的面积
            double area = PI * r * r;
            Console.WriteLine("圆的周长是:");
            Console.WriteLine(grith);
            Console.WriteLine("圆的面积是:");
            Console.WriteLine(area);
            Console.ReadLine();
        }
    }
}