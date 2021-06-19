using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace WeekOutPut{
    //根据星期几,判断特价菜
    class Week
    {
        //根据从控制台输入的星期几输出特价菜
        public void PrintWeek()
        {
            Console.WriteLine("请输入星期几:");
            string week = Console.ReadLine();
            switch (week)
            {
                case "一":
                case "二":
                case "三":
                    Console.WriteLine("干煸扁豆6元");
                    break;
                case "四":
                case "五":
                    Console.WriteLine("蒜蓉油麦菜4元");
                    break;
                case "六":
                case "日":
                    Console.WriteLine("口水鸡8元");
                    break;
                default:
                    Console.WriteLine("您输入的星期数不正确");
                    break;
            }
        }
    }
    class Program
    {
        public static void Main(string[] args)
        {
            Week week = new Week();
            week.PrintWeek();
        }
    }
}