using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace HelloWorld{
    class Program
    {
        static void Main(string[] args)
        {
            int dayMax = 7;//每周的天数
            int today = 1;//今天的星期数
            Console.WriteLine("一周有几天");
            Console.WriteLine(dayMax);
            Console.WriteLine("今天是周:");
            dayMax = dayMax + 1;
            Console.WriteLine(dayMax);

        }
    }
}